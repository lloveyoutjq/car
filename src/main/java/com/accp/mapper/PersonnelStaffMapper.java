package com.accp.mapper;

import com.accp.domain.PersonnelStaff;
import com.accp.domain.PersonnelStaffExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonnelStaffMapper {
    int countByExample(PersonnelStaffExample example);

    int deleteByExample(PersonnelStaffExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PersonnelStaff record);

    int insertSelective(PersonnelStaff record);

    List<PersonnelStaff> selectByExample(PersonnelStaffExample example);

    PersonnelStaff selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PersonnelStaff record, @Param("example") PersonnelStaffExample example);

    int updateByExample(@Param("record") PersonnelStaff record, @Param("example") PersonnelStaffExample example);

    int updateByPrimaryKeySelective(PersonnelStaff record);

    int updateByPrimaryKey(PersonnelStaff record);
}