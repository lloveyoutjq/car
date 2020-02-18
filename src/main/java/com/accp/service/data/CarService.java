package com.accp.service.data;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CarService {

    @Autowired(required = false)
    DataCarMapper dataCarMapper;

    public PageInfo<DataCar> selectDataCar(Integer page, Integer limit){
        Page<DataCar> pageInfo = PageHelper.startPage(page,limit);
        dataCarMapper.selectByExample(null);
        return pageInfo.toPageInfo();
    }

    public int  insertDataCar(DataCar dataCar){
        int count=dataCarMapper.insert(dataCar);
        return  count;
    }

    public int deleteDataCar(Integer id){
        int count=dataCarMapper.deleteByPrimaryKey(id);
        return  count;
    }


}
