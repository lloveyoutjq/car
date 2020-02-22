package com.accp.controller;

import com.accp.domain.*;
import com.accp.entity.User;
import com.accp.service.MailService;
import com.accp.service.ToolService;
import com.accp.service.system.LoginService;
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
    @Autowired(required = false)
    ToolService toolService;
    @Autowired(required = false)
    MailService mailService;
    @Autowired(required = false)
    LoginService loginService;

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
     * 添加角色
     * @return
     */
    @RequestMapping("addSystemRoles")
    public Map addSystemRoles(String data){
        ObjectMapper objectMapper = new ObjectMapper();
        SystemRoles systemRoles = null;
        try {
            systemRoles = objectMapper.readValue(data,SystemRoles.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }

        Map<String,Object> code = new HashMap<>();
        int count = permissionsControlService.addSystemRoles(systemRoles);
        if(count == 0){
            code.put("code","-1");
            code.put("msg","失败");
        }else{
            code.put("code","0");
            code.put("msg","成功");
        }
        return code;
    }
    /**
     * 修改角色
     * @return
     */
    @RequestMapping("updateSystemRoles")
    public Map updateSystemRoles(String data){
        ObjectMapper objectMapper = new ObjectMapper();
        SystemRoles systemRoles = null;
        try {
            systemRoles = objectMapper.readValue(data,SystemRoles.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }

        Map<String,Object> code = new HashMap<>();
        int count = permissionsControlService.updateSystemRoles(systemRoles);
        if(count == 0){
            code.put("code","-1");
            code.put("msg","失败");
        }else{
            code.put("code","0");
            code.put("msg","成功");
        }
        return code;
    }
    /**
     * 删除角色
     * @return
     */
    @RequestMapping("deleteSystemRoles")
    public Map deleteSystemRoles(Integer id){
        Map<String,Object> code = new HashMap<>();
        int count = permissionsControlService.deleteSystemRoles(id);
        if(count == 0){
            code.put("code","-1");
            code.put("msg","失败");
        }else{
            code.put("code","0");
            code.put("msg","成功");
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
    public Map login(String user, String pwd, String type, HttpSession session){
        System.out.println("正在登陆"+session.getId());
        Map map = new HashMap();
        if(user == null || pwd == null){
            map.put("code",-1);
            map.put("msg","账号或密码不能为空");
            return map;
        }
        User userMsg = loginService.login(user,pwd,type);
        if(userMsg.getState() >0){
            map.put("code",0);
            map.put("msg","登录成功");
            session.setAttribute("user",userMsg);
        }else{
            map.put("code","-2");
            map.put("msg","登录失败");
        }
        return map;
    }

    /**
     * 登出
     */
    @RequestMapping("logOut")
    public Map logOut(HttpSession session){
        Map map = new HashMap();
        session.invalidate();
        map.put("code",0);
        map.put("msg","退出登录成功");
        return map;
    }
    /**
     * 获取登录信息
     */
    @RequestMapping("getLoginMsg")
    public Map getLoginMsg(HttpSession session){
        Map map = new HashMap();
        map.put("code",0);
        map.put("data",session.getAttribute("user"));
        return map;
    }

    /**
     * 找回密码
     */
    @RequestMapping("findPassword")
    public Map findPassword(HttpSession session,Integer type,String code,String typeYgJg,String email,String pwd){
        User u = (User)session.getAttribute("user");
        Map<String,Object> map = new HashMap<>();
        if(u != null && u.getPastCodeDate() != 0 && !"".equals(u.getCode())){
            if(type == 0){//找回密码校验
                if(!"".equals(code) && code.equals(u.getCode())){
                    if(u.getPastCodeDate() - System.currentTimeMillis() < 0){
                        map.put("code","0");
                        map.put("msg","验证成功");
                    }else{
                        map.put("code","1");
                        map.put("msg","验证码过期");
                    }
                }else{
                    map.put("code","-1");
                    map.put("msg","验证码错误");
                }
            }else if(type ==1){//找回密码
                if(!"".equals(code) && code.equals(u.getCode())){
                    if(u.getPastCodeDate() - System.currentTimeMillis() < 0){

                        int count = loginService.retrieve(email,pwd,typeYgJg); //修改密码
                        if(count>0){
                            map.put("code","0");
                            map.put("msg","成功找回");
                        }else{
                            map.put("code","-1");
                            map.put("msg","核实失败 请联系管理员找回");
                        }
                    }else{
                        map.put("code","1");
                        map.put("msg","验证码过期");
                    }
                }else{
                    map.put("code","-1");
                    map.put("msg","验证码错误");
                }
            }
        }
        return map;
    }
    /**
     *验证码发送
     */
    @RequestMapping("sendEmail")
    public Map sendEmail(HttpSession session,String emali,String typeYgJg){
        Map<String,Object> map = new HashMap<>();
        if(emali == null || "".equals(emali)){
            map.put("code","-1");
            map.put("msg","请填写邮箱");
            return map;
        }
        int count = loginService.emaliNotNull(emali,typeYgJg);
        if(count == 0){
            map.put("code","-1");
            map.put("msg","对不起 填写的邮箱不是管理员邮箱");
            return map;
        }
        StringBuffer code = new StringBuffer();
        for(int i = 0; i < 6; i++){
            code.append(toolService.nextIntNoRepeat());
        }
        String html = "<head>\n" +
                "    <base target=\"_blank\" />\n" +
                "    <style type=\"text/css\">::-webkit-scrollbar{ display: none; }</style>\n" +
                "    <style id=\"cloudAttachStyle\" type=\"text/css\">#divNeteaseBigAttach, #divNeteaseBigAttach_bak{display:none;}</style>\n" +
                "    <style id=\"blockquoteStyle\" type=\"text/css\">blockquote{display:none;}</style>\n" +
                "    <style type=\"text/css\">\n" +
                "        body{font-size:14px;font-family:arial,verdana,sans-serif;line-height:1.666;padding:0;margin:0;overflow:auto;white-space:normal;word-wrap:break-word;min-height:100px}\n" +
                "        td, input, button, select, body{font-family:Helvetica, 'Microsoft Yahei', verdana}\n" +
                "        pre {white-space:pre-wrap;white-space:-moz-pre-wrap;white-space:-pre-wrap;white-space:-o-pre-wrap;word-wrap:break-word;width:95%}\n" +
                "        th,td{font-family:arial,verdana,sans-serif;line-height:1.666}\n" +
                "        img{ border:0}\n" +
                "        header,footer,section,aside,article,nav,hgroup,figure,figcaption{display:block}\n" +
                "        blockquote{margin-right:0px}\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body tabindex=\"0\" role=\"listitem\">\n" +
                "<table width=\"700\" border=\"0\" align=\"center\" cellspacing=\"0\" style=\"width:700px;\">\n" +
                "    <tbody>\n" +
                "    <tr>\n" +
                "        <td>\n" +
                "            <div style=\"width:700px;margin:0 auto;border-bottom:1px solid #ccc;margin-bottom:30px;\">\n" +
                "                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"700\" height=\"39\" style=\"font:12px Tahoma, Arial, 宋体;\">\n" +
                "                    <tbody><tr><td width=\"210\"></td></tr></tbody>\n" +
                "                </table>\n" +
                "            </div>\n" +
                "            <div style=\"width:680px;padding:0 10px;margin:0 auto;\">\n" +
                "                <div style=\"line-height:1.5;font-size:14px;margin-bottom:25px;color:#4d4d4d;\">\n" +
                "                    <strong style=\"display:block;margin-bottom:15px;\">尊敬的用户：<span style=\"color:#f60;font-size: 16px;\"></span>您好！</strong>\n" +
                "                    <strong style=\"display:block;margin-bottom:15px;\">\n" +
                "                        您正在进行<span style=\"color: red\">找回密码</span>操作，请在验证码输入框中输入：<span style=\"color:#f60;font-size: 24px\">"+code+"</span>，以完成操作。\n" +
                "                    </strong>\n" +
                "                </div>\n" +
                "                <div style=\"margin-bottom:30px;\">\n" +
                "                    <small style=\"display:block;margin-bottom:20px;font-size:12px;\">\n" +
                "                        <p style=\"color:#747474;\">\n" +
                "                            注意：此操作可能会修改您的密码、登录邮箱或绑定手机。如非本人操作，请及时登录并修改密码以保证帐户安全\n" +
                "                            <br>（工作人员不会向你索取此验证码，请勿泄漏！)\n" +
                "                        </p>\n" +
                "                    </small>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div style=\"width:700px;margin:0 auto;\">\n" +
                "                <div style=\"padding:10px 10px 0;border-top:1px solid #ccc;color:#747474;margin-bottom:20px;line-height:1.3em;font-size:12px;\">\n" +
                "                    <p>此为系统邮件，请勿回复<br>\n" +
                "                        请保管好您的邮箱，避免账号被他人盗用\n" +
                "                    </p>\n" +
                "                    <p>伊酷网络科技团队</p>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </td>\n" +
                "    </tr>\n" +
                "    </tbody>\n" +
                "</table>\n" +
                "</body>";

        mailService.sendHtmlMail(emali,"卡修找回密码",html);
        User user = new User();
        user.setCode(code.toString());//验证码
        user.setPastCodeDate(System.currentTimeMillis() + (2 * 60));//设置过期时间
        session.setAttribute("user",user);
        System.out.println(code+"-----------");

        map.put("code","0");
        map.put("msg","发送成功");
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
