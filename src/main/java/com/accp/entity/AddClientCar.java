package com.accp.entity;

import com.accp.domain.ClientCarinfo;
import com.accp.domain.ClientClientdata;

public class AddClientCar {
    private ClientClientdata  clientClientdata;
    private ClientCarinfo clientCarinfo;

    public ClientClientdata getClientClientdata() {
        return clientClientdata;
    }

    public void setClientClientdata(ClientClientdata clientClientdata) {
        clientClientdata = clientClientdata;
    }

    public ClientCarinfo getClientCarinfo() {
        return clientCarinfo;
    }

    public void setClientCarinfo(ClientCarinfo clientCarinfo) {
        this.clientCarinfo = clientCarinfo;
    }
}
