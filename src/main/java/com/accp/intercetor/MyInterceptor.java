package com.accp.intercetor;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截登录
 * @author JiaQingTan
 */
public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(handler instanceof HandlerMethod) {
            HandlerMethod method = (HandlerMethod) handler;
           /* if(method.getBean() instanceof LoginController) {
                return true;
            }*/
        }

     /*   Users user = (Users)request.getSession().getAttribute("user");
        if(user!=null) {
            return true;
        }*/
        return true;
    }
}
