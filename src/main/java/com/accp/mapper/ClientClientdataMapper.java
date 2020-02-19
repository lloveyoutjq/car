package com.accp.mapper;

import com.accp.domain.ClientClientdata;
import com.accp.domain.ClientClientdataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientClientdataMapper {
    List<ClientClientdata> vip(String id);

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