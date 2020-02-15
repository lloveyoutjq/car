package com.accp.controller;

import com.accp.service.front.settlementService;
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

}
