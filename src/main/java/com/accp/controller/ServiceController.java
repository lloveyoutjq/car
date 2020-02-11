package com.accp.controller;

import com.accp.domain.ClientCarinfo;
import com.accp.domain.ClientClientdata;
import com.accp.domain.ClientClienttype;
import com.accp.service.service.CarArchivesService;
import com.accp.service.service.CustomerArchivesService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    CustomerArchivesService customerArchivesService;

    @Autowired
    CarArchivesService carArchivesService;

    @RequestMapping("addClient")
    public Map addClient(@RequestBody ClientClientdata clientClientdata){
        Map<String,Object> map = new HashMap<>();
        if(customerArchivesService.addClient(clientClientdata)>0){
            map.put("code","0");
            map.put("msg","成功");
        }else{
            map.put("code","-1");
            map.put("msg","失败");
        }
        //map.put("a",clientClientdata);
        return map;
    }

    @RequestMapping("updateClient")
    public Map updateClient(HttpSession session,@RequestBody ClientClientdata clientClientdata){
        System.out.println(session.getId()+"修改客户");
        Map<String,Object> map = new HashMap<>();
        if(customerArchivesService.updateClient(clientClientdata)>0){
            map.put("code","0");
            map.put("msg","成功");
        }else{
            map.put("code","-1");
            map.put("msg","失败");
        }
        return map;
    }

    @RequestMapping("selectClient")
    public Map selectClient(HttpSession session, Integer page, Integer limit){
        System.out.println(session.getId()+"查询客户");
        if(page == null){
            page = 1;
        }
        if(limit == null){
            limit = 10;
        }
        Map<String,Object> map = new HashMap<>();
        PageInfo<ClientClientdata> pageInfo =  customerArchivesService.selectClient(page,limit);
        map.put("code",0);
        map.put("data",pageInfo.getList());
        map.put("count",pageInfo.getSize());
        return map;
    }

    @RequestMapping("deleteClient")
    public Map deleteClient(Integer id){
        Map<String,Object> map = new HashMap<>();
        if(id == null){
            map.put("code","-1");
            map.put("msg","失败");
            return map;
        }
        if(customerArchivesService.deleteClient(id)>0){
            map.put("code","0");
            map.put("msg","成功");
        }else{
            map.put("code","-1");
            map.put("msg","失败");
        }
        return map;
    }

    /**
     * 查询所有客户类型
     * @return
     */
    @GetMapping("selectClientTypeAll")
    public Map selectClientTypeAll(Integer page, Integer limit){
        Map<String,Object> map = new HashMap<>();
        PageInfo<ClientClienttype> pageInfo = customerArchivesService.selectClientTypeAll(page,limit);
        map.put("code",0);
        map.put("data",pageInfo.getList());
        map.put("count",pageInfo.getSize());
        return map;
    }

    /**
     * 添加客户类型
     * @param clientClienttype
     * @return
     */
    @PostMapping("addClientType")
    public Map addClientType(ClientClienttype clientClienttype){
        Map<String,Object> map = new HashMap<>();
        int count = customerArchivesService.addClientType(clientClienttype);
        if(count > 0){
            map.put("code",0);
            map.put("msg","成功");
        }else{
            map.put("code",-1);
            map.put("msg","失败");
        }
        return map;
    }

    /**
     * 修改客户类型
     * @param clientClienttype
     * @return
     */
    @PostMapping("updateClientType")
    public Map updateClientType(ClientClienttype clientClienttype){
        Map<String,Object> map = new HashMap<>();
        int count = customerArchivesService.updateClientType(clientClienttype);
        if(count > 0){
            map.put("code",0);
            map.put("msg","成功");
        }else{
            map.put("code",-1);
            map.put("msg","失败");
        }
        return map;
    }

    /**
     * 删除客户类型
     * @param id
     * @return
     */
    @GetMapping("deleteClientType")
    public Map deleteClientType(int id){
        Map<String,Object> map = new HashMap<>();
        int count = customerArchivesService.deleteClientType(id);
        if(count > 0){
            map.put("code",0);
            map.put("msg","成功");
        }else{
            map.put("code",-1);
            map.put("msg","失败");
        }
        return map;
    }

    /****************************************添加车**************************************************/
    /**
     * 添加车
     * @param clientCarinfo
     * @return
     */
    @RequestMapping("addCar")
    public String addCar(@RequestBody  ClientCarinfo clientCarinfo,String callback) throws JsonProcessingException {
        Map<String,Object> map = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();

        int count = carArchivesService.addCar(clientCarinfo);
        if(count > 0){
            map.put("code",0);
            map.put("msg","成功");
        }else{
            map.put("code",-1);
            map.put("msg","失败");
        }
        String data = objectMapper.writeValueAsString(map);
        return callback+"("+data+")";

    }

    /**
     * 删除车
     * @param id
     * @return
     */
    @RequestMapping("deleteCar")
    public Map deleteCar(Integer id){
        Map<String,Object> map = new HashMap<>();
        int count = carArchivesService.deleteCar(id);
        if(count > 0){
            map.put("code",0);
            map.put("msg","成功");
        }else{
            map.put("code",-1);
            map.put("msg","失败");
        }
        return map;
    }

    /**
     * 修改车
     * @param clientCarinfo
     * @return
     */
    @RequestMapping("updateCar")
    public Map updateCar(ClientCarinfo clientCarinfo){
        Map<String,Object> map = new HashMap<>();
        int count = carArchivesService.updateCar(clientCarinfo);
        if(count > 0){
            map.put("code",0);
            map.put("msg","成功");
        }else{
            map.put("code",-1);
            map.put("msg","失败");
        }
        return map;

    }

    /**
     * 查询车
     * @return
     */
    @RequestMapping("selectCar")
    public Map selectCar(Integer page, Integer limit){
        Map<String,Object> map = new HashMap<>();
        PageInfo pageInfo = carArchivesService.selectCar(page, limit);
        map.put("code",0);
        map.put("data",pageInfo.getList());
        map.put("count",pageInfo.getSize());
        return map;
    }



}
