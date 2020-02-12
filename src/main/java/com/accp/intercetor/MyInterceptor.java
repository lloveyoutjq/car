package com.accp.intercetor;

import com.accp.controller.FilesUploadController;
import com.accp.controller.SystemController;
import com.accp.entity.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * 拦截登录
 * @author JiaQingTan
 */
public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //response.addHeader("Access-Control-Allow-Origin", "*");//解决跨域问题的方法之一，但有弊端
        //return true;
        response.setContentType("text/html;charset=utf-8");
        if(handler instanceof HandlerMethod) {
            HandlerMethod method = (HandlerMethod) handler;
            System.out.println(method);
            if(method.getBean() instanceof SystemController) {
                if(request.getRequestURI().indexOf("/system/login") != -1){
                    return true;
                }
            }
        }

        if(request.getRequestURI().indexOf("filesUpload") != -1 || request.getRequestURI().indexOf(".") != -1){
            return true;
        }

        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");

        System.out.println(session.getId()+"拦截器");
        if(user != null) {
            System.out.println("进入已登录。。。");
            return true;
        }
        System.out.println("--------没登陆---------");

        String callback = request.getParameter("callback");
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String,Object> code = new HashMap<>();
        code.put("msg","对不起 您还没登录 请重新登录");
        String data = objectMapper.writeValueAsString(code);
        callback = callback + "("+data+")";
        response.getWriter().print(callback);
        return false;
    }
}
