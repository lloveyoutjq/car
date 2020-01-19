package com.accp.controller;

import com.accp.domain.Permissions;
import com.accp.service.PermissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/permissions")
public class PermissionsController {

    @Autowired
    PermissionsService permissionsService;
    @RequestMapping("/a")
    public String a(){
        return "成功";
    }

    @RequestMapping("/selectUserMenuAll")
    public List<Permissions> selectUserMenuAll(Integer uid){
        return permissionsService.selectUserMenuAll(uid);
    }

    @RequestMapping("/selectUserPerm")
    public List<Permissions> selectUserPerm(Integer uid){
        return permissionsService.selectUserPerm(uid);
    }

    @RequestMapping("tjq")
    @ResponseBody
    public String tjq(){
        return "tjq";
    }
}
