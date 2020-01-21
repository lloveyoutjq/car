package com.accp.mapper;

import com.accp.domain.DataCommoditytype;
import com.accp.domain.DataCommoditytypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataCommoditytypeMapper {
    int countByExample(DataCommoditytypeExample example);

    int deleteByExample(DataCommoditytypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataCommoditytype record);

    int insertSelective(DataCommoditytype record);

    List<DataCommoditytype> selectByExample(DataCommoditytypeExample example);

    DataCommoditytype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataCommoditytype record, @Param("example") DataCommoditytypeExample example);

    int updateByExample(@Param("record") DataCommoditytype record, @Param("example") DataCommoditytypeExample example);

    int updateByPrimaryKeySelective(DataCommoditytype record);

    int updateByPrimaryKey(DataCommoditytype record);
}