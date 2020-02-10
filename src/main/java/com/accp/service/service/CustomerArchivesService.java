package com.accp.service.service;

import com.accp.domain.ClientClientdata;
import com.accp.domain.ClientClienttype;
import com.accp.mapper.ClientClientdataMapper;
import com.accp.mapper.ClientClienttypeMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

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

    /**
     * 查询所有客户类型
     * @return
     */
    public PageInfo<ClientClienttype> selectClientTypeAll(Integer index, Integer size){
        Page<ClientClienttype> page = PageHelper.startPage(index,size);
        clientClienttypeMapper.selectByExample(null);
        return page.toPageInfo();
    }

    /**
     * 添加客户类型
     * @param clientClienttype
     * @return
     */
    public int addClientType(ClientClienttype clientClienttype){
        int count = clientClienttypeMapper.insertSelective(clientClienttype);
        return count;
    }

    /**
     * 修改客户类型
     * @param clientClienttype
     * @return
     */
    public int updateClientType(ClientClienttype clientClienttype){
        int count = clientClienttypeMapper.updateByPrimaryKeySelective(clientClienttype);
        return count;
    }

    /**
     * 删除客户类型
     * @param id
     * @return
     */
    public int deleteClientType(int id){
        int count = clientClienttypeMapper.deleteByPrimaryKey(id);
        return count;
    }


}
