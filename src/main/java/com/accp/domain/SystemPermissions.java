package com.accp.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SystemPermissions {
    private Integer id;

    private String name;

    private String ename;

    private Integer catalog;

    private Integer parentid;

    private String path;

    private String default1;

    private String default2;

    private List<SystemPermissions> children = new ArrayList<SystemPermissions>(); //子项

    private String title; //标题

    private Map checkArr; //复选框

    private Integer state; //状态

    private boolean hide; //控制节点隐藏还是显示

    public boolean isHide() {
        return hide;
    }

    public void setHide(boolean hide) {
        this.hide = hide;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Map getCheckArr() {
        return checkArr;
    }

    public void setCheckArr(Map checkArr) {
        this.checkArr = checkArr;
    }

    public List<SystemPermissions> getChildren() {
        return children;
    }

    public void setChildren(List<SystemPermissions> childrens) {
        this.children = childrens;
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