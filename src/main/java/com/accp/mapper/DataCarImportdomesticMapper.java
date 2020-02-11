package com.accp.mapper;

import com.accp.domain.DataCarImportdomestic;
import com.accp.domain.DataCarImportdomesticExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataCarImportdomesticMapper {
    int countByExample(DataCarImportdomesticExample example);

    int deleteByExample(DataCarImportdomesticExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataCarImportdomestic record);

    int insertSelective(DataCarImportdomestic record);

    List<DataCarImportdomestic> selectByExample(DataCarImportdomesticExample example);

    DataCarImportdomestic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataCarImportdomestic record, @Param("example") DataCarImportdomesticExample example);

    int updateByExample(@Param("record") DataCarImportdomestic record, @Param("example") DataCarImportdomesticExample example);

    int updateByPrimaryKeySelective(DataCarImportdomestic record);

    int updateByPrimaryKey(DataCarImportdomestic record);
}