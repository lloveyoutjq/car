package com.accp.service.data;

import com.accp.domain.DataCommodity;
import com.accp.mapper.DataCommodityMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CommoditySrevice {

    @Autowired(required = false)
    DataCommodityMapper dataCommodityMapper;


    public PageInfo<DataCommodity> selectDataCommodity(Integer index, Integer limit, List<Integer> ids){
        Page<DataCommodity> page = PageHelper.startPage(index,limit);
        DataCommodity personnelStaff = new DataCommodity();
        /*ids.add(1);
        ids.add(2);*/
        personnelStaff.setIds(ids);
        dataCommodityMapper.selectDataCommodity(personnelStaff);
        return page.toPageInfo();
    }

    public int  insertDataCommodity(DataCommodity dataCommodity){
        int count=dataCommodityMapper.insert(dataCommodity);
        return  count;
    }

    public int deleteDataCommodity(Integer id){
        int count=dataCommodityMapper.deleteByPrimaryKey(id);
        return  count;
    }

    public int updateCommodity(DataCommodity dataCommodity){
        return dataCommodityMapper.updateByPrimaryKeySelective(dataCommodity);
    }

}
