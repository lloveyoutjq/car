package com.accp.mapper;

import com.accp.domain.DataCommoditybrand;
import com.accp.domain.DataCommoditybrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataCommoditybrandMapper {
    int countByExample(DataCommoditybrandExample example);

    int deleteByExample(DataCommoditybrandExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataCommoditybrand record);

    int insertSelective(DataCommoditybrand record);

    List<DataCommoditybrand> selectByExample(DataCommoditybrandExample example);

    DataCommoditybrand selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataCommoditybrand record, @Param("example") DataCommoditybrandExample example);

    int updateByExample(@Param("record") DataCommoditybrand record, @Param("example") DataCommoditybrandExample example);

    int updateByPrimaryKeySelective(DataCommoditybrand record);

    int updateByPrimaryKey(DataCommoditybrand record);
}