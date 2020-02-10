package com.accp.mapper;

import com.accp.domain.FrontCashier;
import com.accp.domain.FrontCashierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrontCashierMapper {
    int countByExample(FrontCashierExample example);

    int deleteByExample(FrontCashierExample example);

    int deleteByPrimaryKey(Integer cashierid);

    int insert(FrontCashier record);

    int insertSelective(FrontCashier record);

    List<FrontCashier> selectByExample(FrontCashierExample example);

    FrontCashier selectByPrimaryKey(Integer cashierid);

    int updateByExampleSelective(@Param("record") FrontCashier record, @Param("example") FrontCashierExample example);

    int updateByExample(@Param("record") FrontCashier record, @Param("example") FrontCashierExample example);

    int updateByPrimaryKeySelective(FrontCashier record);

    int updateByPrimaryKey(FrontCashier record);
}