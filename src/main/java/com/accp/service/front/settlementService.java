package com.accp.service.front;

import com.accp.domain.FrontCashier;
import com.accp.domain.MaintainEwitemExample;
import com.accp.domain.MaintainRepair;
import com.accp.domain.MaintainRescue;
import com.accp.mapper.DataMaintenanceItemsMapper;
import com.accp.mapper.FrontCashierMapper;
import com.accp.mapper.MaintainEwitemMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    public List<FrontCashier> bill(String cashierId,String status,String carNumber,String name,String counselorName,String tname,String settlementStatus,String remark){
        return frontCashierMapper.bill("%"+cashierId+"%","%"+status+"%","%"+carNumber+"%","%"+name+"%","%"+counselorName+"%","%"+tname+"%",settlementStatus,"%"+remark+"%");
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
}
