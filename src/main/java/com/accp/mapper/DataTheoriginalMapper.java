package com.accp.mapper;

import com.accp.domain.DataTheoriginal;
import com.accp.domain.DataTheoriginalExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataTheoriginalMapper {
    int countByExample(DataTheoriginalExample example);

    int deleteByExample(DataTheoriginalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataTheoriginal record);

    int insertSelective(DataTheoriginal record);

    List<DataTheoriginal> selectByExample(DataTheoriginalExample example);

    DataTheoriginal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataTheoriginal record, @Param("example") DataTheoriginalExample example);

    int updateByExample(@Param("record") DataTheoriginal record, @Param("example") DataTheoriginalExample example);

    int updateByPrimaryKeySelective(DataTheoriginal record);

    int updateByPrimaryKey(DataTheoriginal record);
}