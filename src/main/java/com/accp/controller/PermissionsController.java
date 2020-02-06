package com.accp.controller;

import com.accp.domain.SystemPermissions;
import com.accp.service.PermissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public List<SystemPermissions> selectUserMenuAll(Integer uid){
        return permissionsService.selectUserMenuAll(1,uid);
    }

    @RequestMapping("/selectUserPerm")
    public List<SystemPermissions> selectUserPerm(Integer uid){
        return permissionsService.selectUserPerm(1,uid);
    }
    @RequestMapping("/selectPerm")
    public Map selectPerm(Integer uid){
        Map<String,Object> map = new HashMap<>();
        Map<String,Object> code = new HashMap<>();
        List<SystemPermissions> lists = selectUserPerm(uid);
        code.put("code","200");
        code.put("message","操作成功");
        map.put("status",code);
        map.put("data",lists);
        return map;
    }

}
