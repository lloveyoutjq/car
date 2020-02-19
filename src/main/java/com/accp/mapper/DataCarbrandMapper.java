package com.accp.mapper;

import com.accp.domain.DataCarbrand;
import com.accp.domain.DataCarbrandExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataCarbrandMapper {
    int countByExample(DataCarbrandExample example);

    int deleteByExample(DataCarbrandExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataCarbrand record);

    int insertSelective(DataCarbrand record);

    List<DataCarbrand> selectByExample(DataCarbrandExample example);

    DataCarbrand selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataCarbrand record, @Param("example") DataCarbrandExample example);

    int updateByExample(@Param("record") DataCarbrand record, @Param("example") DataCarbrandExample example);

    int updateByPrimaryKeySelective(DataCarbrand record);

    int updateByPrimaryKey(DataCarbrand record);
}