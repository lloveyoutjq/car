package com.accp.domain;

import java.math.BigDecimal;

public class DataRepairItems {
    private Integer id;

    private String rescuerepairid;

    private Integer itemid;

    private String priceclass;

    private String preeofchargefor;

    private Integer num;

    private BigDecimal beforeThePreferential;

    private BigDecimal afterThePreferential;

    private String workordernumber;

    private String fault;

    private String faultresult;

    private Integer staffid;

    private Integer teamid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRescuerepairid() {
        return rescuerepairid;
    }

    public void setRescuerepairid(String rescuerepairid) {
        this.rescuerepairid = rescuerepairid;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public String getPriceclass() {
        return priceclass;
    }

    public void setPriceclass(String priceclass) {
        this.priceclass = priceclass;
    }

    public String getPreeofchargefor() {
        return preeofchargefor;
    }

    public void setPreeofchargefor(String preeofchargefor) {
        this.preeofchargefor = preeofchargefor;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigDecimal getBeforeThePreferential() {
        return beforeThePreferential;
    }

    public void setBeforeThePreferential(BigDecimal beforeThePreferential) {
        this.beforeThePreferential = beforeThePreferential;
    }

    public BigDecimal getAfterThePreferential() {
        return afterThePreferential;
    }

    public void setAfterThePreferential(BigDecimal afterThePreferential) {
        this.afterThePreferential = afterThePreferential;
    }

    public String getWorkordernumber() {
        return workordernumber;
    }

    public void setWorkordernumber(String workordernumber) {
        this.workordernumber = workordernumber;
    }

    public String getFault() {
        return fault;
    }

    public void setFault(String fault) {
        this.fault = fault;
    }

    public String getFaultresult() {
        return faultresult;
    }

    public void setFaultresult(String faultresult) {
        this.faultresult = faultresult;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }
}