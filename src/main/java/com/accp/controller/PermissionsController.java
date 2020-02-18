package com.accp.controller;

import com.accp.domain.SystemPermissions;
import com.accp.service.PermissionsService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @RequestMapping("/selectUserMenuById")
    public Map selectUserMenuById(Integer rid){

        Map<String,Object> map = new HashMap<>();
        Map<String,Object> code = new HashMap<>();
        List<SystemPermissions> lists = permissionsService.selectUserMenuById(rid);
        code.put("code","200");
        code.put("message","操作成功");
        map.put("status",code);
        map.put("data",lists);

        return map;
    }

    @RequestMapping("/selectUserPerm")
    public String selectUserPerm(HttpSession session,Integer uid,String callback) throws JsonProcessingException {
        System.out.println(session.getId()+"权限");
        List<SystemPermissions> lists = permissionsService.selectUserPerm(1,uid);
        ObjectMapper objectMapper = new ObjectMapper();

        Map<String,Object> code = new HashMap<>();
        String data = objectMapper.writeValueAsString(lists);

        return callback+"("+data+")";

    }


}
