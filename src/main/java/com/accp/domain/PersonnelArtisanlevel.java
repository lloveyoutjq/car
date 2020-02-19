package com.accp.domain;

import java.util.List;

public class PersonnelArtisanlevel {
    private Integer artisanlevelid;

    private String artisanlevelname;

    private String artisanlevelweight;

    private String default1;

    private String default2;

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    private List<Integer> ids;

    public Integer getArtisanlevelid() {
        return artisanlevelid;
    }

    public void setArtisanlevelid(Integer artisanlevelid) {
        this.artisanlevelid = artisanlevelid;
    }

    public String getArtisanlevelname() {
        return artisanlevelname;
    }

    public void setArtisanlevelname(String artisanlevelname) {
        this.artisanlevelname = artisanlevelname;
    }

    public String getArtisanlevelweight() {
        return artisanlevelweight;
    }

    public void setArtisanlevelweight(String artisanlevelweight) {
        this.artisanlevelweight = artisanlevelweight;
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