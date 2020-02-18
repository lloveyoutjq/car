package com.accp.domain;

public class DataMaintenanceItems {
    private Integer id;

    private String itemsname;

    private Integer typeid;

    private String remark;

    private Float normalprice;

    private Float memberprice;

    private Float vipprice;

    private Float negotiatedprice;

    private Float claimprice;

    private Float insuranceprice;

    private String default1;

    private String default2;

    private MaintainRepair maintainRepair;

    private ClientCarinfo clientCarinfo;

    private PersonnelArtisanclass personnelArtisanclass;

    private  PersonnelStaff personnelStaff;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemsname() {
        return itemsname;
    }

    public void setItemsname(String itemsname) {
        this.itemsname = itemsname;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Float getNormalprice() {
        return normalprice;
    }

    public void setNormalprice(Float normalprice) {
        this.normalprice = normalprice;
    }

    public Float getMemberprice() {
        return memberprice;
    }

    public void setMemberprice(Float memberprice) {
        this.memberprice = memberprice;
    }

    public Float getVipprice() {
        return vipprice;
    }

    public void setVipprice(Float vipprice) {
        this.vipprice = vipprice;
    }

    public Float getNegotiatedprice() {
        return negotiatedprice;
    }

    public void setNegotiatedprice(Float negotiatedprice) {
        this.negotiatedprice = negotiatedprice;
    }

    public Float getClaimprice() {
        return claimprice;
    }

    public void setClaimprice(Float claimprice) {
        this.claimprice = claimprice;
    }

    public Float getInsuranceprice() {
        return insuranceprice;
    }

    public void setInsuranceprice(Float insuranceprice) {
        this.insuranceprice = insuranceprice;
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

    public MaintainRepair getMaintainRepair() {
        return maintainRepair;
    }

    public void setMaintainRepair(MaintainRepair maintainRepair) {
        this.maintainRepair = maintainRepair;
    }

    public ClientCarinfo getClientCarinfo() {
        return clientCarinfo;
    }

    public void setClientCarinfo(ClientCarinfo clientCarinfo) {
        this.clientCarinfo = clientCarinfo;
    }

    public PersonnelArtisanclass getPersonnelArtisanclass() {
        return personnelArtisanclass;
    }

    public void setPersonnelArtisanclass(PersonnelArtisanclass personnelArtisanclass) {
        this.personnelArtisanclass = personnelArtisanclass;
    }

    public PersonnelStaff getPersonnelStaff() {
        return personnelStaff;
    }

    public void setPersonnelStaff(PersonnelStaff personnelStaff) {
        this.personnelStaff = personnelStaff;
    }
}