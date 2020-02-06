package com.accp.mapper;

import com.accp.domain.ClientClienttype;
import com.accp.domain.ClientClienttypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClientClienttypeMapper {
    int countByExample(ClientClienttypeExample example);

    int deleteByExample(ClientClienttypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClientClienttype record);

    int insertSelective(ClientClienttype record);

    List<ClientClienttype> selectByExample(ClientClienttypeExample example);

    ClientClienttype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClientClienttype record, @Param("example") ClientClienttypeExample example);

    int updateByExample(@Param("record") ClientClienttype record, @Param("example") ClientClienttypeExample example);

    int updateByPrimaryKeySelective(ClientClienttype record);

    int updateByPrimaryKey(ClientClienttype record);
}