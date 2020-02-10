package com.accp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestController {

    @RequestMapping("/a")
    public String a(HttpSession session){
        System.out.println(session.getId());
        return null;
    }

    @RequestMapping("/b")
    public String b(HttpSession session){
        System.out.println(session.getId());
        return null;
    }


}
