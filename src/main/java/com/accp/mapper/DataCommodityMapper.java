package com.accp.mapper;

import com.accp.domain.DataCommodity;
import com.accp.domain.DataCommodityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataCommodityMapper {

    List<DataCommodity> selectDataCommodity(@Param("dataCommodity") DataCommodity dataCommodity);

    int countByExample(DataCommodityExample example);

    int deleteByExample(DataCommodityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataCommodity record);

    int insertSelective(DataCommodity record);

    List<DataCommodity> selectByExample(DataCommodityExample example);

    DataCommodity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataCommodity record, @Param("example") DataCommodityExample example);

    int updateByExample(@Param("record") DataCommodity record, @Param("example") DataCommodityExample example);

    int updateByPrimaryKeySelective(DataCommodity record);

    int updateByPrimaryKey(DataCommodity record);
}