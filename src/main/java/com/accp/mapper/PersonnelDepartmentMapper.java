package com.accp.mapper;

import com.accp.domain.PersonnelDepartment;
import com.accp.domain.PersonnelDepartmentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonnelDepartmentMapper {
    int countByExample(PersonnelDepartmentExample example);

    int deleteByExample(PersonnelDepartmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PersonnelDepartment record);

    int insertSelective(PersonnelDepartment record);

    List<PersonnelDepartment> selectByExample(PersonnelDepartmentExample example);

    PersonnelDepartment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PersonnelDepartment record, @Param("example") PersonnelDepartmentExample example);

    int updateByExample(@Param("record") PersonnelDepartment record, @Param("example") PersonnelDepartmentExample example);

    int updateByPrimaryKeySelective(PersonnelDepartment record);

    int updateByPrimaryKey(PersonnelDepartment record);
}