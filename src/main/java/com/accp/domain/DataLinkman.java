package com.accp.domain;

import java.util.List;

public class DataLinkman {
    private Integer id;

    private String name;

    private String position;

    private String phone;

    private String telephone;

    private String email;

    private Integer manufacture;

    private String default1;

    private String default2;

    private  DataManufacturer dataManufacturer;

    public DataManufacturer getDataManufacturer() {
        return dataManufacturer;
    }

    public void setDataManufacturer(DataManufacturer dataManufacturer) {
        this.dataManufacturer = dataManufacturer;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    private List<Integer> ids;

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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getManufacture() {
        return manufacture;
    }

    public void setManufacture(Integer manufacture) {
        this.manufacture = manufacture;
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