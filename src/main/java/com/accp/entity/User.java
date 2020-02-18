package com.accp.entity;

import java.util.Date;

public class User {
    private int type;
    private String user;
    private String password;
    private String code;
    private long pastCodeDate;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getPastCodeDate() {
        return pastCodeDate;
    }

    public void setPastCodeDate(long pastCodeDate) {
        this.pastCodeDate = pastCodeDate;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
