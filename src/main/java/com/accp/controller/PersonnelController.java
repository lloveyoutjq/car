package com.accp.controller;

import com.accp.domain.*;
import com.accp.service.personnel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public List<PersonnelPost> jobsSelect(){
        return jobsService.jobsSelect();
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
    public int jobsAdd(PersonnelPost personnelPost){
        return jobsService.jobsAdd(personnelPost);
    }
    /**
     * 修改岗位定义
     */
    @RequestMapping("/jobsUpdate")
    @ResponseBody
    public int jobsUpdate(PersonnelPost personnelPost){
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
    public List<PersonnelLegworkcat> fieldSelect(){
        return fieldService.fieldSelect();
    }
    /**
     * 根据条件查询外勤车辆
     */
    @RequestMapping("/fieldSelectId")
    public PersonnelLegworkcat fieldSelectId(Integer legworkcatid){
        return null;
    }
    /**
     * 新增外勤车辆
     */
    @RequestMapping("/fieldAdd")
    @ResponseBody
    public int fieldAdd(PersonnelLegworkcat personnelLegworkcat){
        return fieldService.fieldAdd(personnelLegworkcat);
    }
    /**
     * 修改外勤车辆
     */
    @RequestMapping("/fieldUpdate")
    public int fieldUpdate(PersonnelLegworkcat personnelLegworkcat){
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
    public List<PersonnelArtisanlevel> starSelect(){
        return starService.starSelect();
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
    public int starAdd(PersonnelArtisanlevel personnelArtisanlevel){
        return starService.starAdd(personnelArtisanlevel);
    }
    /**
     * 修改技工星级
     */
    @RequestMapping("/starUpdate")
    public int starUpdate(PersonnelArtisanlevel personnelArtisanlevel){
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
    public List<PersonnelStaff> communicationSelect(){
        return communicationService.communicationSelect();
    }

    /**
     * 根据条件查询通讯名单
     */
    @RequestMapping("/communicationSelectId")
    @ResponseBody
    public PersonnelStaff communicationSelectId(Integer staffid,String staffname){
        return communicationService.communicationSelectId(staffid,staffname);
    }
    /**
     * 新增通讯名单
     */
    @RequestMapping("/communicationAdd")
    @ResponseBody
    public int communicationAdd(PersonnelStaff personnelStaff){
        return communicationService.communicationAdd(personnelStaff);
    }
    /**
     * 修改通讯名单
     */
    @RequestMapping("/communicationUpdate")
    public int communicationUpdate(PersonnelStaff personnelStaff){
        return communicationService.communicationUpdate(personnelStaff);
    }
    /**
     * 删除通讯名单
     */
    @RequestMapping("/communicationRemove")
    public int communicationRemove(String id){
        return communicationService.communicationRemove(id);
    }


    /**
     * 查询所有离职登记
     */
    @RequestMapping("/departureSelect")
    public List<PersonnelDimission> departureSelect(){
        return departureService.departureSelect();
    }

    /**
     * 根据条件查询离职登记
     */
    @RequestMapping("/departureSelectId")
    public PersonnelDimission departureSelectId(Integer id){

        return null;
    }
    /**
     * 新增离职登记
     */
    @RequestMapping("/departureAdd")
    @ResponseBody
    public int departureAdd(PersonnelDimission personnelDimission){
        return departureService.departureAdd(personnelDimission);
    }
    /**
     * 修改离职登记
     */
    @RequestMapping("/departureUpdate")
    public int departureUpdate(PersonnelDimission personnelDimission){
        return departureService.departureUpdate(personnelDimission);
    }
    /**
     * 删除离职登记
     */
    @RequestMapping("/departureRemove")
    public int departureRemove(Integer id){
        return departureService.departureRemove(id);
    }
}
