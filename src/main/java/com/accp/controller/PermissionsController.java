package com.accp.controller;

import com.accp.domain.SystemPermissions;
import com.accp.service.PermissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/permissions")
public class PermissionsController {

    @Autowired(required = false)
    PermissionsService permissionsService;

    @RequestMapping("/a")
    public String a(){
        return "成功";
    }

    @RequestMapping("/selectUserMenuAll")
    public List<SystemPermissions> selectUserMenuAll(Integer uid){
        return permissionsService.selectUserMenuAll(1,uid);
    }

    @RequestMapping("/selectUserPerm")
    public List<SystemPermissions> selectUserPerm(Integer uid){
        return permissionsService.selectUserPerm(1,uid);
    }

}
