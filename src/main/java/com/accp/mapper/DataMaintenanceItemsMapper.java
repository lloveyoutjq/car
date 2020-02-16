package com.accp.mapper;

import com.accp.domain.DataMaintenanceItems;
import com.accp.domain.DataMaintenanceItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DataMaintenanceItemsMapper {
    List<DataMaintenanceItems> itemsSels(String number);

    List<DataMaintenanceItems> attached(String number);  //附单

    List<DataMaintenanceItems> items(String carNumber);

    int countByExample(DataMaintenanceItemsExample example);

    int deleteByExample(DataMaintenanceItemsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataMaintenanceItems record);

    int insertSelective(DataMaintenanceItems record);

    List<DataMaintenanceItems> selectByExample(DataMaintenanceItemsExample example);

    DataMaintenanceItems selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataMaintenanceItems record, @Param("example") DataMaintenanceItemsExample example);

    int updateByExample(@Param("record") DataMaintenanceItems record, @Param("example") DataMaintenanceItemsExample example);

    int updateByPrimaryKeySelective(DataMaintenanceItems record);

    int updateByPrimaryKey(DataMaintenanceItems record);
}