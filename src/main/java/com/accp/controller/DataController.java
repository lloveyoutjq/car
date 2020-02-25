package com.accp.controller;

import com.accp.domain.*;
import com.accp.service.data.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/data")
public class DataController {

    @Autowired(required = false)
    CarTypeService carTypeService;

    @Autowired(required = false)
    CarService carService;

    @Autowired(required = false)
    EngineBrandService engineBrandService;

    @Autowired(required = false)
    CommoditySrevice commoditySrevice;

    @Autowired(required = false)
    CommodityTypeService commodityTypeService;

    @Autowired(required = false)
    ItemtypeService itemtypeService;

    @Autowired(required = false)
    MaintenanceitemsService maintenanceitemsService;

    @Autowired(required = false)
    ManufacturerService manufacturerService;

    @Autowired(required = false)
    LinkmanService linkmanService;

    @Autowired(required = false)
    SuppliertreeService suppliertreeService;
    //品牌
    @RequestMapping("/addDataCarbrand")
    @ResponseBody
    public int addDataCarbrand(String data){
        ObjectMapper objectMapper = new ObjectMapper();
        DataCarbrand dataCarbrand = null;
        try {
            dataCarbrand = objectMapper.readValue(data,DataCarbrand.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }

        return carTypeService.insertDataCarbrand(dataCarbrand);
    }

    @RequestMapping("/selectDataCarbrand")
    public Map selectDataCarbrand(String selectData,Integer page,Integer limit){
        Map<String,Object> code = new HashMap<>();
        PageInfo<DataCarbrand> pageInfo = carTypeService.selectDataCarbrand(selectData,page,limit);
        code.put("data",pageInfo.getList());
        code.put("code","0");
        code.put("count",pageInfo.getSize());
        return code;
    }

    @RequestMapping("/deleteDataCarbrand")
    public int deleteDataCarbrand(Integer id){
        return carTypeService.deleteDataCarbrand(id);
    }

    @RequestMapping("/updateDataCarbrand")
    public int updateDataCarbrand(String data){

        ObjectMapper objectMapper = new ObjectMapper();
        DataCarbrand dataCarbrand = null;
        try {
            dataCarbrand = objectMapper.readValue(data,DataCarbrand.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return carTypeService.updateDataCarbrand(dataCarbrand);
    }

    //车型
    @RequestMapping("/selectDataCar")
    public Map selectDataCar(String selectData,Integer page,Integer limit){
        Map<String,Object> code = new HashMap<>();
        PageInfo<DataCar> pageInfo = carService.selectDataCar(selectData,page,limit);
        code.put("data",pageInfo.getList());
        code.put("code","0");
        code.put("count",pageInfo.getSize());
        return code;
    }

    @RequestMapping("/addDataCar")
    @ResponseBody
    public int addDataCar(String data){
        ObjectMapper objectMapper = new ObjectMapper();
        DataCar dataCar = null;
        try {
            dataCar = objectMapper.readValue(data,DataCar.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }

        return carService.insertDataCar(dataCar);
    }

    @RequestMapping("/deleteDataCar")
    public int deleteDataCar(Integer id){
        return carService.deleteDataCar(id);
    }

    @RequestMapping("/updateDataCar")
    public int updateDataCar(String data){

        ObjectMapper objectMapper = new ObjectMapper();
        DataCar dataCar = null;
        try {
            dataCar = objectMapper.readValue(data,DataCar.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return carService.updateDataCar(dataCar);
    }




    //发动机品牌

    @RequestMapping("/selectDataEnginebrand")
    public Map selectDataEnginebrand(Integer page,Integer limit){
        Map<String,Object> code = new HashMap<>();
        PageInfo<DataEngineBrand> pageInfo = engineBrandService.selectDataEnginebrand(page,limit);
        code.put("data",pageInfo.getList());
        code.put("code","0");
        code.put("count",pageInfo.getSize());
        return code;
    }

    @RequestMapping("/addDataEnginebrand")
    public int addDataEnginebrand(String data){

        ObjectMapper objectMapper = new ObjectMapper();
        DataEngineBrand dataEngineBrand = null;
        try {
            dataEngineBrand = objectMapper.readValue(data,DataEngineBrand.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return engineBrandService.insertDataEnginebrand(dataEngineBrand);
    }

    @RequestMapping("/deleteDataEnginebrand")
    public int deleteDataEnginebrand(Integer id){
        return engineBrandService.deleteDataEnginebrand(id);
    }

    @RequestMapping("/updateDataEnginebrand")
    public int updateDataEnginebrand(String data){

        ObjectMapper objectMapper = new ObjectMapper();
        DataEngineBrand dataEngineBrand = null;
        try {
            dataEngineBrand = objectMapper.readValue(data,DataEngineBrand.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return engineBrandService.updateEnginebrand(dataEngineBrand);
    }



    //商品资料
    @RequestMapping("/addDataCommodity")
    @ResponseBody
    public int addDataCommodity(String data){
        ObjectMapper objectMapper = new ObjectMapper();

        DataCommodity dataCommodity = null;
        try {
            dataCommodity = objectMapper.readValue(data,DataCommodity.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }

        return commoditySrevice.insertDataCommodity(dataCommodity);
    }

    @RequestMapping("/selectDataCommodity")
    public Map selectDataCommodity(Integer page,Integer limit,String ids){

        ObjectMapper objectMapper = new ObjectMapper();
        List<Integer> idsList = null;
        if(ids != null && !"".equals(ids)){
            try {
                idsList = objectMapper.readValue(ids,List.class);
            }catch (JsonProcessingException e){
                System.out.println("发送异常");
            }
        }
        PageInfo<DataCommodity> pageInfo =  commoditySrevice.selectDataCommodity(page,limit,idsList);
        Map<String,Object> code = new HashMap<>();
        code.put("code",0);
        code.put("data",pageInfo.getList());
        code.put("count",pageInfo.getTotal());
        return code;
    }

    @RequestMapping("/deleteDataCommodity")
    public int deleteDataCommodity(Integer id){
        return commoditySrevice.deleteDataCommodity(id);
    }

    @RequestMapping("/updateDataCommodity")
    public int updateDataCommodity(String data){

        ObjectMapper objectMapper = new ObjectMapper();
        DataCommodity dataCommodity = null;
        try {
            dataCommodity = objectMapper.readValue(data,DataCommodity.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return commoditySrevice.updateCommodity(dataCommodity);
    }

    //商品类型
    @RequestMapping("/selectDataCommodityType")
    public Map selectDataCommodityType() {

        Map<String, Object> map = new HashMap<>();
        Map<String, Object> code = new HashMap<>();
        List<DataCommoditytype> lists = commodityTypeService.selectDataCommodityType();
        code.put("code", "200");
        code.put("message", "操作成功");
        map.put("status", code);
        map.put("data", lists);
        return map;

    }
        @RequestMapping("/addDataCommoditytype")
        public int addDataCommoditytype(String data){

            ObjectMapper objectMapper = new ObjectMapper();
            DataCommoditytype dataCommoditytype = null;
            try {
                dataCommoditytype = objectMapper.readValue(data,DataCommoditytype.class);
            }catch (JsonProcessingException e){
                System.out.println("发送异常");
            }
            return commodityTypeService.insertDataCommodityType(dataCommoditytype);
        }


        @RequestMapping("/deleteDataCommoditytype")
        public int deleteDataCommoditytype(Integer id){
            return commodityTypeService.deleteDataCommodityType(id);
        }

        @RequestMapping("/updateDataCommoditytype")
        public int updateDataCommoditytype(String data){

            ObjectMapper objectMapper = new ObjectMapper();
            DataCommoditytype dataCommoditytype = null;
            try {
                dataCommoditytype = objectMapper.readValue(data,DataCommoditytype.class);
            }catch (JsonProcessingException e){
                System.out.println("发送异常");
            }
            return commodityTypeService.updateCommodityType(dataCommoditytype);
        }



    //维修类型
    @RequestMapping("/selectItemtype")
    public Map selectDataItemtype() {

        Map<String, Object> map = new HashMap<>();
        Map<String, Object> code = new HashMap<>();
        List<DataItemtype> lists = itemtypeService.selectDataItemtype();
        code.put("code", "200");
        code.put("message", "操作成功");
        map.put("status", code);
        map.put("data", lists);
        return map;

    }

    @RequestMapping("/addDataItemtype")
    public int addDataItemtype(String data){

        ObjectMapper objectMapper = new ObjectMapper();
        DataItemtype dataItemtype = null;
        try {
            dataItemtype = objectMapper.readValue(data,DataItemtype.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return itemtypeService.insertDataaItemtype(dataItemtype);
    }


    @RequestMapping("/deleteDataItemtype")
    public int deleteDataItemtype(Integer id){
        return itemtypeService.deleteDataItemtype(id);
    }

    @RequestMapping("/updateDataItemtype")
    public int updateDataItemtype(String data){

        ObjectMapper objectMapper = new ObjectMapper();
        DataItemtype dataItemtype = null;
        try {
            dataItemtype = objectMapper.readValue(data,DataItemtype.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return itemtypeService.updateItemtype(dataItemtype);
    }

    //维修的项目
    @RequestMapping("/selectDataMaintenanceItems")
    public Map selectDataMaintenanceItems(Integer page,Integer limit,String ids){
            ObjectMapper objectMapper = new ObjectMapper();
            List<Integer> idsList = null;
            if(ids != null && !"".equals(ids)){
                try {
                    idsList = objectMapper.readValue(ids,List.class);
                }catch (JsonProcessingException e){
                    System.out.println("发送异常");
                }
            }
            PageInfo<DataMaintenanceItems> pageInfo =  maintenanceitemsService.selectDataMaintenanceItems(page,limit,idsList);
            Map<String,Object> code = new HashMap<>();
            code.put("code",0);
            code.put("data",pageInfo.getList());
            code.put("count",pageInfo.getTotal());
            return code;
    }

    @RequestMapping("/addDataMaintenanceItems")
    public int addDataMaintenanceItems(String data){

        ObjectMapper objectMapper = new ObjectMapper();
        DataMaintenanceItems dataMaintenanceItems = null;
        try {
            dataMaintenanceItems = objectMapper.readValue(data,DataMaintenanceItems.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return maintenanceitemsService.insertDataMaintenanceItems(dataMaintenanceItems);
    }

    @RequestMapping("/deleteDataMaintenanceItems")
    public int deleteDataMaintenanceItems(Integer id){
        return maintenanceitemsService.deleteDataMaintenanceItems(id);
    }


    @RequestMapping("/updateDataMaintenanceItems")
    public int updateDataMaintenanceItems(String data){

        ObjectMapper objectMapper = new ObjectMapper();
        DataMaintenanceItems dataMaintenanceItems = null;
        try {
            dataMaintenanceItems = objectMapper.readValue(data,DataMaintenanceItems.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return maintenanceitemsService.updateMaintenanceItems(dataMaintenanceItems);
    }


    //厂商
    @RequestMapping("/selectDataManufacturer")
    public Map selectDataManufacturer(Integer page,Integer limit,String ids){
        ObjectMapper objectMapper = new ObjectMapper();
        List<Integer> idsList = null;
        if(ids != null && !"".equals(ids)){
            try {
                idsList = objectMapper.readValue(ids,List.class);
            }catch (JsonProcessingException e){
                System.out.println("发送异常");
            }
        }
        PageInfo<DataManufacturer> pageInfo =  manufacturerService.selectDataManufacturer(page,limit,idsList);
        Map<String,Object> code = new HashMap<>();
        code.put("code",0);
        code.put("data",pageInfo.getList());
        code.put("count",pageInfo.getTotal());
        return code;
    }

    @RequestMapping("/addDataManufacturer")
    public int addDataManufacturer(String data){

        ObjectMapper objectMapper = new ObjectMapper();
        DataManufacturer dataManufacturer = null;
        try {
            dataManufacturer = objectMapper.readValue(data,DataManufacturer.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return manufacturerService.insertDataManufacturer(dataManufacturer);
    }

    @RequestMapping("/deleteDataManufacturer")
    public int deleteDataManufacturer(Integer id){
        return manufacturerService.deleteDataManufacturer(id);
    }


    @RequestMapping("/updateDataManufacturer")
    public int updateDataManufacturer(String data){

        ObjectMapper objectMapper = new ObjectMapper();
        DataManufacturer dataManufacturer = null;
        try {
            dataManufacturer = objectMapper.readValue(data,DataManufacturer.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return manufacturerService.updateManufacturer(dataManufacturer);
    }


    //联系人

    @RequestMapping("/selectDataLinkman")
    public Map selectDataLinkman(Integer page,Integer limit,String id){
        ObjectMapper objectMapper = new ObjectMapper();


        PageInfo<DataLinkman> pageInfo =  linkmanService.selectDataLinkman(page,limit,id);
        Map<String,Object> code = new HashMap<>();
        code.put("code",0);
        code.put("data",pageInfo.getList());
        code.put("count",pageInfo.getTotal());
        return code;
    }

    @RequestMapping("/addDataLinkman")
    public int addDataLinkman(String data){

        ObjectMapper objectMapper = new ObjectMapper();
        DataLinkman dataLinkman = null;
        try {
            dataLinkman = objectMapper.readValue(data,DataLinkman.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return linkmanService.insertDataLinkman(dataLinkman);
    }

    @RequestMapping("/deleteDataLinkman")
    public int deleteDataLinkman(Integer id){
        return linkmanService.deleteDataLinkman(id);
    }


    @RequestMapping("/updateDataLinkman")
    public int updateDataLinkman(String data){

        ObjectMapper objectMapper = new ObjectMapper();
        DataLinkman dataLinkman = null;
        try {
            dataLinkman = objectMapper.readValue(data,DataLinkman.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return linkmanService.updateLinkman(dataLinkman);
    }

    //厂商分类
    @RequestMapping("/selectsuppliertree")
    public Map selectDatasuppliertree() {

        Map<String, Object> map = new HashMap<>();
        Map<String, Object> code = new HashMap<>();
        List<DataSupplierTree> lists = suppliertreeService.selectDataSupplierTree();
        code.put("code", "200");
        code.put("message", "操作成功");
        map.put("status", code);
        map.put("data", lists);
        return map;

    }

    @RequestMapping("/addDatasuppliertree")
    public int addDatasuppliertree(String data){

        ObjectMapper objectMapper = new ObjectMapper();
        DataSupplierTree dataSupplierTree = null;
        try {
            dataSupplierTree = objectMapper.readValue(data,DataSupplierTree.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return suppliertreeService.insertDataSupplierTree(dataSupplierTree);
    }


    @RequestMapping("/deleteDatasuppliertree")
    public int deleteDatasuppliertree(Integer id){
        return suppliertreeService.deleteDataSupplierTree(id);
    }

    @RequestMapping("/updateDatasuppliertree")
    public int updateDatasuppliertree(String data){

        ObjectMapper objectMapper = new ObjectMapper();
        DataSupplierTree dataSupplierTree = null;
        try {
            dataSupplierTree = objectMapper.readValue(data,DataSupplierTree.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return suppliertreeService.updateSupplierTree(dataSupplierTree);
    }


}
