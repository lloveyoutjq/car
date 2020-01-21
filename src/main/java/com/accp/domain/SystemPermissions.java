package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class SystemPermissions {
    private Integer id;

    private String name;

    private String ename;

    private Integer catalog;

    private Integer parentid;

    private String path;

    private String default1;

    private String default2;

    private List<SystemPermissions> childrens = new ArrayList<SystemPermissions>();

    public List<SystemPermissions> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<SystemPermissions> childrens) {
        this.childrens = childrens;
    }

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

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getCatalog() {
        return catalog;
    }

    public void setCatalog(Integer catalog) {
        this.catalog = catalog;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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