package com.accp.mapper;

import com.accp.domain.DataSupplierTree;
import com.accp.domain.DataSupplierTreeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataSupplierTreeMapper {
    int countByExample(DataSupplierTreeExample example);

    int deleteByExample(DataSupplierTreeExample example);

    int insert(DataSupplierTree record);

    int insertSelective(DataSupplierTree record);

    List<DataSupplierTree> selectByExample(DataSupplierTreeExample example);

    int updateByExampleSelective(@Param("record") DataSupplierTree record, @Param("example") DataSupplierTreeExample example);

    int updateByExample(@Param("record") DataSupplierTree record, @Param("example") DataSupplierTreeExample example);
}