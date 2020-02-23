package com.accp.entity;

import java.util.Date;

public class HomeUserList {
    private int id;
    private String name;
    private String state;
    private Date pastCodeDate;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getPastCodeDate() {
        return pastCodeDate;
    }

    public void setPastCodeDate(Date pastCodeDate) {
        this.pastCodeDate = pastCodeDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
