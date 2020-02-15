package com.accp.controller;

import com.accp.domain.*;
import com.accp.service.personnel.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/personnel")
public class PersonnelController {

/*    *//**
     * 岗位定义
     * @return
     *//*
    @Autowired(required = false)
    JobsService jobsService;
    *//**
     * 外勤车辆
     * @return
     *//*
    @Autowired(required = false)
    FieldService fieldService;
    *//**
     * 通讯名单
     * @return
     *//*
    @Autowired(required = false)
    CommunicationService communicationService;
    *//**
     * 离职登记
     * @return
     *//*
    @Autowired(required = false)
    DepartureService departureService;*/

    /**
     * 组织机构
     * @return
     */
    @Autowired(required = false)
    InstitutionsService institutionsService;
   /* *//**
     * 技工星级
     * @return
     *//*
    @Autowired(required = false)
    StarService starService;
    *//**
     * 班组技工
     * @return
     *//*
    @Autowired(required = false)
    TeamService teamService;
*/
   /* *//**
     * 查询所有岗位定义
     * @return
     *//*
    @RequestMapping("/jobsSelect")
    public List<PersonnelPost> jobsSelect(){
        return jobsService.jobsSelect();
    }
    *//**
     * 根据条件查询岗位定义
     *//*
    @RequestMapping("/jobsSelectId")
    @ResponseBody
    public PersonnelPost jobsSelectId(Integer postid){
        return jobsService.jobsSelectId(postid);
    }
    *//**
     * 新增岗位定义
     *//*
    @RequestMapping("/jobsAdd")
    @ResponseBody
    public int jobsAdd(PersonnelPost personnelPost){
        return jobsService.jobsAdd(personnelPost);
    }
    *//**
     * 修改岗位定义
     *//*
    @RequestMapping("/jobsUpdate")
    @ResponseBody
    public int jobsUpdate(PersonnelPost personnelPost){
        return jobsService.jobsUpdate(personnelPost);
    }
    *//**
     * 删除岗位定义
     *//*
    @RequestMapping("/jobsRemove")
    public int jobsRemove(Integer postid){
        return jobsService.jobsRemove(postid);
    }*/


   /* *//**
     * 查询所有外勤车辆
     *//*
    @RequestMapping("/fieldSelect")
    public List<PersonnelLegworkcat> fieldSelect(){
        return fieldService.fieldSelect();
    }
    *//**
     * 新增外勤车辆
     *//*
    @RequestMapping("/fieldAdd")
    @ResponseBody
    public int fieldAdd(PersonnelLegworkcat personnelLegworkcat){
        return fieldService.fieldAdd(personnelLegworkcat);
    }*/
   /* *//**
     * 修改外勤车辆
     *//*
    @RequestMapping("/fieldUpdate")
    @ResponseBody
    public int fieldUpdate(PersonnelLegworkcat personnelLegworkcat){
        return fieldService.fieldUpdate(personnelLegworkcat);
    }
    *//**
     * 删除外勤车辆
     *//*
    @RequestMapping("/fieldRemove")
    public int fieldRemove(Integer legworkcatid){
        return fieldService.fieldRemove(legworkcatid);
    }


    *//**
     * 查询所有技工星级
     *//*
    @RequestMapping("/starSelect")
    public List<PersonnelArtisanlevel> starSelect(){
        return starService.starSelect();
    }*/
    /**
     * 根据条件查询技工星级
     */
    @RequestMapping("/starSelectId")
    public PersonnelArtisanlevel starSelectId(Integer artisanlevelid){
        return null;
    }
    /**
     * 新增技工星级
     *//*
    @RequestMapping("/starAdd")
    @ResponseBody
    public int starAdd(PersonnelArtisanlevel personnelArtisanlevel){
        return starService.starAdd(personnelArtisanlevel);
    }
    *//**
     * 修改技工星级
     *//*
    @RequestMapping("/starUpdate")
    public int starUpdate(PersonnelArtisanlevel personnelArtisanlevel){
        return starService.starUpdate(personnelArtisanlevel);
    }
    *//**
     * 删除技工星级
     *//*
    @RequestMapping("/starRemove")
    public int starRemove(Integer artisanlevelid){
        return starService.starRemove(artisanlevelid);
    }


    *//**
     * 查询所有通讯名单
     *//*
    @RequestMapping("/communicationSelect")
    public List<PersonnelStaff> communicationSelect(){
        return communicationService.communicationSelect();
    }
    *//**
     * 根据条件查询通讯名单
     *//*
    @RequestMapping("/communicationSelectId")
    @ResponseBody
    public List<PersonnelStaff> communicationSelectId(PersonnelStaff personnelStaff){
        return communicationService.communicationSelectId(personnelStaff);
    }
    *//**
     * 新增通讯名单
     *//*
    @RequestMapping("/communicationAdd")
    @ResponseBody
    public int communicationAdd(PersonnelStaff personnelStaff){
        return communicationService.communicationAdd(personnelStaff);
    }
    *//**
     * 修改通讯名单
     *//*
    @RequestMapping("/communicationUpdate")
    public int communicationUpdate(PersonnelStaff personnelStaff){
        return communicationService.communicationUpdate(personnelStaff);
    }
    *//**
     * 删除通讯名单
     *//*
    @RequestMapping("/communicationRemove")
    public int communicationRemove(Integer id){
        return communicationService.communicationRemove(id);
    }


    *//**
     * 查询所有离职登记
     *//*
    @RequestMapping("/departureSelect")
    public List<PersonnelStaff> departureSelect(){
        return departureService.departureSelect();
    }
    *//**
     * 查询所有离职人员
     *//*
    @RequestMapping("/departureSelectTwo")
    public List<PersonnelStaff> departureSelectTwo(){
        return departureService.departureSelect();
    }*/
    /**
     * 根据条件查询离职登记
     *//*
    @RequestMapping("/departureSelectId")
    @ResponseBody
    public PersonnelStaff departureSelectId(Integer id,String staffname){
        return departureService.departureSelectId(id,staffname);
    }
    *//**
     * 新增离职登记
     *//*
    @RequestMapping("/departureAdd")
    @ResponseBody
    public int departureAdd(PersonnelStaff personnelStaff){
        return departureService.departureAdd(personnelStaff);
    }
    *//**
     * 修改离职登记
     *//*
    @RequestMapping("/departureUpdate")
    public int departureUpdate(PersonnelStaff personnelStaff){
        return departureService.departureUpdate(personnelStaff);
    }
    *//**
     * 删除离职登记
     *//*
    @RequestMapping("/departureRemove")
    public int departureRemove(Integer id){
        return departureService.departureRemove(id);
    }


    *//**
     * 查询所有班组技工
     *//*
    @RequestMapping("/teamSelect")
    public List<PersonnelArtisan> teamSelect(){
        return teamService.teamSelect();
    }*/
/*    *//**
     * 查询树状结构树班组技工
     *//*
    @RequestMapping("/teamSelectTwo")
    public Map teamSelectTwo(){
        Map<String,Object> map = new HashMap<>();
        Map<String,Object> code = new HashMap<>();
        List<PersonnelArtisanclass> lists = teamService.teamSelectTwo();
        code.put("code","200");
        code.put("message","操作成功");
        map.put("status",code);
        map.put("data",lists);
        return map;
    }*/
    /**
     * 根据条件查询班组技工
     */
    @RequestMapping("/teamSelectId")
    public PersonnelArtisan teamSelectId(Integer artisanid){
        return null;
    }
/*
    */
/**
     * 新增班组技工
     *//*

    @RequestMapping("/teamAdd")
    @ResponseBody
    public int teamAdd(PersonnelArtisan personnelArtisan){
        return teamService.teamAdd(personnelArtisan);
    }
    */
/**
     * 修改班组技工
     *//*

    @RequestMapping("/teamUpdate")
    public int teamUpdate(PersonnelArtisan personnelArtisan){
        return teamService.teamUpdate(personnelArtisan);
    }
    */
/**
     * 删除班组技工
     *//*

    @RequestMapping("/teamRemove")
    public int teamRemove(Integer artisanid){
        return teamService.teamRemove(artisanid);
    }
*/


    /**
     * 查询所有组织机构
     */
    @RequestMapping("/institutionsSelect")
    public Map institutionsSelect(Integer page,Integer limit,String ids){
        ObjectMapper objectMapper = new ObjectMapper();
        List<Integer> idsList = null;
        if(ids != null && !"".equals(ids)){
            try {
                idsList = objectMapper.readValue(ids,List.class);
            }catch (JsonProcessingException e){
                System.out.println("发送异常");
            }
        }



        PageInfo<PersonnelStaff> pageInfo =  institutionsService.institutionsSelect(page,limit,idsList);
        Map<String,Object> code = new HashMap<>();
        code.put("code",0);
        code.put("data",pageInfo.getList());
        code.put("count",pageInfo.getTotal());
        return code;
    }
    /**
     * 查询树状结构树组织机构
     */
    @RequestMapping("/institutionsSelectTwo")
    public Map institutionsSelectTwo(){
        Map<String,Object> map = new HashMap<>();
        Map<String,Object> code = new HashMap<>();
        List<PersonnelDepartment> lists = institutionsService.institutionsSelectTwo();
        code.put("code","200");
        code.put("message","操作成功");
        map.put("status",code);
        map.put("data",lists);
        return map;
    }
    /**
     * 根据条件查询组织机构
     */
    @RequestMapping("/institutionsSelectId")
    public PersonnelStaff institutionsSelectId(Integer id){
        return null;
    }
    /**
     * 新增组织机构
     */
    @RequestMapping("/institutionsAdd")
    @ResponseBody
    public int institutionsAdd(PersonnelStaff personnelPost){
        return institutionsService.institutionsAdd(personnelPost);
    }
    /**
     * 修改组织机构
     */
    @RequestMapping("/institutionsUpdate")
    @ResponseBody
    public int institutionsUpdate(PersonnelStaff personnelPost){
        return institutionsService.institutionsUpdate(personnelPost);
    }
    /**
     * 删除组织机构
     */
    @RequestMapping("/institutionsRemove")
    public int institutionsRemove(Integer id){
        return institutionsService.institutionsRemove(id);
    }
}
