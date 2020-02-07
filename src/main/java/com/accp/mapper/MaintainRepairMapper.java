package com.accp.mapper;

import com.accp.domain.MaintainRepair;
import com.accp.domain.MaintainRepairExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MaintainRepairMapper {
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