package com.accp.service.data;

import com.accp.domain.DataMaintenanceItems;
import com.accp.mapper.DataMaintenanceItemsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class maintenanceService {
    @Autowired(required = false)
    DataMaintenanceItemsMapper dataMaintenanceItemsMapper;




}
