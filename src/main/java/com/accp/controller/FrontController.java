package com.accp.controller;

import com.accp.domain.ClientClientdata;
import com.accp.domain.MaintainCompleted;
import com.accp.service.front.settlementService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/front")
public class FrontController {

    @Autowired
    settlementService SettlementService;

    @RequestMapping("/bill")
    public Map<String,Object> bill(String cashierId, String status, String carNumber, String name, String counselorName, String tname, String settlementStatus, String remark,Integer page,Integer limit){
        Map<String,Object> map = new HashMap<>();
        PageInfo pageInfo = SettlementService.bill(cashierId, status, carNumber, name, counselorName, tname, settlementStatus, remark, page, limit);
        map.put("code",0);
        map.put("data",pageInfo.getList());
        map.put("count",pageInfo.getTotal());
        return map;
    }

    @RequestMapping("/rollback")
    public String rollback(String saleid){
        SettlementService.updateByPrimaryKeySelective(saleid);
        return "1";
    }

    /**
     * 会员
     * */
    @RequestMapping("/vip")
    public Map<String,Object> vip(String id,Integer page,Integer limit){
        Map<String,Object> map = new HashMap<>();
        PageInfo pageInfo = SettlementService.vip(id, page, limit);
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
        int index = SettlementService.recharge(clientClientdata);
        return index+"";
    }

}
