package com.accp.mapper;

import com.accp.domain.DataRepairItems;
import com.accp.domain.DataRepairItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataRepairItemsMapper {
    int countByExample(DataRepairItemsExample example);

    int deleteByExample(DataRepairItemsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataRepairItems record);

    int insertSelective(DataRepairItems record);

    List<DataRepairItems> selectByExample(DataRepairItemsExample example);

    DataRepairItems selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataRepairItems record, @Param("example") DataRepairItemsExample example);

    int updateByExample(@Param("record") DataRepairItems record, @Param("example") DataRepairItemsExample example);

    int updateByPrimaryKeySelective(DataRepairItems record);

    int updateByPrimaryKey(DataRepairItems record);
}