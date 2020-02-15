package com.accp.mapper;

import com.accp.domain.DataCommodity;
import com.accp.domain.DataCommodityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataCommodityMapper {
    int countByExample(DataCommodityExample example);

    int deleteByExample(DataCommodityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataCommodity record);

    int insertSelective(DataCommodity record);

    List<DataCommodity> selectByExample(DataCommodityExample example);

    DataCommodity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataCommodity record, @Param("example") DataCommodityExample example);

    int updateByExample(@Param("record") DataCommodity record, @Param("example") DataCommodityExample example);

    int updateByPrimaryKeySelective(DataCommodity record);

    int updateByPrimaryKey(DataCommodity record);
}