package com.accp.service.data;


import com.accp.domain.DataManufacturer;
import com.accp.domain.DataSupplierTree;
import com.accp.mapper.DataManufacturerMapper;
import com.accp.mapper.DataSupplierTreeMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
//厂商
public class ManufacturerService {

    @Autowired(required = false)
    DataManufacturerMapper dataManufacturerMapper;


    public PageInfo<DataManufacturer> selectDataManufacturer(Integer index, Integer limit, List<Integer> ids){
        Page<DataManufacturer> page = PageHelper.startPage(index,limit);
        DataManufacturer personnelStaff = new DataManufacturer();
        /*ids.add(1);
        ids.add(2);*/
        personnelStaff.setIds(ids);
        dataManufacturerMapper.selectDataManufacturer(personnelStaff);
        return page.toPageInfo();
    }



    public int  insertDataManufacturer(DataManufacturer dataManufacturer){
        int count=dataManufacturerMapper.insert(dataManufacturer);
        return  count;
    }

    public int deleteDataManufacturer(Integer id){
        int count=dataManufacturerMapper.deleteByPrimaryKey(id);
        return  count;
    }

    public int updateManufacturer(DataManufacturer dataManufacturer){
        return dataManufacturerMapper.updateByPrimaryKey(dataManufacturer);
    }
}
