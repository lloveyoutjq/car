package com.accp.config;

import com.accp.intercetor.MyInterceptor;
import com.accp.intercetor.PermInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.*;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Configuration
public class MyWebMvcConfig extends WebMvcConfigurationSupport {
//	classpath:static
//	classpath:resources
//	classpath:META-INF/public
//	classpath:public
//	覆盖原有的静态资源配置，必须重新配置

    @Value("${pathUpload-url}")
    String pathUploadUrl;
    /**
     * 过滤静态资源
     * @param registry
     */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/")
                .addResourceLocations("file:/"+pathUploadUrl);
        super.addResourceHandlers(registry);
    }

    /**
     * 开放分离式
     * @param registry
     */
    @Override
    protected void addCorsMappings(CorsRegistry registry) {
        System.out.println("加载中。。。。");
        registry.addMapping("/**")
                .allowedMethods("*")
                .allowedOrigins("*")
                .allowedHeaders("*")
                .allowCredentials(true)
                .maxAge(30*1000);
    }

    /**
     * 过滤器
     * @param registry
     */
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(new PermInterceptor()).addPathPatterns("/**").excludePathPatterns("/login");
        super.addInterceptors(registry);
    }


/************************************************************************/

    @Bean
    public HttpMessageConverter<String> responseBodyConverter() {
        return new StringHttpMessageConverter(StandardCharsets.UTF_8);
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(responseBodyConverter());
        // 这里必须加上加载默认转换器，不然bug玩死人，并且该bug目前在网络上似乎没有解决方案
        // 百度，谷歌，各大论坛等。你可以试试去掉。
        addDefaultHttpMessageConverters(converters);
    }

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.favorPathExtension(false);
    }
}
