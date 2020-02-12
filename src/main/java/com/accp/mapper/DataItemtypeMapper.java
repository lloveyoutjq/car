package com.accp.mapper;

import com.accp.domain.DataItemtype;
import com.accp.domain.DataItemtypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataItemtypeMapper {
    int countByExample(DataItemtypeExample example);

    int deleteByExample(DataItemtypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataItemtype record);

    int insertSelective(DataItemtype record);

    List<DataItemtype> selectByExample(DataItemtypeExample example);

    DataItemtype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataItemtype record, @Param("example") DataItemtypeExample example);

    int updateByExample(@Param("record") DataItemtype record, @Param("example") DataItemtypeExample example);

    int updateByPrimaryKeySelective(DataItemtype record);

    int updateByPrimaryKey(DataItemtype record);
}