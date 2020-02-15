package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class PersonnelArtisanclass {
    private Integer artisanclassid;

    private String artisanclassname;

    private String artisanclassweight;

    private Integer parentid;

    private String instationwhite;

    private String instationblack;

    private String outsidewhite;

    private String outsideblack;

    private String waywhite;

    private String wayblack;

    private String oilcost;

    private String default1;

    private String default2;

    private List<PersonnelArtisanclass> children = new ArrayList<>();

    private String title;

    private Integer id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<PersonnelArtisanclass> getChildren() {
        return children;
    }

    public void setChildren(List<PersonnelArtisanclass> children) {
        this.children = children;
    }

    public Integer getArtisanclassid() {
        return artisanclassid;
    }

    public void setArtisanclassid(Integer artisanclassid) {
        this.artisanclassid = artisanclassid;
    }

    public String getArtisanclassname() {
        return artisanclassname;
    }

    public void setArtisanclassname(String artisanclassname) {
        this.artisanclassname = artisanclassname;
    }

    public String getArtisanclassweight() {
        return artisanclassweight;
    }

    public void setArtisanclassweight(String artisanclassweight) {
        this.artisanclassweight = artisanclassweight;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getInstationwhite() {
        return instationwhite;
    }

    public void setInstationwhite(String instationwhite) {
        this.instationwhite = instationwhite;
    }

    public String getInstationblack() {
        return instationblack;
    }

    public void setInstationblack(String instationblack) {
        this.instationblack = instationblack;
    }

    public String getOutsidewhite() {
        return outsidewhite;
    }

    public void setOutsidewhite(String outsidewhite) {
        this.outsidewhite = outsidewhite;
    }

    public String getOutsideblack() {
        return outsideblack;
    }

    public void setOutsideblack(String outsideblack) {
        this.outsideblack = outsideblack;
    }

    public String getWaywhite() {
        return waywhite;
    }

    public void setWaywhite(String waywhite) {
        this.waywhite = waywhite;
    }

    public String getWayblack() {
        return wayblack;
    }

    public void setWayblack(String wayblack) {
        this.wayblack = wayblack;
    }

    public String getOilcost() {
        return oilcost;
    }

    public void setOilcost(String oilcost) {
        this.oilcost = oilcost;
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