package com.accp.domain;

public class PersonnelLegworkcat {
    private Integer legworkcatid;

    private String licenseplatenumber;

    private String brand;

    private String model;

    private String mileage;

    private Integer artisanclassid;

    private String default1;

    private String default2;

    private PersonnelArtisanclass personnelArtisanclass;

    public PersonnelArtisanclass getPersonnelArtisanclass() {
        return personnelArtisanclass;
    }

    public void setPersonnelArtisanclass(PersonnelArtisanclass personnelArtisanclass) {
        this.personnelArtisanclass = personnelArtisanclass;
    }


    public Integer getLegworkcatid() {
        return legworkcatid;
    }

    public void setLegworkcatid(Integer legworkcatid) {
        this.legworkcatid = legworkcatid;
    }

    public String getLicenseplatenumber() {
        return licenseplatenumber;
    }

    public void setLicenseplatenumber(String licenseplatenumber) {
        this.licenseplatenumber = licenseplatenumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public Integer getArtisanclassid() {
        return artisanclassid;
    }

    public void setArtisanclassid(Integer artisanclassid) {
        this.artisanclassid = artisanclassid;
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