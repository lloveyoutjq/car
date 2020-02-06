package com.accp.controller;

import com.accp.domain.SystemRoles;
import com.accp.domain.SystemRolesPerms;
import com.accp.service.system.PermissionsControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/system")
public class SystemController {

    @Autowired(required = false)
    PermissionsControlService permissionsControlService;

    @RequestMapping("selectSystemRolesPerms")
    public Map selectSystemRolesPerms(Integer rid){
        Map<String,Object> code = new HashMap<>();
        SystemRolesPerms lists = permissionsControlService.selectSystemRolesPerms(rid);
        code.put("data",lists);
        if(lists == null){
            code.put("code","-1");
            code.put("msg","查询失败");
        }else{
            code.put("code","0");
            code.put("msg","查询成功");
        }
        return code;
    }

    @RequestMapping("selectSystemRolesAll")
    public Map selectSystemRolesAll(){
        Map<String,Object> code = new HashMap<>();
        List<SystemRoles> lists = permissionsControlService.selectSystemRolesAll();
        code.put("data",lists);
        if(lists.size() == 0){
            code.put("code","-1");
            code.put("msg","查询失败");
        }else{
            code.put("code","0");
            code.put("msg","查询成功");
        }
        return code;
    }

    @RequestMapping("login")
    public Map login(String user,String pwd){
        System.out.println("正在登陆");
        Map map = new HashMap();
        map.put("code",0);
        return map;
    }

}
