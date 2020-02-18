package com.accp.service.repair;

import com.accp.domain.*;
import com.accp.mapper.ClientCarinfoMapper;
import com.accp.mapper.DataMaintenanceItemsMapper;
import com.accp.mapper.MaintainRepairMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class RepairService {

    @Autowired
    MaintainRepairMapper maintainRepairMapper;

    @Autowired
    ClientCarinfoMapper clientCarinfoMapper;

    @Autowired
    DataMaintenanceItemsMapper dataMaintenanceItemsMapper;

    @Autowired
    MaintainEwitemMapper maintainEwitemMapper;

    //作业中车辆tab显示
    public PageInfo vehiclesInOperation(Integer pages,Integer limit){
        Page page = PageHelper.startPage(pages,limit);
        maintainRepairMapper.vehiclesInOperation();
        return page.toPageInfo();
    }

    //维修历史
    public PageInfo maintenanceHistory(String carnumber,Integer pages,Integer limit){
        Page page = PageHelper.startPage(pages,limit);
        maintainRepairMapper.maintenanceHistory(carnumber);
        return page.toPageInfo();
    }

    //主页面,车主信息,车辆信息
    public ClientCarinfo ownerInformation(String carNumber){
        return clientCarinfoMapper.ownerInformation(carNumber);
    }

    /**
     *维修救援and维修接车
     * */
    //维修救援
    public ClientCarinfo rescueS(String carnumber){
        return clientCarinfoMapper.rescueS(carnumber);
    }

    //维修接车
    public ClientCarinfo repairS(String carnumber){
        return clientCarinfoMapper.repairS(carnumber);
    }

    /**
     * 维修项目
     * */
    //维修页面主页面项目(需要根据用户类别来标记价格)
    public PageInfo items(String carNumber,Integer pages,Integer limit){
        Page page = PageHelper.startPage(pages,limit);
        dataMaintenanceItemsMapper.items(carNumber);
        return page.toPageInfo();
    }

    //维修项目，单个维修单的多个维修项目（维修单内）
    public List<DataMaintenanceItems> itemsSels(String number){
        return dataMaintenanceItemsMapper.itemsSels(number);
    }

    //维修项目单个新增
    public int insert(DataMaintenanceItems record){
        return  dataMaintenanceItemsMapper.insert(record);
    }

    //删除维修项目
    public int deleteByPrimaryKey(Integer id){
        return dataMaintenanceItemsMapper.deleteByPrimaryKey(id);
    }

    //修改维修项目
    public int updateByPrimaryKey(DataMaintenanceItems record){
        return dataMaintenanceItemsMapper.updateByPrimaryKey(record);
    }

    /**
     * 附加项目
     * */
    //查询
    public List<MaintainEwitem> selectByExample(String number){
        MaintainEwitemExample example = new MaintainEwitemExample();
        example.createCriteria().andOuteridEqualTo(number);
        return maintainEwitemMapper.selectByExample(example);
    }

    //新增
    public int insert(MaintainEwitem record){
        return maintainEwitemMapper.insert(record);
    }

    //删除
    public int deleteMaintainEwitem(Integer id){
        return maintainEwitemMapper.deleteByPrimaryKey(id);
    }

    //修改
    public int updateMaintainEwitem(MaintainEwitem record){
        return maintainEwitemMapper.updateByPrimaryKey(record);
    }

    /**
     * 附单
     * */
    //查询
    public  List<DataMaintenanceItems> attached(String number){
        return dataMaintenanceItemsMapper.attached(number);
    }

}
