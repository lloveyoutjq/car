package com.accp.domain;

import java.util.Date;
import java.util.List;

public class PersonnelArtisan {
    private Integer artisanid;

    private String artisanname;

    private String artisansex;

    private Integer artisanclassid;

    private String password;

    private String email;

    private String authcode;

    private Date pastcodedate;

    private String phone;

    private String account;

    private String address;

    private Date birthday;

    private String wechat;

    private String identitycard;

    private String residence;

    private String bank;

    private String bankaccount;

    private Integer artisanlevelid;

    private Boolean groupleader;

    private String maintaintype;

    private String maintainbrand;

    private Integer roleid;

    private String default1;

    private String default2;

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    private List<Integer> ids;

    private PersonnelArtisanlevel personnelArtisanlevel;
    private PersonnelArtisanclass personnelArtisanclass;

    public PersonnelArtisanlevel getPersonnelArtisanlevel() {
        return personnelArtisanlevel;
    }

    public void setPersonnelArtisanlevel(PersonnelArtisanlevel personnelArtisanlevel) {
        this.personnelArtisanlevel = personnelArtisanlevel;
    }

    public PersonnelArtisanclass getPersonnelArtisanclass() {
        return personnelArtisanclass;
    }

    public void setPersonnelArtisanclass(PersonnelArtisanclass personnelArtisanclass) {
        this.personnelArtisanclass = personnelArtisanclass;
    }

    public Integer getArtisanid() {
        return artisanid;
    }

    public void setArtisanid(Integer artisanid) {
        this.artisanid = artisanid;
    }

    public String getArtisanname() {
        return artisanname;
    }

    public void setArtisanname(String artisanname) {
        this.artisanname = artisanname;
    }

    public String getArtisansex() {
        return artisansex;
    }

    public void setArtisansex(String artisansex) {
        this.artisansex = artisansex;
    }

    public Integer getArtisanclassid() {
        return artisanclassid;
    }

    public void setArtisanclassid(Integer artisanclassid) {
        this.artisanclassid = artisanclassid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAuthcode() {
        return authcode;
    }

    public void setAuthcode(String authcode) {
        this.authcode = authcode;
    }

    public Date getPastcodedate() {
        return pastcodedate;
    }

    public void setPastcodedate(Date pastcodedate) {
        this.pastcodedate = pastcodedate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getIdentitycard() {
        return identitycard;
    }

    public void setIdentitycard(String identitycard) {
        this.identitycard = identitycard;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }

    public Integer getArtisanlevelid() {
        return artisanlevelid;
    }

    public void setArtisanlevelid(Integer artisanlevelid) {
        this.artisanlevelid = artisanlevelid;
    }

    public Boolean getGroupleader() {
        return groupleader;
    }

    public void setGroupleader(Boolean groupleader) {
        this.groupleader = groupleader;
    }

    public String getMaintaintype() {
        return maintaintype;
    }

    public void setMaintaintype(String maintaintype) {
        this.maintaintype = maintaintype;
    }

    public String getMaintainbrand() {
        return maintainbrand;
    }

    public void setMaintainbrand(String maintainbrand) {
        this.maintainbrand = maintainbrand;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
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