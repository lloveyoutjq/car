package com.accp.mapper;

import com.accp.domain.ClientClientdata;
import com.accp.domain.ClientClientdataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClientClientdataMapper {
    int countByExample(ClientClientdataExample example);

    int deleteByExample(ClientClientdataExample example);

    int deleteByPrimaryKey(String number);

    int insert(ClientClientdata record);

    int insertSelective(ClientClientdata record);

    List<ClientClientdata> selectByExample(ClientClientdataExample example);

    ClientClientdata selectByPrimaryKey(String number);

    int updateByExampleSelective(@Param("record") ClientClientdata record, @Param("example") ClientClientdataExample example);

    int updateByExample(@Param("record") ClientClientdata record, @Param("example") ClientClientdataExample example);

    int updateByPrimaryKeySelective(ClientClientdata record);

    int updateByPrimaryKey(ClientClientdata record);
}