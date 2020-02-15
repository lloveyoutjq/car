package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class DataMaintain {
    private Integer id;

    private String maintainname;

    public List<DataMaintain> getChildren() {
        return children;
    }

    public void setChildren(List<DataMaintain> children) {
        this.children = children;
    }

    private List<DataMaintain> children = new ArrayList<>();

    private String default1;

    private String default2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaintainname() {
        return maintainname;
    }

    public void setMaintainname(String maintainname) {
        this.maintainname = maintainname;
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