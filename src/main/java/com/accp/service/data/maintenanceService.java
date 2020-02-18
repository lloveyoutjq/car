package com.accp.service.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class maintenanceService {
    @Autowired(required = false)
    DataMaintenanceItemsMapper dataMaintenanceItemsMapper;




}
