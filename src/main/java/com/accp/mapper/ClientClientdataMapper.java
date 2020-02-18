package com.accp.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClientClientdataMapper {
    int countByExample(ClientClientdataExample example);

    int deleteByExample(ClientClientdataExample example);

    int deleteByPrimaryKey(Integer number);

    int insert(ClientClientdata record);

    int insertSelective(ClientClientdata record);

    List<ClientClientdata> selectByExample(ClientClientdataExample example);

    ClientClientdata selectByPrimaryKey(Integer number);

    List<ClientClientdata> selectClient(@Param("clientClientdata") ClientClientdata clientClientdata);

    int updateByExampleSelective(@Param("record") ClientClientdata record, @Param("example") ClientClientdataExample example);

    int updateByExample(@Param("record") ClientClientdata record, @Param("example") ClientClientdataExample example);

    int updateByPrimaryKeySelective(ClientClientdata record);

    int updateByPrimaryKey(ClientClientdata record);
}