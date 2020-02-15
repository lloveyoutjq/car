package com.accp.mapper;

import com.accp.domain.SystemPermissions;
import com.accp.domain.SystemPermissionsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemPermissionsMapper {
    int countByExample(SystemPermissionsExample example);

    int deleteByExample(SystemPermissionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SystemPermissions record);

    int insertSelective(SystemPermissions record);

    List<SystemPermissions> selectByExample(SystemPermissionsExample example);

    SystemPermissions selectByPrimaryKey(Integer id);

<<<<<<< HEAD
    List<SystemPermissions> selectUserMenuAll(Integer type, Integer uid);

    List<SystemPermissions> selectUserMenuById(@Param("rid") Integer rid);
=======
    List<SystemPermissions> selectUserMenuAll(Integer type,Integer uid);
>>>>>>> 0ac21a830052d282c8130d91bc1cc16f3f086a85

    int updateByExampleSelective(@Param("record") SystemPermissions record, @Param("example") SystemPermissionsExample example);

    int updateByExample(@Param("record") SystemPermissions record, @Param("example") SystemPermissionsExample example);

    int updateByPrimaryKeySelective(SystemPermissions record);

    int updateByPrimaryKey(SystemPermissions record);
}