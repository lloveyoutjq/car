package com.accp.mapper;

import com.accp.domain.PersonnelDepartmenttype;
import com.accp.domain.PersonnelDepartmenttypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonnelDepartmenttypeMapper {
    int countByExample(PersonnelDepartmenttypeExample example);

    int deleteByExample(PersonnelDepartmenttypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PersonnelDepartmenttype record);

    int insertSelective(PersonnelDepartmenttype record);

    List<PersonnelDepartmenttype> selectByExample(PersonnelDepartmenttypeExample example);

    PersonnelDepartmenttype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PersonnelDepartmenttype record, @Param("example") PersonnelDepartmenttypeExample example);

    int updateByExample(@Param("record") PersonnelDepartmenttype record, @Param("example") PersonnelDepartmenttypeExample example);

    int updateByPrimaryKeySelective(PersonnelDepartmenttype record);

    int updateByPrimaryKey(PersonnelDepartmenttype record);
}