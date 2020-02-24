package com.accp.domain;

import java.util.List;

public class DataCommodity {
    private Integer id;

    private String name;

    private String brand;

    private String cartype;

    private String unit;

    private Integer commditytypeid;

    private String income;

    private String original;

    private String commoditygrade;

    private String commodityplace;

    private Integer firmnameid;

    private String firmnumber;

    private String barcode;

    private String size;

    private String volume;

    private String suttle;

    private Float primecost;

    private String sellway;

    private Float markuppercentage;

    private String code;

    private Float normalprice;

    private Float memberprice;

    private Float vipprice;

    private Float negotiatedprice;

    private Float claimprice;

    private Float insuranceprice;

    private String default1;

    private String default2;

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public DataCommoditytype getDataCommoditytype() {
        return dataCommoditytype;
    }

    public void setDataCommoditytype(DataCommoditytype dataCommoditytype) {
        this.dataCommoditytype = dataCommoditytype;
    }

    private List<Integer> ids;

    private  DataCommoditytype dataCommoditytype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getCommditytypeid() {
        return commditytypeid;
    }

    public void setCommditytypeid(Integer commditytypeid) {
        this.commditytypeid = commditytypeid;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getCommoditygrade() {
        return commoditygrade;
    }

    public void setCommoditygrade(String commoditygrade) {
        this.commoditygrade = commoditygrade;
    }

    public String getCommodityplace() {
        return commodityplace;
    }

    public void setCommodityplace(String commodityplace) {
        this.commodityplace = commodityplace;
    }

    public Integer getFirmnameid() {
        return firmnameid;
    }

    public void setFirmnameid(Integer firmnameid) {
        this.firmnameid = firmnameid;
    }

    public String getFirmnumber() {
        return firmnumber;
    }

    public void setFirmnumber(String firmnumber) {
        this.firmnumber = firmnumber;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getSuttle() {
        return suttle;
    }

    public void setSuttle(String suttle) {
        this.suttle = suttle;
    }

    public Float getPrimecost() {
        return primecost;
    }

    public void setPrimecost(Float primecost) {
        this.primecost = primecost;
    }

    public String getSellway() {
        return sellway;
    }

    public void setSellway(String sellway) {
        this.sellway = sellway;
    }

    public Float getMarkuppercentage() {
        return markuppercentage;
    }

    public void setMarkuppercentage(Float markuppercentage) {
        this.markuppercentage = markuppercentage;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Float getNormalprice() {
        return normalprice;
    }

    public void setNormalprice(Float normalprice) {
        this.normalprice = normalprice;
    }

    public Float getMemberprice() {
        return memberprice;
    }

    public void setMemberprice(Float memberprice) {
        this.memberprice = memberprice;
    }

    public Float getVipprice() {
        return vipprice;
    }

    public void setVipprice(Float vipprice) {
        this.vipprice = vipprice;
    }

    public Float getNegotiatedprice() {
        return negotiatedprice;
    }

    public void setNegotiatedprice(Float negotiatedprice) {
        this.negotiatedprice = negotiatedprice;
    }

    public Float getClaimprice() {
        return claimprice;
    }

    public void setClaimprice(Float claimprice) {
        this.claimprice = claimprice;
    }

    public Float getInsuranceprice() {
        return insuranceprice;
    }

    public void setInsuranceprice(Float insuranceprice) {
        this.insuranceprice = insuranceprice;
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