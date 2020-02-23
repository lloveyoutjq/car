package com.accp.mapper;

import com.accp.domain.SystemHomeMoney;
import com.accp.domain.SystemHomeMoneyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemHomeMoneyMapper {

    List<SystemHomeMoney> selectByDate(@Param("type")int type,@Param("index")int index,@Param("date")String date);

    int countByExample(SystemHomeMoneyExample example);

    int deleteByExample(SystemHomeMoneyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SystemHomeMoney record);

    int insertSelective(SystemHomeMoney record);

    List<SystemHomeMoney> selectByExample(SystemHomeMoneyExample example);

    SystemHomeMoney selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SystemHomeMoney record, @Param("example") SystemHomeMoneyExample example);

    int updateByExample(@Param("record") SystemHomeMoney record, @Param("example") SystemHomeMoneyExample example);

    int updateByPrimaryKeySelective(SystemHomeMoney record);

    int updateByPrimaryKey(SystemHomeMoney record);
}