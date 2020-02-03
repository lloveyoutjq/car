package com.accp.service.service;

import com.accp.domain.ClientClientdata;
import com.accp.mapper.ClientClientdataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class customerArchivesService {

    @Autowired(required = false)
    ClientClientdataMapper clientClientdataMapper;

    public int addClient(ClientClientdata clientClientdata){
        int result = clientClientdataMapper.insertSelective(clientClientdata);
        return result;
    }

    public int updateClient(ClientClientdata clientClientdata){
        int result = clientClientdataMapper.updateByPrimaryKeySelective(clientClientdata);
        return result;
    }

}
