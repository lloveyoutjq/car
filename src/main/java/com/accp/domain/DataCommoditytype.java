package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class DataCommoditytype {
    private Integer id;

    private String typename;

    private Integer parentid;

    private String default1;

    private String default2;

    private List<DataCommoditytype> children = new ArrayList<>();

    private String title;

    public List<DataCommoditytype> getChildren() {
        return children;
    }

    public void setChildren(List<DataCommoditytype> children) {
        this.children = children;
    }

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

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
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