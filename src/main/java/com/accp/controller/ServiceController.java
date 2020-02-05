package com.accp.controller;

import com.accp.domain.ClientClientdata;
import com.accp.service.service.CustomerArchivesService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    CustomerArchivesService customerArchivesService;

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
    public Map updateClient(@RequestBody ClientClientdata clientClientdata){
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
    public Map selectClient(Integer page,Integer limit){
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
}
