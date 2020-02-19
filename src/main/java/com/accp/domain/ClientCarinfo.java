package com.accp.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ClientCarinfo {
    private Integer id;

    private Integer clientid;

    private String carnumber;

    private Integer carbrandid;

    private Integer carid;

    private String carer;

    private String carerphone;

    private String borndate;

    private String affiliation;

    private String drivinglicence;

    private String framenumber;

    private String enginenumber;

    private Float yearprice;

    private Float mileage;

    private Integer engineid;

    private String carrying;

    private String buydate;

    private String dutydate;

    private String carcheckdate;

    private String fueloiltype;

    private String carseries;

    private String jqinsurance;

    private String jqinsurancedate;

    private String syinsurance;

    private String syinsurancedate;

    private String maintain;

    private String maintaindate;

    private String default1;

    private String default2;

    private ClientClientdata clientClientdata;

    private DataCarbrand dataCarbrand;

    private DataEngineBrand dataEngineBrand;

    private String searchData;

    public String getSearchData() {
        return searchData;
    }

    public void setSearchData(String searchData) {
        this.searchData = searchData;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber;
    }

    public Integer getCarbrandid() {
        return carbrandid;
    }

    public void setCarbrandid(Integer carbrandid) {
        this.carbrandid = carbrandid;
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public String getCarer() {
        return carer;
    }

    public void setCarer(String carer) {
        this.carer = carer;
    }

    public String getCarerphone() {
        return carerphone;
    }

    public void setCarerphone(String carerphone) {
        this.carerphone = carerphone;
    }

    public String getBorndate() {
        return borndate;
    }

    public void setBorndate(String borndate) {
        this.borndate = borndate;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getDrivinglicence() {
        return drivinglicence;
    }

    public void setDrivinglicence(String drivinglicence) {
        this.drivinglicence = drivinglicence;
    }

    public String getFramenumber() {
        return framenumber;
    }

    public void setFramenumber(String framenumber) {
        this.framenumber = framenumber;
    }

    public String getEnginenumber() {
        return enginenumber;
    }

    public void setEnginenumber(String enginenumber) {
        this.enginenumber = enginenumber;
    }

    public Float getYearprice() {
        return yearprice;
    }

    public void setYearprice(Float yearprice) {
        this.yearprice = yearprice;
    }

    public Float getMileage() {
        return mileage;
    }

    public void setMileage(Float mileage) {
        this.mileage = mileage;
    }

    public Integer getEngineid() {
        return engineid;
    }

    public void setEngineid(Integer engineid) {
        this.engineid = engineid;
    }

    public String getCarrying() {
        return carrying;
    }

    public void setCarrying(String carrying) {
        this.carrying = carrying;
    }

    public String getBuydate() {
        return buydate;
    }

    public void setBuydate(String buydate) {
        this.buydate = buydate;
    }

    public String getDutydate() {
        return dutydate;
    }

    public void setDutydate(String dutydate) {
        this.dutydate = dutydate;
    }

    public String getCarcheckdate() {
        return carcheckdate;
    }

    public void setCarcheckdate(String carcheckdate) {
        this.carcheckdate = carcheckdate;
    }

    public String getFueloiltype() {
        return fueloiltype;
    }

    public void setFueloiltype(String fueloiltype) {
        this.fueloiltype = fueloiltype;
    }

    public String getCarseries() {
        return carseries;
    }

    public void setCarseries(String carseries) {
        this.carseries = carseries;
    }

    public String getJqinsurance() {
        return jqinsurance;
    }

    public void setJqinsurance(String jqinsurance) {
        this.jqinsurance = jqinsurance;
    }

    public String getJqinsurancedate() {
        return jqinsurancedate;
    }

    public void setJqinsurancedate(String jqinsurancedate) {
        this.jqinsurancedate = jqinsurancedate;
    }

    public String getSyinsurance() {
        return syinsurance;
    }

    public void setSyinsurance(String syinsurance) {
        this.syinsurance = syinsurance;
    }

    public String getSyinsurancedate() {
        return syinsurancedate;
    }

    public void setSyinsurancedate(String syinsurancedate) {
        this.syinsurancedate = syinsurancedate;
    }

    public String getMaintain() {
        return maintain;
    }

    public void setMaintain(String maintain) {
        this.maintain = maintain;
    }

    public String getMaintaindate() {
        return maintaindate;
    }

    public void setMaintaindate(String maintaindate) {
        this.maintaindate = maintaindate;
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

    public ClientClientdata getClientClientdata() {
        return clientClientdata;
    }

    public void setClientClientdata(ClientClientdata clientClientdata) {
        this.clientClientdata = clientClientdata;
    }

    public DataCarbrand getDataCarbrand() {
        return dataCarbrand;
    }

    public void setDataCarbrand(DataCarbrand dataCarbrand) {
        this.dataCarbrand = dataCarbrand;
    }

    public DataEngineBrand getDataEngineBrand() {
        return dataEngineBrand;
    }

    public void setDataEngineBrand(DataEngineBrand dataEngineBrand) {
        this.dataEngineBrand = dataEngineBrand;
    }
}