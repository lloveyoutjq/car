package com.accp.controller;

import com.accp.domain.MaintainRescue;
import com.accp.service.completed.CompletedService;
import com.accp.service.front.settlementService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/maintenance")
public class MaintenanceController {

    @Autowired
    CompletedService completedService;

    @Autowired
    settlementService settlementService;

    @GetMapping("/selectCompleted")
    public Map<String,Object> selectCompleted(String number,String carNumber,String frameNumber,String eligibility,Integer page,Integer limit){
        Map<String,Object> map = new HashMap<>();
        PageInfo pageInfo = completedService.completionInspection(number,carNumber,frameNumber,eligibility,page,limit);
        map.put("code",0);
        map.put("data",pageInfo.getList());
        map.put("count",pageInfo.getTotal());
        return map;
    }

    @RequestMapping("/rescue")
    public Map<String,Object> rescue(String number){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("data",settlementService.rescue(number));
        return map;
    }
}
