package com.accp.service.data;

import com.accp.domain.DataCarExample;
import com.accp.domain.DataCarbrand;
import com.accp.domain.DataCarbrandExample;
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

    public PageInfo<DataCarbrand> selectDataCarbrand(String selectData,Integer page, Integer limit){
        Page<DataCarbrand> pageInfo = PageHelper.startPage(page,limit);
        DataCarbrandExample example = new DataCarbrandExample();
        if(selectData !=null && selectData !=""){
            if(selectData.matches("[0-9]+")){
                example.createCriteria().andIdEqualTo(Integer.valueOf(selectData));
            }else if(selectData.matches("[a-zA-Z]+")){
                example.createCriteria().andFirstletterEqualTo(selectData);
            }else{
                example.createCriteria().andCarbrandnameEqualTo(selectData);
            }
        }
        dataCarbrandMapper.selectByExample(example);
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
