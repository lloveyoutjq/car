package com.accp.mapper;

import com.accp.domain.DataMinorRepair;
import com.accp.domain.DataMinorRepairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataMinorRepairMapper {
    int countByExample(DataMinorRepairExample example);

    int deleteByExample(DataMinorRepairExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataMinorRepair record);

    int insertSelective(DataMinorRepair record);

    List<DataMinorRepair> selectByExample(DataMinorRepairExample example);

    DataMinorRepair selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataMinorRepair record, @Param("example") DataMinorRepairExample example);

    int updateByExample(@Param("record") DataMinorRepair record, @Param("example") DataMinorRepairExample example);

    int updateByPrimaryKeySelective(DataMinorRepair record);

    int updateByPrimaryKey(DataMinorRepair record);
}