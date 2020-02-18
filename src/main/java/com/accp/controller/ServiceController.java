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
    public Map addClient(String data){
        ObjectMapper objectMapper = new ObjectMapper();
        ClientClientdata clientClientdata = null;
        try {
            clientClientdata = objectMapper.readValue(data,ClientClientdata.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        Map<String,Object> map = new HashMap<>();
        if(customerArchivesService.addClient(clientClientdata)>0){
            map.put("code","0");
            map.put("msg","成功");
            map.put("id",clientClientdata.getNumber());
        }else{
            map.put("code","-1");
            map.put("msg","失败");
        }
        //map.put("a",clientClientdata);
        return map;
    }

    @RequestMapping("updateClient")
    public Map updateClient(HttpSession session,String data){
        ObjectMapper objectMapper = new ObjectMapper();
        ClientClientdata clientClientdata = null;
        try {
            clientClientdata = objectMapper.readValue(data,ClientClientdata.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }

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
    public Map selectClient(HttpSession session, Integer page, Integer limit,String clientData,String carData) {
        ObjectMapper objectMapper = new ObjectMapper();
        ClientClientdata clientClientdata = null;
        ClientCarinfo clientClienttype = null;
        try {
            clientClientdata = objectMapper.readValue(clientData,ClientClientdata.class);
            clientClienttype = objectMapper.readValue(carData,ClientCarinfo.class);
            clientClientdata.setClientCarinfo(clientClienttype);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        Map<String,Object> map = new HashMap<>();
        PageInfo<ClientClientdata> pageInfo = null;
        if(page == null && limit==null){
            System.out.println("全部查询");
            List<ClientClientdata> lists = customerArchivesService.selectClientAll(clientClientdata);
            map.put("code",0);
            map.put("data",lists);
        }else{
            System.out.println(session.getId()+"查询客户");
            if(page == null){
                page = 1;
            }
            if(limit == null){
                limit = 10;
            }
            pageInfo = customerArchivesService.selectClient(page,limit,clientClientdata);
            map.put("code",0);
            map.put("data",pageInfo.getList());
            map.put("count",pageInfo.getTotal());
        }


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
        map.put("count",pageInfo.getTotal());
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
    public Map deleteClientType(Integer id){
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
     * @param data
     * @return
     */
    @RequestMapping("addCar")
    public String addCar(String data) throws JsonProcessingException {
        Map<String,Object> map = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        ClientCarinfo clientCarinfo = null;
        try {
            clientCarinfo = objectMapper.readValue(data,ClientCarinfo.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        if("".equals(clientCarinfo.getBorndate())){
            clientCarinfo.setBorndate(null);
        }
        if("".equals(clientCarinfo.getBuydate())){
            clientCarinfo.setBuydate(null);
        }
        if("".equals(clientCarinfo.getCarcheckdate())){
            clientCarinfo.setCarcheckdate(null);
        }
        if("".equals(clientCarinfo.getDutydate())){
            clientCarinfo.setDutydate(null);
        }
        if("".equals(clientCarinfo.getJqinsurancedate())){
            clientCarinfo.setJqinsurancedate(null);
        }
        if("".equals(clientCarinfo.getMaintaindate())){
            clientCarinfo.setMaintaindate(null);
        }
        if("".equals(clientCarinfo.getSyinsurancedate())){
            clientCarinfo.setSyinsurancedate(null);
        }

        int count = carArchivesService.addCar(clientCarinfo);
        if(count > 0){
            map.put("code",0);
            map.put("msg","成功");
        }else{
            map.put("code",-1);
            map.put("msg","失败");
        }

        return objectMapper.writeValueAsString(map);

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
        if("".equals(clientCarinfo.getBorndate())){
            clientCarinfo.setBorndate(null);
        }
        if("".equals(clientCarinfo.getBuydate())){
            clientCarinfo.setBuydate(null);
        }
        if("".equals(clientCarinfo.getCarcheckdate())){
            clientCarinfo.setCarcheckdate(null);
        }
        if("".equals(clientCarinfo.getDutydate())){
            clientCarinfo.setDutydate(null);
        }
        if("".equals(clientCarinfo.getJqinsurancedate())){
            clientCarinfo.setJqinsurancedate(null);
        }
        if("".equals(clientCarinfo.getMaintaindate())){
            clientCarinfo.setMaintaindate(null);
        }
        if("".equals(clientCarinfo.getSyinsurancedate())){
            clientCarinfo.setSyinsurancedate(null);
        }
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
    public Map selectCar(Integer clientId ,Integer page, Integer limit){
        Map<String,Object> map = new HashMap<>();
        PageInfo pageInfo = carArchivesService.selectCar(clientId,page, limit);
        map.put("code",0);
        map.put("data",pageInfo.getList());
        map.put("count",pageInfo.getTotal());
        return map;
    }
    /*****************************保养***********************************************/

    /**
     * 添加保养
     * @return
     */
    @RequestMapping("addUpkeep")
    public Map addUpkeep(String data){
        ObjectMapper objectMapper = new ObjectMapper();
        MaintainMaintenanceRegistration maintainMaintenanceRegistration = null;
        try {
            maintainMaintenanceRegistration = objectMapper.readValue(data,MaintainMaintenanceRegistration.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }

        Map<String,Object> map = new HashMap<>();
        int count = carArchivesService.addUpkeep(maintainMaintenanceRegistration);
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
     * 修改保养
     * @param data
     * @return
     */
    @RequestMapping("updateUpkeep")
    public Map<String, Object> updateUpkeep(String data){
        ObjectMapper objectMapper = new ObjectMapper();
        MaintainMaintenanceRegistration maintainMaintenanceRegistration = null;
        try {
            maintainMaintenanceRegistration = objectMapper.readValue(data,MaintainMaintenanceRegistration.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        Map<String,Object> map = new HashMap<>();
        int count = carArchivesService.updateUpkeep(maintainMaintenanceRegistration);
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
     * 删除保养
     * @param id
     * @return
     */
    @RequestMapping("deleteUpkeep")
    public Map<String, Object> deleteUpkeep(Integer id){
        Map<String,Object> map = new HashMap<>();
        int count = carArchivesService.deleteUpkeep(id);
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
     * 查询保养
     * @param carInfoId
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping("selectUpkeep")
    public Map<String, Object> selectUpkeep(Integer carInfoId, Integer page, Integer limit){
        Map<String,Object> map = new HashMap<>();
        PageInfo pageInfo = carArchivesService.selectUpkeep(carInfoId,page,limit);
        map.put("code",0);
        map.put("data",pageInfo.getList());
        map.put("count",pageInfo.getTotal());
        return map;
    }





}
