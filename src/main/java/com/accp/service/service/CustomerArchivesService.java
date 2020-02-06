package com.accp.service.service;

import com.accp.domain.ClientClientdata;
import com.accp.domain.ClientClienttypeExample;
import com.accp.mapper.ClientClientdataMapper;
import com.accp.mapper.ClientClienttypeMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CustomerArchivesService {

    @Autowired(required = false)
    ClientClientdataMapper clientClientdataMapper;
    @Autowired(required = false)
    ClientClienttypeMapper clientClienttypeMapper;

    public int addClient(ClientClientdata clientClientdata){
        int result = clientClientdataMapper.insertSelective(clientClientdata);
        return result;
    }

    public int updateClient(ClientClientdata clientClientdata){
        int result = clientClientdataMapper.updateByPrimaryKeySelective(clientClientdata);
        return result;
    }


    public PageInfo<ClientClientdata> selectClient(int index, int limit){
        Page<ClientClientdata> page = PageHelper.startPage(index,limit);
        List<ClientClientdata> lists = clientClientdataMapper.selectByExample(null);
        for (ClientClientdata item : lists){
            item.setClientClienttype(clientClienttypeMapper.selectByPrimaryKey(item.getTypeid()));
        }
        return page.toPageInfo();
    }

    public int deleteClient(Integer id){
        ClientClientdata clientClientdata = clientClientdataMapper.selectByPrimaryKey(id);
        if(clientClientdata != null){
            int count = clientClientdataMapper.deleteByPrimaryKey(id);
            if(clientClientdata.getTypeid() != null && "".equals(clientClientdata.getTypeid())){
                clientClienttypeMapper.deleteByPrimaryKey(clientClientdata.getTypeid());
            }
            return count;
        }else{
            return 0;
        }
    }


}
