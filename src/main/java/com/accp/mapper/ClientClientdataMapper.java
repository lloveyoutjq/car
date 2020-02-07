package com.accp.mapper;

import com.accp.domain.ClientClientdata;
import com.accp.domain.ClientClientdataExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClientClientdataMapper {
    int countByExample(ClientClientdataExample example);

    int deleteByExample(ClientClientdataExample example);

    int deleteByPrimaryKey(Integer number);

    int insert(ClientClientdata record);

    int insertSelective(ClientClientdata record);

    List<ClientClientdata> selectByExample(ClientClientdataExample example);

    ClientClientdata selectByPrimaryKey(Integer number);

    int updateByExampleSelective(@Param("record") ClientClientdata record, @Param("example") ClientClientdataExample example);

    int updateByExample(@Param("record") ClientClientdata record, @Param("example") ClientClientdataExample example);

    int updateByPrimaryKeySelective(ClientClientdata record);

    int updateByPrimaryKey(ClientClientdata record);
}