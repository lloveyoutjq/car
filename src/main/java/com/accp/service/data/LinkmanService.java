package com.accp.service.data;

import com.accp.domain.DataLinkman;
import com.accp.domain.DataLinkmanExample;
import com.accp.mapper.DataLinkmanMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LinkmanService {
    @Autowired(required = false)
    DataLinkmanMapper dataLinkmanMapper;

    public PageInfo<DataLinkman> selectDataLinkman(Integer index, Integer limit,String id){
        Page<DataLinkman> page = PageHelper.startPage(index,limit);
        DataLinkmanExample example = new DataLinkmanExample();
        if(id != null){
            example.createCriteria().andManufactureEqualTo(Integer.valueOf(id));
        }


        dataLinkmanMapper.selectByExample(example);
        return page.toPageInfo();
    }



    public int  insertDataLinkman(DataLinkman dataLinkman){
        int count=dataLinkmanMapper.insertSelective(dataLinkman);
        return  count;
    }

    public int deleteDataLinkman(Integer id){
        int count=dataLinkmanMapper.deleteByPrimaryKey(id);
        return  count;
    }

    public int updateLinkman(DataLinkman dataLinkman){
        return dataLinkmanMapper.updateByPrimaryKeySelective(dataLinkman);
    }
}
