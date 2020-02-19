package com.accp.domain;

import java.util.Date;

public class MaintainMaintenanceRegistration {
    private Integer id;

    private Integer carinfoid;

    private String maintainname;

    private Float mileage;

    private Date mileagedate;

    private String remark;

    private Integer realmileage;

    private Date realmileagedate;

    private String default1;

    private String default2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCarinfoid() {
        return carinfoid;
    }

    public void setCarinfoid(Integer carinfoid) {
        this.carinfoid = carinfoid;
    }

    public String getMaintainname() {
        return maintainname;
    }

    public void setMaintainname(String maintainname) {
        this.maintainname = maintainname;
    }

    public Float getMileage() {
        return mileage;
    }

    public void setMileage(Float mileage) {
        this.mileage = mileage;
    }

    public Date getMileagedate() {
        return mileagedate;
    }

    public void setMileagedate(Date mileagedate) {
        this.mileagedate = mileagedate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getRealmileage() {
        return realmileage;
    }

    public void setRealmileage(Integer realmileage) {
        this.realmileage = realmileage;
    }

    public Date getRealmileagedate() {
        return realmileagedate;
    }

    public void setRealmileagedate(Date realmileagedate) {
        this.realmileagedate = realmileagedate;
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