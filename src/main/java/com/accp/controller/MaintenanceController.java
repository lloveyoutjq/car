package com.accp.controller;

import com.accp.domain.ClientClientdata;
import com.accp.domain.MaintainEwitem;
import com.accp.domain.MaintainRescue;
import com.accp.service.completed.CompletedService;
import com.accp.service.front.settlementService;
import com.accp.service.repair.RepairService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    settlementService SettlementService;

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

    @RequestMapping("/selectByPrimaryKey")
    public Map<String,Object> selectByPrimaryKey(String id){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("data",completedService.selectByPrimaryKey(Integer.getInteger(id)));
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
    public Map<String,Object> maintenanceHistory(String carnumber,Integer page,Integer limit){
        Map<String,Object> map = new HashMap<>();
        PageInfo pageInfo = repairService.maintenanceHistory(carnumber, page, limit);
        map.put("code",0);
        map.put("code",pageInfo.getList());
        map.put("count",pageInfo.getTotal());
        return map;
    }

    @RequestMapping("/items")
    public Map<String,Object> items(String carNumber,Integer page,Integer limit){
        Map<String,Object> map = new HashMap<>();
        PageInfo pageInfo = repairService.items(carNumber, page, limit);
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

    @RequestMapping("/insertEwitem")
    public String insertEwitem(String data){

        ObjectMapper objectMapper = new ObjectMapper();
        MaintainEwitem maintainEwitem = null;
        try {
            maintainEwitem = objectMapper.readValue(data,MaintainEwitem.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        repairService.insert(maintainEwitem);
        return "1";
    }

    @RequestMapping("/selectByNumber")
    public Map<String,Object> selectByNumber(String number,Integer page,Integer limit){
        Map<String,Object> map = new HashMap<>();
        PageInfo pageInfo = repairService.selectByExample(number, page, limit);
        map.put("code",0);
        map.put("code",pageInfo.getList());
        map.put("count",pageInfo.getTotal());
        return map;
    }

    @RequestMapping("/selectByEwitemId")
    public Map<String,Object> selectByEwitemId(String id){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("code",repairService.selectByEwitemId(Integer.getInteger(id)));
        return map;
    }

}
