package com.accp.mapper;

import com.accp.domain.MaintainMaintenanceRegistration;
import com.accp.domain.MaintainMaintenanceRegistrationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MaintainMaintenanceRegistrationMapper {
    int countByExample(MaintainMaintenanceRegistrationExample example);

    int deleteByExample(MaintainMaintenanceRegistrationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MaintainMaintenanceRegistration record);

    int insertSelective(MaintainMaintenanceRegistration record);

    List<MaintainMaintenanceRegistration> selectByExample(MaintainMaintenanceRegistrationExample example);

    MaintainMaintenanceRegistration selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MaintainMaintenanceRegistration record, @Param("example") MaintainMaintenanceRegistrationExample example);

    int updateByExample(@Param("record") MaintainMaintenanceRegistration record, @Param("example") MaintainMaintenanceRegistrationExample example);

    int updateByPrimaryKeySelective(MaintainMaintenanceRegistration record);

    int updateByPrimaryKey(MaintainMaintenanceRegistration record);
}