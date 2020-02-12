package com.accp.service.repair;

import com.accp.domain.DataMaintenanceItems;
import com.accp.mapper.DataMaintenanceItemsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class AttachedService {

    @Autowired
    DataMaintenanceItemsMapper dataMaintenanceItemsMapper;

    //维修或救援附单
    public List<DataMaintenanceItems> attached(String number){
        return  dataMaintenanceItemsMapper.attached(number);
    }
}
