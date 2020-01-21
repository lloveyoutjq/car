package com.accp.mapper;

import com.accp.domain.DataCar;
import com.accp.domain.DataCarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataCarMapper {
    int countByExample(DataCarExample example);

    int deleteByExample(DataCarExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataCar record);

    int insertSelective(DataCar record);

    List<DataCar> selectByExample(DataCarExample example);

    DataCar selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataCar record, @Param("example") DataCarExample example);

    int updateByExample(@Param("record") DataCar record, @Param("example") DataCarExample example);

    int updateByPrimaryKeySelective(DataCar record);

    int updateByPrimaryKey(DataCar record);
}