package com.accp.controller;

import com.accp.domain.ClientClientdata;

import com.accp.service.front.SettlementService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/front")
public class FrontController {

    @Autowired
    SettlementService settlementService;

    @RequestMapping("/bill")
    public Map<String,Object> bill(String cashierId, String carNumber, String name, String counselorName, String tname, String settlementStatus, String remark,Integer page,Integer limit){
        Map<String,Object> map = new HashMap<>();
        PageInfo pageInfo = settlementService.bill(cashierId, carNumber, name, counselorName, tname, settlementStatus, remark, page, limit);
        map.put("code",0);
        map.put("data",pageInfo.getList());
        map.put("count",pageInfo.getTotal());
        return map;
    }

    @RequestMapping("/rollback")
    public String rollback(String saleid){
        int count = settlementService.updateByPrimaryKeySelective(saleid);
        return count+"";
    }

    /**
     * 会员
     * */
    @RequestMapping("/vip")
    public Map<String,Object> vip(String id,Integer page,Integer limit){
        Map<String,Object> map = new HashMap<>();
        PageInfo pageInfo = settlementService.vip(id, page, limit);
        map.put("code",0);
        map.put("data",pageInfo.getList());
        map.put("count",pageInfo.getTotal());
        return map;
    }

    @RequestMapping("/recharge")
    public String recharge(String data){
        ObjectMapper objectMapper = new ObjectMapper();
        ClientClientdata clientClientdata = null;
        try {
            clientClientdata = objectMapper.readValue(data, ClientClientdata.class);
        } catch (JsonProcessingException e) {
            System.out.println("发送异常");
        }
        int index = settlementService.recharge(clientClientdata);
        return index+"";
    }

}
