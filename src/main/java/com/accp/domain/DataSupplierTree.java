package com.accp.domain;

public class DataSupplierTree {
    private Integer id;

    private String name;

    private Integer parentid;

    private String default1;

    private String default2;

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

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
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