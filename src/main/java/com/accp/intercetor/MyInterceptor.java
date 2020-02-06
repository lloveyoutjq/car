package com.accp.intercetor;

import com.accp.controller.SystemController;
import com.accp.entity.User;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 拦截登录
 * @author JiaQingTan
 */
public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.setContentType("text/html;charset=UTF-8");

        if(handler instanceof HandlerMethod) {
            HandlerMethod method = (HandlerMethod) handler;
            System.out.println(method);
            if(method.getBean() instanceof SystemController) {
                if(request.getRequestURI().indexOf("/system/login") != -1){
                    return true;
                }
            }
        }
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        System.out.println(session.getId());
        if(user != null) {
            return true;
        }

        //response.getWriter().print("对不起 您还没登录 请重新登录");
        return true;
    }
}
