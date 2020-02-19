package com.accp.mapper;

import com.accp.domain.FrontInterior;
import com.accp.domain.FrontInteriorExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FrontInteriorMapper {
    int countByExample(FrontInteriorExample example);

    int deleteByExample(FrontInteriorExample example);

    int deleteByPrimaryKey(Integer interiorid);

    int insert(FrontInterior record);

    int insertSelective(FrontInterior record);

    List<FrontInterior> selectByExample(FrontInteriorExample example);

    FrontInterior selectByPrimaryKey(Integer interiorid);

    int updateByExampleSelective(@Param("record") FrontInterior record, @Param("example") FrontInteriorExample example);

    int updateByExample(@Param("record") FrontInterior record, @Param("example") FrontInteriorExample example);

    int updateByPrimaryKeySelective(FrontInterior record);

    int updateByPrimaryKey(FrontInterior record);
}