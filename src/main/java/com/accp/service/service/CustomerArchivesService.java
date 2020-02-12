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


    public PageInfo<ClientClientdata> selectClient(int index, int limit,ClientClientdata clientClientdata){
        Page<ClientClientdata> page = PageHelper.startPage(index,limit);

        //System.out.println("abgVBBG".matches());
        if(clientClientdata.getSearchData() != null && clientClientdata.getSearchData() != "") {
            if (clientClientdata.getSearchData().matches("[a-zA-Z]+")) {

            } else if (clientClientdata.getSearchData().matches("1[3,4,5,8]\\d[\\s,-]?\\d{4}[\\s,-]?\\d{4}+")) {

            } else if (clientClientdata.getSearchData().matches("^[京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领A-Z]{1}[A-Z|a-z]{1}[(A-Z|a-z)0-9]{4}[(A-Z|a-z)0-9挂学警港澳]{1}$")) {

            }else{

            }
        }
        List<ClientClientdata> lists = clientClientdataMapper.selectClient(clientClientdata);
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
    public int deleteClientType(Integer id){
        int count = clientClienttypeMapper.deleteByPrimaryKey(id);
        return count;
    }


}
