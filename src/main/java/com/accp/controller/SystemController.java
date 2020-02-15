package com.accp.controller;

import com.accp.domain.MaintainMaintenanceRegistration;
import com.accp.domain.SystemPermissions;
import com.accp.domain.SystemRoles;
import com.accp.domain.SystemRolesPerms;
import com.accp.entity.User;
import com.accp.service.system.ModuleManagementService;
import com.accp.service.system.PermissionsControlService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/system")
/*@CrossOrigin*/
public class SystemController {

    @Autowired(required = false)
    PermissionsControlService permissionsControlService;
    @Autowired(required = false)
    ModuleManagementService moduleManagementService;

    /**
     * 查询权限和角色对应表
     * @param rid
     * @return
     */
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

    /**
     * 查询所有角色
     * @return
     */
    @RequestMapping("selectSystemRolesAll")
    public Map selectSystemRolesAll(HttpSession session){
        System.out.println(session.getId()+"所有角色");
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

    /**
     * 登陆
     * @param user
     * @param pwd
     * @param session
     * @return
     */
    @RequestMapping("login")
    public Map login(String user, String pwd, HttpSession session){
        System.out.println("正在登陆"+session.getId());
        Map map = new HashMap();
        map.put("code",0);
        User user1 = new User();
        user1.setUser("888888888");
        session.setAttribute("user",user1);

        return map;
    }

    /**
     * 修改角色权限状态
     * @param pid
     * @param rid
     * @param state
     * @return
     */
    @RequestMapping("updatePerm")
    public Map updatePerm(Integer pid,Integer rid,Integer state){
        Map<String,Object> code = new HashMap<>();

        if(permissionsControlService.updatePerm(pid,rid,state)>0){
            code.put("code","0");
            code.put("msg","成功");
        }else{
            code.put("code","-1");
            code.put("msg","失败");
        }
        return code;
    }

    /**
     * 新增权限模块
     * @param systemPermissions
     * @return
     */
    @RequestMapping("insertPermissions")
    public Map insertPerm(SystemPermissions systemPermissions){
        Map<String,Object> code = new HashMap<>();

        if(moduleManagementService.insertPermissions(systemPermissions)>0){
            code.put("code","0");
            code.put("msg","成功");
        }else{
            code.put("code","-1");
            code.put("msg","失败");
        }
        return code;
    }

    /**
     * 根据id获取权限
     * @param id
     * @return
     */
    @RequestMapping("getPermission")
    public Map getPermission(Integer id){
        Map<String,Object> code = new HashMap<>();
        SystemPermissions  systemPermissions = moduleManagementService.getPermission(id);
        if(systemPermissions != null){
            code.put("code","0");
            code.put("data",systemPermissions);
            code.put("msg","成功");
        }else{
            code.put("code","-1");
            code.put("msg","失败");
        }
        return code;
    }

    /**
     * 根据条件查询权限
     */
    @RequestMapping("/selectPermissionsWhere")
    public Map selectPermissionsWhere(String data,Integer rid){
        ObjectMapper objectMapper = new ObjectMapper();
        SystemPermissions systemPermissions = null;
        try {
            systemPermissions = objectMapper.readValue(data,SystemPermissions.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        Map<String,Object> map = new HashMap<>();
        List<SystemPermissions> lists = moduleManagementService.selectPermissionsWhere(systemPermissions,rid);
        map.put("code",0);
        map.put("data",lists);
        return map;
    }


    /**
     *查询所有权限
     * @return
     */
    @RequestMapping("/selectPermissions")
    public Map selectPermissions(){

        Map<String,Object> map = new HashMap<>();
        Map<String,Object> code = new HashMap<>();
        List<SystemPermissions> lists = moduleManagementService.selectPermissions();
        code.put("code","200");
        code.put("message","操作成功");
        map.put("status",code);
        map.put("data",lists);
        return map;
    }




    /**
     * 修改权限
     * @param systemPermissions
     * @return
     */
    @RequestMapping("updatePermissions")
    public Map updatePermissions(SystemPermissions systemPermissions){
        Map<String,Object> code = new HashMap<>();
        if(moduleManagementService.updatePermissions(systemPermissions)>0){
            code.put("code","0");
            code.put("msg","成功");
        }else{
            code.put("code","-1");
            code.put("msg","失败");
        }
        return code;
    }

    /**
     * 删除权限
     * @param id
     * @return
     */
    @RequestMapping("deletePermissions")
    public Map deletePermissions(Integer id){
        Map<String,Object> code = new HashMap<>();
        if(moduleManagementService.deletePermissions(id)>0){
            code.put("code","0");
            code.put("msg","成功");
        }else{
            code.put("code","-1");
            code.put("msg","失败");
        }
        return code;
    }

}
