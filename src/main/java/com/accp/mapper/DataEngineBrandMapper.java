package com.accp.mapper;

import com.accp.domain.DataEngineBrand;
import com.accp.domain.DataEngineBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataEngineBrandMapper {
    int countByExample(DataEngineBrandExample example);

    int deleteByExample(DataEngineBrandExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataEngineBrand record);

    int insertSelective(DataEngineBrand record);

    List<DataEngineBrand> selectByExample(DataEngineBrandExample example);

    DataEngineBrand selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataEngineBrand record, @Param("example") DataEngineBrandExample example);

    int updateByExample(@Param("record") DataEngineBrand record, @Param("example") DataEngineBrandExample example);

    int updateByPrimaryKeySelective(DataEngineBrand record);

    int updateByPrimaryKey(DataEngineBrand record);
}