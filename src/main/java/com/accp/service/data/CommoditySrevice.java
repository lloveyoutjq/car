package com.accp.service.data;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CommoditySrevice {

    @Autowired(required = false)
    DataCommodityMapper dataCommodityMapper;


    public PageInfo<DataCommodity> selectDataCommodity(Integer page, Integer limit){
        Page<DataCommodity> pageInfo = PageHelper.startPage(page,limit);
        dataCommodityMapper.selectByExample(null);
        return pageInfo.toPageInfo();
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
        return dataCommodityMapper.updateByPrimaryKey(dataCommodity);
    }

}
