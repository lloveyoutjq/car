package com.accp.mapper;

import com.accp.domain.DataLinkman;
import com.accp.domain.DataLinkmanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataLinkmanMapper {
    int countByExample(DataLinkmanExample example);

    int deleteByExample(DataLinkmanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataLinkman record);

    int insertSelective(DataLinkman record);

    List<DataLinkman> selectByExample(DataLinkmanExample example);

    DataLinkman selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataLinkman record, @Param("example") DataLinkmanExample example);

    int updateByExample(@Param("record") DataLinkman record, @Param("example") DataLinkmanExample example);

    int updateByPrimaryKeySelective(DataLinkman record);

    int updateByPrimaryKey(DataLinkman record);
}