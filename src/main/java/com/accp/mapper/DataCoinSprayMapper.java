package com.accp.mapper;

import com.accp.domain.DataCoinSpray;
import com.accp.domain.DataCoinSprayExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataCoinSprayMapper {
    int countByExample(DataCoinSprayExample example);

    int deleteByExample(DataCoinSprayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataCoinSpray record);

    int insertSelective(DataCoinSpray record);

    List<DataCoinSpray> selectByExample(DataCoinSprayExample example);

    DataCoinSpray selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataCoinSpray record, @Param("example") DataCoinSprayExample example);

    int updateByExample(@Param("record") DataCoinSpray record, @Param("example") DataCoinSprayExample example);

    int updateByPrimaryKeySelective(DataCoinSpray record);

    int updateByPrimaryKey(DataCoinSpray record);
}