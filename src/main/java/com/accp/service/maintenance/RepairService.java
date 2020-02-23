package com.accp.service.maintenance;

import com.accp.domain.*;
import com.accp.mapper.*;
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

    @Autowired
    MaintainRescueMapper maintainRescueMapper;

    @Autowired
    FrontCashierMapper frontCashierMapper;

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
    //打开维修救援
    public ClientCarinfo rescueS(String carnumber){
        return clientCarinfoMapper.rescueS(carnumber);
    }

    //维修接车
    public ClientCarinfo repairS(String carnumber){
        return clientCarinfoMapper.repairS(carnumber);
    }

    //创建
    public int repair(FrontCashier record){
        maintainRepairMapper.insert(record.getMaintainRepair());
        record.setNumber(record.getMaintainRepair().getNumber());
        return frontCashierMapper.insert(record);
    }

    public int rescue(FrontCashier record){
        maintainRescueMapper.insert(record.getMaintainRescue());
        record.setNumber(record.getMaintainRescue().getNumber());
        return frontCashierMapper.insert(record);
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
    public PageInfo itemsSels(String number,Integer page,Integer limit){
        Page pages  = PageHelper.startPage(page,limit);
        dataMaintenanceItemsMapper.itemsSels(number);
        return pages.toPageInfo();
    }

    //维修项目单个新增
    public int insert(DataMaintenanceItems record){
        return  dataMaintenanceItemsMapper.insert(record);
    }

    //修改所用
    public DataMaintenanceItems selectByPrimaryKey(Integer id){
        return dataMaintenanceItemsMapper.selectByPrimaryKey(id);
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
    public PageInfo selectByExample(String number,Integer pages,Integer limit){
        MaintainEwitemExample example = new MaintainEwitemExample();
        example.createCriteria().andOuteridEqualTo(number);
        Page page = PageHelper.startPage(pages,limit);
        maintainEwitemMapper.selectByExample(example);
        return page.toPageInfo();
    }
    //单个查询
    public MaintainEwitem selectByEwitemId(Integer id){
        return maintainEwitemMapper.selectByPrimaryKey(id);
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
    public PageInfo attached(String number,Integer pages,Integer limit){
        Page page = PageHelper.startPage(pages,limit);
        dataMaintenanceItemsMapper.attached(number);
        return page.toPageInfo();
    }

    /**
     * 获取最新单号
     * */
    public String newRepairId(){
        List<MaintainRepair> maintainRepairList = maintainRepairMapper.selectByExample(null);
        if (maintainRepairList.size()-1==-1){
            return "W10001";
        }
        int index = maintainRepairList.get(maintainRepairList.size()-1).getNumber().length();
        String lastNum = maintainRepairList.get(maintainRepairList.size()-1).getNumber().substring(index-1);
        int last = Integer.parseInt(lastNum);
        String beforeNum = maintainRepairList.get(maintainRepairList.size()-1).getNumber().substring(0,index-1);
        String num = beforeNum + (last+1);
        return num;

    }

    public String newRescueId(){
        List<MaintainRescue> maintainRescuesList = maintainRescueMapper.selectByExample(null);
        if (maintainRescuesList.size()-1==-1){
            return "J10001";
        }
        int index = maintainRescuesList.get(maintainRescuesList.size()-1).getNumber().length();
        String lastNum = maintainRescuesList.get(maintainRescuesList.size()-1).getNumber().substring(index-1);
        int last = Integer.parseInt(lastNum);
        String beforeNum = maintainRescuesList.get(maintainRescuesList.size()-1).getNumber().substring(0,index-1);
        String num = beforeNum + (last+1);
        return num;
    }

    public Integer insertRepair(MaintainRepair maintainRepair){
        return maintainRepairMapper.insertSelective(maintainRepair);
    }

    public Integer insertRescue(MaintainRescue maintainRescue){
        return maintainRescueMapper.insertSelective(maintainRescue);
    }


}
