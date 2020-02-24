package com.accp.mapper;

import com.accp.domain.MaintainRepair;
import com.accp.domain.MaintainRepairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MaintainRepairMapper {
    MaintainRepair selectPrice(String number);

    List<MaintainRepair> maintenanceHistory(String carnumber);

    List<MaintainRepair> vehiclesInOperation();

    int countByExample(MaintainRepairExample example);

    int deleteByExample(MaintainRepairExample example);

    int deleteByPrimaryKey(String number);

    int insert(MaintainRepair record);

    int insertSelective(MaintainRepair record);

    List<MaintainRepair> selectByExample(MaintainRepairExample example);

    MaintainRepair selectByPrimaryKey(String number);

    int updateByExampleSelective(@Param("record") MaintainRepair record, @Param("example") MaintainRepairExample example);

    int updateByExample(@Param("record") MaintainRepair record, @Param("example") MaintainRepairExample example);

    int updateByPrimaryKeySelective(MaintainRepair record);

    int updateByPrimaryKey(MaintainRepair record);
}