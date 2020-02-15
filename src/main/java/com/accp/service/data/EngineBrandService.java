package com.accp.service.data;

import com.accp.domain.DataEngineBrand;
import com.accp.mapper.DataEngineBrandMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EngineBrandService {

    @Autowired(required = false)
    DataEngineBrandMapper dataEngineBrandMapper;

    public PageInfo<DataEngineBrand> selectDataEnginebrand(Integer page, Integer limit){
        Page<DataEngineBrand> pageInfo = PageHelper.startPage(page,limit);
        dataEngineBrandMapper.selectByExample(null);
        return pageInfo.toPageInfo();
    }

    public int  insertDataEnginebrand(DataEngineBrand dataEngineBrand){
        int count=dataEngineBrandMapper.insert(dataEngineBrand);
        return  count;
    }

    public int deleteDataEnginebrand(Integer id){
        int count=dataEngineBrandMapper.deleteByPrimaryKey(id);
        return  count;
    }

    public int updateEnginebrand(DataEngineBrand dataEngineBrand){
        return dataEngineBrandMapper.updateByPrimaryKey(dataEngineBrand);
    }
}
