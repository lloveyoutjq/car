package com.accp.mapper;

import com.accp.domain.DataManufacturer;
import com.accp.domain.DataManufacturerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataManufacturerMapper {
    int countByExample(DataManufacturerExample example);

    int deleteByExample(DataManufacturerExample example);

    int deleteByPrimaryKey(Integer number);

    int insert(DataManufacturer record);

    int insertSelective(DataManufacturer record);

    List<DataManufacturer> selectByExample(DataManufacturerExample example);

    DataManufacturer selectByPrimaryKey(Integer number);

    int updateByExampleSelective(@Param("record") DataManufacturer record, @Param("example") DataManufacturerExample example);

    int updateByExample(@Param("record") DataManufacturer record, @Param("example") DataManufacturerExample example);

    int updateByPrimaryKeySelective(DataManufacturer record);

    int updateByPrimaryKey(DataManufacturer record);
}