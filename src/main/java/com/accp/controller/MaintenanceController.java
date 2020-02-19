package com.accp.controller;


import com.accp.service.front.SettlementService;
import com.accp.service.maintenance.CompletedService;
import com.accp.service.repair.RepairService;
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
    SettlementService SettlementService;

    @Autowired
    RepairService repairService;

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
        map.put("data",SettlementService.rescue(number));
        return map;
    }

    @RequestMapping("/vehiclesInOperation")
    public Map<String,Object> vehiclesInOperation(Integer page,Integer limit){
        Map<String,Object> map = new HashMap<>();
        PageInfo pageInfo = repairService.vehiclesInOperation(page,limit);
        map.put("code",0);
        map.put("code",pageInfo.getList());
        map.put("count",pageInfo.getTotal());
        return map;
    }

    @RequestMapping("/maintenanceHistory")
    public Map<String,Object> maintenanceHistory(String carnumber,Integer pages,Integer limit){
        Map<String,Object> map = new HashMap<>();
        PageInfo pageInfo = repairService.maintenanceHistory(carnumber, pages, limit);
        map.put("code",0);
        map.put("code",pageInfo.getList());
        map.put("count",pageInfo.getTotal());
        return map;
    }

    @RequestMapping("/items")
    public Map<String,Object> items(String carNumber,Integer pages,Integer limit){
        Map<String,Object> map = new HashMap<>();
        PageInfo pageInfo = repairService.items(carNumber, pages, limit);
        map.put("code",0);
        map.put("code",pageInfo.getList());
        map.put("count",pageInfo.getTotal());
        return map;
    }

    @RequestMapping("/rescueS")
    public Map<String,Object> rescueS(String carnumber){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("data",repairService.rescueS(carnumber));
        return map;
    }


    @RequestMapping("/repairS")
    public Map<String,Object> repairS(String carnumber){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("data",repairService.repairS(carnumber));
        return map;
    }


}
