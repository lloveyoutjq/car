package com.accp.mapper;

import com.accp.domain.DataMaintain;
import com.accp.domain.DataMaintainExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataMaintainMapper {
    int countByExample(DataMaintainExample example);

    int deleteByExample(DataMaintainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataMaintain record);

    int insertSelective(DataMaintain record);

    List<DataMaintain> selectByExample(DataMaintainExample example);

    DataMaintain selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataMaintain record, @Param("example") DataMaintainExample example);

    int updateByExample(@Param("record") DataMaintain record, @Param("example") DataMaintainExample example);

    int updateByPrimaryKeySelective(DataMaintain record);

    int updateByPrimaryKey(DataMaintain record);
}