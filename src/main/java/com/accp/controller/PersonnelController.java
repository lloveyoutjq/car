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

    /**
     * 岗位定义
     * @return
     */
    @Autowired(required = false)
    JobsService jobsService;
    /**
     * 外勤车辆
     * @return
     */
    @Autowired(required = false)
    FieldService fieldService;
    /**
     * 通讯名单
     * @return
     */
    @Autowired(required = false)
    CommunicationService communicationService;
    /**
     * 离职登记
     * @return
     */
    @Autowired(required = false)
    DepartureService departureService;
    /**
     * 组织机构
     * @return
     */
    @Autowired(required = false)
    InstitutionsService institutionsService;
    /**
     * 技工星级
     * @return
     */
    @Autowired(required = false)
    StarService starService;
    /**
     * 班组技工
     * @return
     */
    @Autowired(required = false)
    TeamService teamService;

    /**
     * 查询所有岗位定义
     * @return
     */
    @RequestMapping("/jobsSelect")
    public Map jobsSelect(Integer page,Integer limit,String ids){
        ObjectMapper objectMapper = new ObjectMapper();
        List<Integer> idsList = null;
        if(ids != null && !"".equals(ids)){
            try {
                idsList = objectMapper.readValue(ids,List.class);
            }catch (JsonProcessingException e){
                System.out.println("发送异常");
            }
        }
        PageInfo<PersonnelPost> pageInfo =  jobsService.jobsSelect(page,limit,idsList);
        Map<String,Object> code = new HashMap<>();
        code.put("code",0);
        code.put("data",pageInfo.getList());
        code.put("count",pageInfo.getTotal());
        return code;
    }
    /**
     * 根据条件查询岗位定义
     */
    @RequestMapping("/jobsSelectId")
    @ResponseBody
    public PersonnelPost jobsSelectId(Integer postid){
        return jobsService.jobsSelectId(postid);
    }
    /**
     * 新增岗位定义
     */
    @RequestMapping("/jobsAdd")
    @ResponseBody
    public int jobsAdd(String data){
        ObjectMapper objectMapper = new ObjectMapper();
        PersonnelPost personnelPost = null;
        try {
            personnelPost = objectMapper.readValue(data,PersonnelPost.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return jobsService.jobsAdd(personnelPost);
    }
    /**
     * 修改岗位定义
     */
    @RequestMapping("/jobsUpdate")
    @ResponseBody
    public int jobsUpdate(String data){
        ObjectMapper objectMapper = new ObjectMapper();
        PersonnelPost personnelPost = null;
        try {
            personnelPost = objectMapper.readValue(data,PersonnelPost.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return jobsService.jobsUpdate(personnelPost);
    }
    /**
     * 删除岗位定义
     */
    @RequestMapping("/jobsRemove")
    public int jobsRemove(Integer postid){
        return jobsService.jobsRemove(postid);
    }


    /**
     * 查询所有外勤车辆
     */
    @RequestMapping("/fieldSelect")
    public Map fieldSelect(Integer page,Integer limit,String ids){
        ObjectMapper objectMapper = new ObjectMapper();
        List<Integer> idsList = null;
        if(ids != null && !"".equals(ids)){
            try {
                idsList = objectMapper.readValue(ids,List.class);
            }catch (JsonProcessingException e){
                System.out.println("发送异常");
            }
        }
        PageInfo<PersonnelLegworkcat> pageInfo =  fieldService.fieldSelect(page,limit,idsList);
        Map<String,Object> code = new HashMap<>();
        code.put("code",0);
        code.put("data",pageInfo.getList());
        code.put("count",pageInfo.getTotal());
        return code;
    }
    /**
     * 新增外勤车辆
     */
    @RequestMapping("/fieldAdd")
    @ResponseBody
    public int fieldAdd(String data){
        ObjectMapper objectMapper = new ObjectMapper();
        PersonnelLegworkcat personnelLegworkcat = null;
        try {
            personnelLegworkcat = objectMapper.readValue(data,PersonnelLegworkcat.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return fieldService.fieldAdd(personnelLegworkcat);
    }
    /**
     * 修改外勤车辆
     */
    @RequestMapping("/fieldUpdate")
    @ResponseBody
    public int fieldUpdate(String data){
        ObjectMapper objectMapper = new ObjectMapper();
        PersonnelLegworkcat personnelLegworkcat = null;
        try {
            personnelLegworkcat = objectMapper.readValue(data,PersonnelLegworkcat.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return fieldService.fieldUpdate(personnelLegworkcat);
    }
    /**
     * 删除外勤车辆
     */
    @RequestMapping("/fieldRemove")
    public int fieldRemove(Integer legworkcatid){
        return fieldService.fieldRemove(legworkcatid);
    }


    /**
     * 查询所有技工星级
     */
    @RequestMapping("/starSelect")
    public Map starSelect(Integer page,Integer limit,String ids){
        ObjectMapper objectMapper = new ObjectMapper();
        List<Integer> idsList = null;
        if(ids != null && !"".equals(ids)){
            try {
                idsList = objectMapper.readValue(ids,List.class);
            }catch (JsonProcessingException e){
                System.out.println("发送异常");
            }
        }
        PageInfo<PersonnelArtisanlevel> pageInfo =  starService.starSelect(page,limit,idsList);
        Map<String,Object> code = new HashMap<>();
        code.put("code",0);
        code.put("data",pageInfo.getList());
        code.put("count",pageInfo.getTotal());
        return code;
    }
    /**
     * 根据条件查询技工星级
     */
    @RequestMapping("/starSelectId")
    public PersonnelArtisanlevel starSelectId(Integer artisanlevelid){
        return null;
    }
    /**
     * 新增技工星级
     */
    @RequestMapping("/starAdd")
    @ResponseBody
    public int starAdd(String data){
        ObjectMapper objectMapper = new ObjectMapper();
        PersonnelArtisanlevel personnelArtisanlevel = null;
        try {
            personnelArtisanlevel = objectMapper.readValue(data,PersonnelArtisanlevel.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return starService.starAdd(personnelArtisanlevel);
    }
    /**
     * 修改技工星级
     */
    @RequestMapping("/starUpdate")
    public int starUpdate(String data){
        ObjectMapper objectMapper = new ObjectMapper();
        PersonnelArtisanlevel personnelArtisanlevel = null;
        try {
            personnelArtisanlevel = objectMapper.readValue(data,PersonnelArtisanlevel.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return starService.starUpdate(personnelArtisanlevel);
    }
    /**
     * 删除技工星级
     */
    @RequestMapping("/starRemove")
    public int starRemove(Integer artisanlevelid){
        return starService.starRemove(artisanlevelid);
    }


    /**
     * 查询所有通讯名单
     */
    @RequestMapping("/communicationSelect")
    public Map communicationSelect(Integer page,Integer limit,String ids){
        ObjectMapper objectMapper = new ObjectMapper();
        List<Integer> idsList = null;
        if(ids != null && !"".equals(ids)){
            try {
                idsList = objectMapper.readValue(ids,List.class);
            }catch (JsonProcessingException e){
                System.out.println("发送异常");
            }
        }
        PageInfo<PersonnelStaff> pageInfo =  communicationService.communicationSelect(page,limit,idsList);
        Map<String,Object> code = new HashMap<>();
        code.put("code",0);
        code.put("data",pageInfo.getList());
        code.put("count",pageInfo.getTotal());
        return code;
    }
    /**
     * 根据条件查询通讯名单
     */
    @RequestMapping("/communicationSelectId")
    @ResponseBody
    public List<PersonnelStaff> communicationSelectId(PersonnelStaff personnelStaff){
        return communicationService.communicationSelectId(personnelStaff);
    }
    /**
     * 新增通讯名单
     */
    @RequestMapping("/communicationAdd")
    @ResponseBody
    public int communicationAdd(String data){
        ObjectMapper objectMapper = new ObjectMapper();
        PersonnelStaff personnelStaff = null;
        try {
            personnelStaff = objectMapper.readValue(data,PersonnelStaff.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return communicationService.communicationAdd(personnelStaff);
    }
    /**
     * 修改通讯名单
     */
    @RequestMapping("/communicationUpdate")
    public int communicationUpdate(String data){
        ObjectMapper objectMapper = new ObjectMapper();
        PersonnelStaff personnelStaff = null;
        try {
            personnelStaff = objectMapper.readValue(data,PersonnelStaff.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return communicationService.communicationUpdate(personnelStaff);
    }
    /**
     * 删除通讯名单
     */
    @RequestMapping("/communicationRemove")
    public int communicationRemove(Integer id){
        return communicationService.communicationRemove(id);
    }


    /**
     * 查询所有离职登记
     */
    @RequestMapping("/departureSelect")
    public Map departureSelect(Integer page,Integer limit,String ids){
        ObjectMapper objectMapper = new ObjectMapper();
        List<Integer> idsList = null;
        if(ids != null && !"".equals(ids)){
            try {
                idsList = objectMapper.readValue(ids,List.class);
            }catch (JsonProcessingException e){
                System.out.println("发送异常");
            }
        }
        PageInfo<PersonnelStaff> pageInfo =  departureService.departureSelect(page,limit,idsList);
        Map<String,Object> code = new HashMap<>();
        code.put("code",0);
        code.put("data",pageInfo.getList());
        code.put("count",pageInfo.getTotal());
        return code;
    }
    /**
     * 查询所有离职人员
     */
    @RequestMapping("/departureSelectTwo")
    public List<PersonnelStaff> departureSelectTwo(){
        return departureService.departureSelectTwo();
    }
    /**
     * 根据条件查询离职登记
     */
    @RequestMapping("/departureSelectId")
    @ResponseBody
    public List<PersonnelStaff> departureSelectId(PersonnelStaff personnelStaff){
        return departureService.departureSelectId(personnelStaff);
    }
    /**
     * 新增离职登记
     */
    @RequestMapping("/departureAdd")
    @ResponseBody
    public int departureAdd(String data){
        ObjectMapper objectMapper = new ObjectMapper();
        PersonnelDimission personnelDimission = null;
        try {
            personnelDimission = objectMapper.readValue(data,PersonnelDimission.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return departureService.departureAdd(personnelDimission);
    }
    /**
     * 修改离职登记
     */
    @RequestMapping("/departureUpdate")
    @ResponseBody
    public int departureUpdate(String data){
        ObjectMapper objectMapper = new ObjectMapper();
        PersonnelDimission personnelDimission = null;
        try {
            personnelDimission = objectMapper.readValue(data,PersonnelDimission.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return departureService.departureUpdate(personnelDimission);
    }
    /**
     * 删除离职登记
     */
    @RequestMapping("/departureRemove")
    public int departureRemove(Integer id){
        return departureService.departureRemove(id);
    }


    /**
     * 查询所有班组技工
     */
    @RequestMapping("/teamSelect")
    public Map teamSelect(Integer page,Integer limit,String ids){
        ObjectMapper objectMapper = new ObjectMapper();
        List<Integer> idsList = null;
        if(ids != null && !"".equals(ids)){
            try {
                idsList = objectMapper.readValue(ids,List.class);
            }catch (JsonProcessingException e){
                System.out.println("发送异常");
            }
        }
        PageInfo<PersonnelArtisan> pageInfo =  teamService.teamSelect(page,limit,idsList);
        Map<String,Object> code = new HashMap<>();
        code.put("code",0);
        code.put("data",pageInfo.getList());
        code.put("count",pageInfo.getTotal());
        return code;
    }
    /**
     * 查询所有技工表
     */
    @RequestMapping("/exArtisanclass")
    public List<PersonnelArtisanclass> exArtisanclass(){
        return teamService.exArtisanclass();
    }
    /**
     * 查询树状结构树班组技工
     */
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
    }
    /**
     * 根据条件查询班组技工
     */
    @RequestMapping("/teamSelectOpen")
    @ResponseBody
    public Map teamSelectOpen(Integer page,Integer limit,String data){
        ObjectMapper objectMapper = new ObjectMapper();
        PersonnelArtisan personnelArtisan = null;
        try {
            personnelArtisan = objectMapper.readValue(data,PersonnelArtisan.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        PageInfo<PersonnelArtisan> pageInfo =  teamService.teamSelectOpen(page,limit,personnelArtisan);
        Map<String,Object> map = new HashMap<>();
        map.put("code","0");
        map.put("data",pageInfo.getList());
        map.put("count",pageInfo.getTotal());
        return map;
    }
    /**
     * 新增班组技工
     */
    @RequestMapping("/teamAdd")
    @ResponseBody
    public int teamAdd(String data){
        ObjectMapper objectMapper = new ObjectMapper();
        PersonnelArtisan personnelArtisan = null;
        try {
            personnelArtisan = objectMapper.readValue(data,PersonnelArtisan.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return teamService.teamAdd(personnelArtisan);
    }
    /**
     * 修改班组技工
     */
    @RequestMapping("/teamUpdate")
    @ResponseBody
    public int teamUpdate(String data){
        ObjectMapper objectMapper = new ObjectMapper();
        PersonnelArtisan personnelArtisan = null;
        try {
            personnelArtisan = objectMapper.readValue(data,PersonnelArtisan.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return teamService.teamUpdate(personnelArtisan);
    }
    /**
     * 删除班组技工
     */
    @RequestMapping("/teamRemove")
    public int teamRemove(Integer artisanid){
        return teamService.teamRemove(artisanid);
    }


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
    @RequestMapping("/institutionsSelectOpen")
    @ResponseBody
    public Map institutionsSelectOpen(Integer page,Integer limit,String data){
        ObjectMapper objectMapper = new ObjectMapper();
        PersonnelStaff personnelStaff = null;
        try {
            personnelStaff = objectMapper.readValue(data,PersonnelStaff.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        PageInfo<PersonnelStaff> pageInfo =  institutionsService.institutionsSelectOpen(page,limit,personnelStaff);
        Map<String,Object> map = new HashMap<>();
        map.put("code","0");
        map.put("data",pageInfo.getList());
        map.put("count",pageInfo.getTotal());
        return map;
    }
    /**
     * 查询所有部门
     * @return
     */
    @RequestMapping("/exDepartment")
    public List<PersonnelDepartment> exDepartment(){
        return institutionsService.exDepartment();
    }
    /**
     * 新增组织机构
     */
    @RequestMapping("/institutionsAdd")
    @ResponseBody
    public int institutionsAdd(String data){
        ObjectMapper objectMapper = new ObjectMapper();
        PersonnelStaff personnelStaff = null;
        try {
            personnelStaff = objectMapper.readValue(data,PersonnelStaff.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return institutionsService.institutionsAdd(personnelStaff);
    }
    /**
     * 修改组织机构
     */
    @RequestMapping("/institutionsUpdate")
    @ResponseBody
    public int institutionsUpdate(String data){
        ObjectMapper objectMapper = new ObjectMapper();
        PersonnelStaff personnelStaff = null;
        try {
            personnelStaff = objectMapper.readValue(data,PersonnelStaff.class);
        }catch (JsonProcessingException e){
            System.out.println("发送异常");
        }
        return institutionsService.institutionsUpdate(personnelStaff);
    }
    /**
     * 删除组织机构
     */
    @RequestMapping("/institutionsRemove")
    public int institutionsRemove(Integer id){
        return institutionsService.institutionsRemove(id);
    }
}
