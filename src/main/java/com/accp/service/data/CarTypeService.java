package com.accp.service.data;

import com.accp.domain.DataCarbrand;
import com.accp.mapper.DataCarbrandMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class CarTypeService {

    @Autowired(required = false)
    DataCarbrandMapper dataCarbrandMapper;

    public PageInfo<DataCarbrand> selectDataCarbrand(Integer page, Integer limit){
        Page<DataCarbrand> pageInfo = PageHelper.startPage(page,limit);
        dataCarbrandMapper.selectByExample(null);
        return pageInfo.toPageInfo();
    }

    public int  insertDataCarbrand(DataCarbrand DataCarbrand){
        int count=dataCarbrandMapper.insert(DataCarbrand);
        return  count;
    }

    public int deleteDataCarbrand(Integer id){
        int count=dataCarbrandMapper.deleteByPrimaryKey(id);
        return  count;
    }

    public int updateDataCar(DataCarbrand dataCarbrand){
        return dataCarbrandMapper.updateByPrimaryKeySelective(dataCarbrand);
    }

}
