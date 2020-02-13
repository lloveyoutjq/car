package com.accp.mapper;

import com.accp.domain.ClientCarinfo;
import com.accp.domain.ClientCarinfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ClientCarinfoMapper {
    ClientCarinfo rescueS(String carnumber);   //维修救援

    ClientCarinfo repairS(String carnumber);   //维修接车

    ClientCarinfo ownerInformation(String carNumber);

    int countByExample(ClientCarinfoExample example);

    int deleteByExample(ClientCarinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClientCarinfo record);

    int insertSelective(ClientCarinfo record);

    List<ClientCarinfo> selectByExample(ClientCarinfoExample example);

    ClientCarinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClientCarinfo record, @Param("example") ClientCarinfoExample example);

    int updateByExample(@Param("record") ClientCarinfo record, @Param("example") ClientCarinfoExample example);

    int updateByPrimaryKeySelective(ClientCarinfo record);

    int updateByPrimaryKey(ClientCarinfo record);
}