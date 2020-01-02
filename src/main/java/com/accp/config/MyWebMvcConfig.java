package com.accp.config;

import com.accp.intercetor.MyInterceptor;
import com.accp.intercetor.PermInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class MyWebMvcConfig extends WebMvcConfigurationSupport {
//	classpath:static
//	classpath:resources
//	classpath:META-INF/public
//	classpath:public
//	覆盖原有的静态资源配置，必须重新配置

    /**
     * 过滤静态资源
     * @param registry
     */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/")
                .addResourceLocations("file:/Users/tangyong/images/");
        super.addResourceHandlers(registry);
    }

    /**
     * 开放分离式
     * @param registry
     */
    @Override
    protected void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedMethods("*").allowedOrigins("*").allowedHeaders("*").allowCredentials(true);
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
}
