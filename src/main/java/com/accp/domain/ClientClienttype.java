package com.accp.domain;

import java.util.Date;

public class ClientClienttype {
    private Integer id;

    private String clienttype;

    private Integer validty;

    private Float cost;

    private String address;

    private String type;

    private Float discount;

    private Integer integral;

    private Date starttime;

    private Date endtime;

    private String default1;

    private String default2;

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClienttype() {
        return clienttype;
    }

    public void setClienttype(String clienttype) {
        this.clienttype = clienttype;
    }

    public Integer getValidty() {
        return validty;
    }

    public void setValidty(Integer validty) {
        this.validty = validty;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
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
}