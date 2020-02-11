package com.accp.service.repair;

import com.accp.domain.MaintainRepair;
import com.accp.mapper.MaintainRepairMapper;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class RepairService {

    @Autowired
    MaintainRepairMapper maintainRepairMapper;

    //作业中车辆tab显示
    public List<MaintainRepair> vehiclesInOperation(){
        return maintainRepairMapper.vehiclesInOperation();
    }

    //维修历史
    public List<MaintainRepair> maintenanceHistory(String carnumber){
        return maintainRepairMapper.maintenanceHistory(carnumber);
    }

}
