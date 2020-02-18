package com.accp.service.front;

import com.accp.domain.FrontCashier;
import com.accp.domain.MaintainEwitemExample;
import com.accp.domain.MaintainRepair;
import com.accp.domain.MaintainRescue;
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
public class settlementService {

    @Autowired
    FrontCashierMapper frontCashierMapper;

    @Autowired
    DataMaintenanceItemsMapper dataMaintenanceItemsMapper;

    @Autowired
    MaintainEwitemMapper maintainEwitemMapper;


    //销售单据查询
    public PageInfo bill(String cashierId, String status, String carNumber, String name, String counselorName, String tname, String settlementStatus, String remark,Integer pages,Integer limit){
        Page page = PageHelper.startPage(pages,limit);
        frontCashierMapper.bill("%"+cashierId+"%","%"+status+"%","%"+carNumber+"%","%"+name+"%","%"+counselorName+"%","%"+tname+"%",settlementStatus,"%"+remark+"%");
        return page.toPageInfo();
    }

    /**
     * 打开单据
     * */
    //救援
    public MaintainRescue rescue(String number){
        MaintainRescue rescues = frontCashierMapper.rescue(number);
        rescues.setDataMaintenanceItemsList(dataMaintenanceItemsMapper.itemsSels(number));   //维修项目
        MaintainEwitemExample example = new MaintainEwitemExample();
        example.createCriteria().andOuteridEqualTo(number);
        rescues.setMaintainEwitemList(maintainEwitemMapper.selectByExample(example));   //附加项目
        return rescues;
    }
    //维修
    public MaintainRepair repair(String number){
        MaintainRepair repairs = frontCashierMapper.repair(number);
        repairs.setDataMaintenanceItemsList(dataMaintenanceItemsMapper.itemsSels(number));   //维修项目
        MaintainEwitemExample example = new MaintainEwitemExample();
        example.createCriteria().andOuteridEqualTo(number);
        repairs.setMaintainEwitemList(maintainEwitemMapper.selectByExample(example));    //附加项目
        return repairs;
    }

    //回滚
    public int updateByPrimaryKeySelective(String saleid){
        FrontCashier record = new FrontCashier();
        record.setCashierid(Integer.getInteger(saleid));
        record.setSettlementstatus("未结算");
        return frontCashierMapper.updateByPrimaryKeySelective(record);
    }
}
