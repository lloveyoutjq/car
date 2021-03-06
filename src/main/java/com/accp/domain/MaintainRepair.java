package com.accp.domain;

import java.util.Date;
import java.util.List;

public class MaintainRepair {
    private String number;

    private Integer carinfoid;

    private Integer counselorid;

    private String oil;

    private String type;

    private String worktime;

    private String getman;

    private Date overworkdate;

    private String setter;

    private String company;

    private Date beforedate;

    private Float price;

    private String remark;

    private String state;

    private Integer teamid;

    private String status;

    private Date completedate;

    private Date settledate;

    private Date pickdate;

    private String default1;

    private String default2;

    private ClientCarinfo clientCarinfo;

    private ClientClientdata clientClientdata;

    private String tname;

    private List<DataMaintenanceItems> dataMaintenanceItemsList;

    private List<MaintainEwitem> maintainEwitemList;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getCarinfoid() {
        return carinfoid;
    }

    public void setCarinfoid(Integer carinfoid) {
        this.carinfoid = carinfoid;
    }

    public Integer getCounselorid() {
        return counselorid;
    }

    public void setCounselorid(Integer counselorid) {
        this.counselorid = counselorid;
    }

    public String getOil() {
        return oil;
    }

    public void setOil(String oil) {
        this.oil = oil;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWorktime() {
        return worktime;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime;
    }

    public String getGetman() {
        return getman;
    }

    public void setGetman(String getman) {
        this.getman = getman;
    }

    public Date getOverworkdate() {
        return overworkdate;
    }

    public void setOverworkdate(Date overworkdate) {
        this.overworkdate = overworkdate;
    }

    public String getSetter() {
        return setter;
    }

    public void setSetter(String setter) {
        this.setter = setter;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Date getBeforedate() {
        return beforedate;
    }

    public void setBeforedate(Date before) {
        this.beforedate = before;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCompletedate() {
        return completedate;
    }

    public void setCompletedate(Date completedate) {
        this.completedate = completedate;
    }

    public Date getSettledate() {
        return settledate;
    }

    public void setSettledate(Date settledate) {
        this.settledate = settledate;
    }

    public Date getPickdate() {
        return pickdate;
    }

    public void setPickdate(Date pickdate) {
        this.pickdate = pickdate;
    }

    public String getDefault1() {
        return default1;
    }

    public void setDefault1(String default1) {
        this.default1 = default1;
    }

    public String getDefault2() {
        return default2;
    }

    public void setDefault2(String default2) {
        this.default2 = default2;
    }

    public ClientCarinfo getClientCarinfo() {
        return clientCarinfo;
    }

    public void setClientCarinfo(ClientCarinfo clientCarinfo) {
        this.clientCarinfo = clientCarinfo;
    }

    public ClientClientdata getClientClientdata() {
        return clientClientdata;
    }

    public void setClientClientdata(ClientClientdata clientClientdata) {
        this.clientClientdata = clientClientdata;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public List<DataMaintenanceItems> getDataMaintenanceItemsList() {
        return dataMaintenanceItemsList;
    }

    public void setDataMaintenanceItemsList(List<DataMaintenanceItems> dataMaintenanceItemsList) {
        this.dataMaintenanceItemsList = dataMaintenanceItemsList;
    }

    public List<MaintainEwitem> getMaintainEwitemList() {
        return maintainEwitemList;
    }

    public void setMaintainEwitemList(List<MaintainEwitem> maintainEwitemList) {
        this.maintainEwitemList = maintainEwitemList;
    }
}