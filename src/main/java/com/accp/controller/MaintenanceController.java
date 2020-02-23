package com.accp.controller;

import com.accp.domain.DataMaintenanceItems;
import com.accp.domain.FrontCashier;
import com.accp.domain.MaintainCompleted;
import com.accp.domain.MaintainEwitem;
import com.accp.service.front.SettlementService;
import com.accp.service.maintenance.CompletedService;

import com.accp.service.maintenance.RepairService;
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
    SettlementService settlementService;

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
        map.put("data", settlementService.rescue(number));
        return map;
    }

    @RequestMapping("/vehiclesInOperation")
    public Map<String,Object> vehiclesInOperation(Integer page,Integer limit){
        Map<String,Object> map = new HashMap<>();
        PageInfo pageInfo = repairService.vehiclesInOperation(page,limit);
        map.put("code",0);
        map.put("data",pageInfo.getList());
        map.put("count",pageInfo.getTotal());
        return map;
    }

    @RequestMapping("/maintenanceHistory")
    public Map<String,Object> maintenanceHistory(String carnumber,Integer page,Integer limit){
        Map<String,Object> map = new HashMap<>();
        PageInfo pageInfo = repairService.maintenanceHistory(carnumber, page, limit);
        map.put("code",0);
        map.put("data",pageInfo.getList());
        map.put("count",pageInfo.getTotal());
        return map;
    }

    @RequestMapping("/items")
    public Map<String,Object> items(String carNumber,Integer page,Integer limit){
        Map<String,Object> map = new HashMap<>();
        PageInfo pageInfo = repairService.items(carNumber, page, limit);
        map.put("code",0);
        map.put("data",pageInfo.getList());
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
        map.put("data",pageInfo.getList());
        map.put("count",pageInfo.getTotal());
        return map;
    }

    //查询单个(用于修改附加项目所用)
    @RequestMapping("/selectByEwitemId")
    public Map<String,Object> selectByEwitemId(String id){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("data",repairService.selectByEwitemId(Integer.getInteger(id)));
        return map;
    }

    @RequestMapping("/updateMaintainEwitem")
    public String updateMaintainEwitem(String data){
        ObjectMapper objectMapper = new ObjectMapper();
        MaintainEwitem maintainEwitem = null;
        try {
            maintainEwitem = objectMapper.readValue(data,MaintainEwitem.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        repairService.updateMaintainEwitem(maintainEwitem);
        return "1";
    }

    @RequestMapping("/deleteMaintainEwitem")
    public String deleteMaintainEwitem(String id){
        repairService.deleteMaintainEwitem(Integer.getInteger(id));
        return "1";
    }

    /**
     * 附单
     * */
    //查询
    @RequestMapping("/attached")
    public Map<String,Object> attached(String number,Integer page,Integer limit){
        Map<String,Object> map = new HashMap<>();
        PageInfo pageInfo = repairService.attached(number, page, limit);
        map.put("code",0);
        map.put("data",pageInfo.getList());
        map.put("count",pageInfo.getTotal());
        return map;
    }

    /**
     * 维修项目
     * */
    //查询
    @RequestMapping("/itemsSels")
    public Map<String,Object> itemsSels(String number,Integer page,Integer limit){
        Map<String,Object> map = new HashMap<>();
        PageInfo pageInfo = repairService.itemsSels(number, page, limit);
        map.put("code",0);
        map.put("data",pageInfo.getList());
        map.put("count",pageInfo.getTotal());
        return map;
    }

    //新增
    @RequestMapping("/insertItem")
    public String insertItem(String data){
        ObjectMapper objectMapper = new ObjectMapper();
        DataMaintenanceItems dataMaintenanceItems = null;
        try {
            dataMaintenanceItems = objectMapper.readValue(data,DataMaintenanceItems.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        repairService.insert(dataMaintenanceItems);
        return "1";
    }

    //修改
    @RequestMapping("/selectItem")
    public Map<String,Object> selectItem(String id){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("data",repairService.selectByPrimaryKey(Integer.getInteger(id)));
        return map;
    }
    @RequestMapping("/updateItem")
    public String updateItem(String data){
        ObjectMapper objectMapper = new ObjectMapper();
        DataMaintenanceItems dataMaintenanceItems = null;
        try {
            dataMaintenanceItems = objectMapper.readValue(data,DataMaintenanceItems.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        repairService.updateByPrimaryKey(dataMaintenanceItems);
        return "1";
    }

    //删除
    @RequestMapping("/deleteItem")
    public String deleteItem(String id){
        repairService.deleteByPrimaryKey(Integer.getInteger(id));
        return "1";
    }

    /**
     * 新增时打开单据的单号
     * */
    //维修
    @RequestMapping("/newRepairId")
    public String newRepairId(){
        return repairService.newRepairId();
    }
    //救援
    @RequestMapping("/newRescueId")
    public String newRescueId(){
        return repairService.newRescueId();
    }

    /**
     * 竣工检查
     * */
    @RequestMapping("/updateComplete")
    public String updateComplete(String data) {
        ObjectMapper objectMapper = new ObjectMapper();
        MaintainCompleted maintainCompleted = null;
        try {
            maintainCompleted = objectMapper.readValue(data, MaintainCompleted.class);
        } catch (JsonProcessingException e) {
            System.out.println("发送异常");
        }
        completedService.updateComplete(maintainCompleted);
        return "1";
    }


    /**
     * 接单
     * */
    @RequestMapping("/insertRepair")
    public String insertRepair(String data) {
        ObjectMapper objectMapper = new ObjectMapper();
        FrontCashier frontCashier = null;
        try {
            frontCashier = objectMapper.readValue(data, FrontCashier.class);
        } catch (JsonProcessingException e) {
            System.out.println("发送异常");
        }
        frontCashier.setNumber(frontCashier.getMaintainRepair().getNumber());
        settlementService.insertF(frontCashier);
        repairService.insertRepair(frontCashier.getMaintainRepair());
        return "1";
    }

    @RequestMapping("/insertReuce")
    public String insertReuce(String data) {
        ObjectMapper objectMapper = new ObjectMapper();
        FrontCashier frontCashier = null;
        try {
            frontCashier = objectMapper.readValue(data, FrontCashier.class);
        } catch (JsonProcessingException e) {
            System.out.println("发送异常");
        }
        frontCashier.setNumber(frontCashier.getMaintainRescue().getNumber());
        settlementService.insertF(frontCashier);
        repairService.insertRescue(frontCashier.getMaintainRescue());
        return "1";
    }

    //车主信息
    @RequestMapping("/selectUser")
    public  Map<String,Object> selectUser(String carNumber){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("data",repairService.selectUser(carNumber));
        return map;
    }
}
