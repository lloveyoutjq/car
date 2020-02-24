package com.accp.service.front;

import com.accp.domain.*;
import com.accp.mapper.ClientClientdataMapper;
import com.accp.mapper.DataMaintenanceItemsMapper;
import com.accp.mapper.FrontCashierMapper;
import com.accp.mapper.MaintainEwitemMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Transactional
@Service
public class SettlementService {

    @Autowired
    FrontCashierMapper frontCashierMapper;

    @Autowired
    DataMaintenanceItemsMapper dataMaintenanceItemsMapper;

    @Autowired
    MaintainEwitemMapper maintainEwitemMapper;

    @Autowired
    ClientClientdataMapper clientClientdataMapper;


    //销售单据查询
    public PageInfo bill(String cashierId, String carNumber, String name, String counselorName, String tname, String settlementStatus, String remark,Integer pages,Integer limit){
        Page page = PageHelper.startPage(pages,limit);
        frontCashierMapper.bill("%"+cashierId+"%","%"+carNumber+"%","%"+name+"%","%"+counselorName+"%","%"+tname+"%",settlementStatus,"%"+remark+"%");
        return page.toPageInfo();
    }

    /**
     * 打开单据
     * */
    //救援
    public FrontCashier rescue(String number){
        FrontCashier rescues = frontCashierMapper.rescue(number);
        rescues.getMaintainRescue().setDataMaintenanceItemsList(dataMaintenanceItemsMapper.itemsSels(number));   //维修项目
        MaintainEwitemExample example = new MaintainEwitemExample();
        example.createCriteria().andOuteridEqualTo(number);
        rescues.getMaintainRescue().setMaintainEwitemList(maintainEwitemMapper.selectByExample(example));   //附加项目
        return rescues;
    }
    //维修
    public FrontCashier repair(String number){
        FrontCashier repairs = frontCashierMapper.repair(number);
        repairs.getMaintainRepair().setDataMaintenanceItemsList(dataMaintenanceItemsMapper.itemsSels(number));   //维修项目
        MaintainEwitemExample example = new MaintainEwitemExample();
        example.createCriteria().andOuteridEqualTo(number);
        repairs.getMaintainRepair().setMaintainEwitemList(maintainEwitemMapper.selectByExample(example));    //附加项目
        return repairs;
    }

    //回滚
    public int updateByPrimaryKeySelective(String saleid){
        FrontCashier record = new FrontCashier();
        record.setCashierid(Integer.getInteger(saleid));
        record.setSettlementstatus("未结算");
        return frontCashierMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 会员
     * */
    public PageInfo vip(String id,Integer page,Integer limit){
        Page pages = PageHelper.startPage(page,limit);
        clientClientdataMapper.vip("%"+id+"%");
        return pages.toPageInfo();
    }

    public int recharge(ClientClientdata record){
        return clientClientdataMapper.updateByPrimaryKeySelective(record);
    }
    /**
     * 建表
     * */
    public int insertF(FrontCashier frontCashier){
        return frontCashierMapper.insertSelective(frontCashier);
    }
}
