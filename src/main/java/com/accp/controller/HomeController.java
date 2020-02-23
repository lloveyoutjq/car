package com.accp.controller;

import com.accp.entity.HomeUserList;
import com.accp.service.home.HomeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    HomeUserService homeUserService;
/*    *//**
     *查询在线人数
     * @return
     *//*
    @RequestMapping("/online")
    public Object online() {
        return  "当前在线人数：" + MyHttpSessionListener.online + "人";
    }*/
    @RequestMapping("/getUserList")
    public List<HomeUserList> getUserList(){
        return homeUserService.getUserList();
    }
}
