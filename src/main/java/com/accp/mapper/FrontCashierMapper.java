package com.accp.mapper;

import com.accp.domain.FrontCashier;
import com.accp.domain.FrontCashierExample;
import java.util.List;

import com.accp.domain.MaintainRepair;
import com.accp.domain.MaintainRescue;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FrontCashierMapper {
    Integer selectByDateCashier(@Param("date") String date);

    List<FrontCashier> bill(@Param("cashierId") String cashierId, @Param("carNumber") String carNumber, @Param("name") String name, @Param("counselorName") String counselorName, @Param("tname") String tname, @Param("settlementStatus") String settlementStatus, @Param("remark") String remark);

    FrontCashier rescue(String number);

    FrontCashier repair(String number);

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