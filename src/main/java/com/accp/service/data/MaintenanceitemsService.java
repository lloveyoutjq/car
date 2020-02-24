package com.accp.service.data;

import com.accp.domain.DataMaintenanceItems;
import com.accp.mapper.DataMaintenanceItemsMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MaintenanceitemsService {

    @Autowired(required = false)
    DataMaintenanceItemsMapper dataMaintenanceItemsMapper;


    public PageInfo<DataMaintenanceItems> selectDataMaintenanceItems(Integer index, Integer limit,List<Integer> ids){
            Page<DataMaintenanceItems> page = PageHelper.startPage(index,limit);
            DataMaintenanceItems personnelStaff = new DataMaintenanceItems();
        /*ids.add(1);
        ids.add(2);*/
            personnelStaff.setIds(ids);
            dataMaintenanceItemsMapper.selectDataMaintenanceItems(personnelStaff);
            return page.toPageInfo();
    }



    public int  insertDataMaintenanceItems(DataMaintenanceItems dataMaintenanceItems){
        int count=dataMaintenanceItemsMapper.insert(dataMaintenanceItems);
        return  count;
    }

    public int deleteDataMaintenanceItems(Integer id){
        int count=dataMaintenanceItemsMapper.deleteByPrimaryKey(id);
        return  count;
    }

    public int updateMaintenanceItems(DataMaintenanceItems dataMaintenanceItems){
        return dataMaintenanceItemsMapper.updateByPrimaryKeySelective(dataMaintenanceItems);
    }


}
