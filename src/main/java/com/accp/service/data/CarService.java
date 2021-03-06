package com.accp.service.data;

import com.accp.domain.DataCar;
import com.accp.domain.DataCarExample;
import com.accp.mapper.DataCarMapper;
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

    public PageInfo<DataCar> selectDataCar(String selectData,Integer page, Integer limit){
        Page<DataCar> pageInfo = PageHelper.startPage(page,limit);
        DataCarExample example = new DataCarExample();
        if(selectData !=null && selectData !=""){
            if(selectData.matches("[0-9]+")){
                example.createCriteria().andIdEqualTo(Integer.valueOf(selectData));
            }else{
                example.createCriteria().andCartypenameEqualTo(selectData);
            }
        }
        dataCarMapper.selectByExample(example);
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

    public int updateDataCar(DataCar dataCar){
        return  dataCarMapper.updateByPrimaryKey(dataCar);

    }


}
