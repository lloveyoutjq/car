package com.accp.domain;

import java.util.Date;

public class MaintainCompleted {
    private Integer id;

    private Integer eligibility;

    private Date predicttime;

    private Date nowtime;

    private String reason;

    private Integer workid;

    private Integer dutyid;

    private Float price;

    private Integer maintenanceid;

    private Integer reworkcount;

    private String reasonforrework;

    private String default1;

    private String default2;

    private DataMaintenanceItems dataMaintenanceItems;

    private MaintainRescue maintainRescue;

    private DataItemtype dataItemtype;

    private ClientCarinfo clientCarinfo;

    private ClientClientdata clientClientdata;

    private DataCar dataCar;

    private PersonnelStaff personnelStaff;

    private DataRepairItems dataRepairItems;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEligibility() {
        return eligibility;
    }

    public void setEligibility(Integer eligibility) {
        this.eligibility = eligibility;
    }

    public Date getPredicttime() {
        return predicttime;
    }

    public void setPredicttime(Date predicttime) {
        this.predicttime = predicttime;
    }

    public Date getNowtime() {
        return nowtime;
    }

    public void setNowtime(Date nowtime) {
        this.nowtime = nowtime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getWorkid() {
        return workid;
    }

    public void setWorkid(Integer workid) {
        this.workid = workid;
    }

    public Integer getDutyid() {
        return dutyid;
    }

    public void setDutyid(Integer dutyid) {
        this.dutyid = dutyid;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getMaintenanceid() {
        return maintenanceid;
    }

    public void setMaintenanceid(Integer maintenanceid) {
        this.maintenanceid = maintenanceid;
    }

    public Integer getReworkcount() {
        return reworkcount;
    }

    public void setReworkcount(Integer reworkcount) {
        this.reworkcount = reworkcount;
    }

    public String getReasonforrework() {
        return reasonforrework;
    }

    public void setReasonforrework(String reasonforrework) {
        this.reasonforrework = reasonforrework;
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

    public DataMaintenanceItems getDataMaintenanceItems() {
        return dataMaintenanceItems;
    }

    public void setDataMaintenanceItems(DataMaintenanceItems dataMaintenanceItems) {
        this.dataMaintenanceItems = dataMaintenanceItems;
    }

    public MaintainRescue getMaintainRescue() {
        return maintainRescue;
    }

    public void setMaintainRescue(MaintainRescue maintainRescue) {
        this.maintainRescue = maintainRescue;
    }

    public DataItemtype getDataItemtype() {
        return dataItemtype;
    }

    public void setDataItemtype(DataItemtype dataItemtype) {
        this.dataItemtype = dataItemtype;
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

    public DataCar getDataCar() {
        return dataCar;
    }

    public void setDataCar(DataCar dataCar) {
        this.dataCar = dataCar;
    }

    public PersonnelStaff getPersonnelStaff() {
        return personnelStaff;
    }

    public void setPersonnelStaff(PersonnelStaff personnelStaff) {
        this.personnelStaff = personnelStaff;
    }

    public DataRepairItems getDataRepairItems() {
        return dataRepairItems;
    }

    public void setDataRepairItems(DataRepairItems dataRepairItems) {
        this.dataRepairItems = dataRepairItems;
    }
}