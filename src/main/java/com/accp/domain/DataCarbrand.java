package com.accp.domain;

import java.util.List;

public class DataCarbrand {
    private Integer id;

    private String carbrandname;

    private String firstletter;

    private String default1;

    private String defailt2;

    private List<DataCar> list;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarbrandname() {
        return carbrandname;
    }

    public void setCarbrandname(String carbrandname) {
        this.carbrandname = carbrandname;
    }

    public String getFirstletter() {
        return firstletter;
    }

    public void setFirstletter(String firstletter) {
        this.firstletter = firstletter;
    }

    public String getDefault1() {
        return default1;
    }

    public void setDefault1(String default1) {
        this.default1 = default1;
    }

    public String getDefailt2() {
        return defailt2;
    }

    public void setDefailt2(String defailt2) {
        this.defailt2 = defailt2;
    }
}