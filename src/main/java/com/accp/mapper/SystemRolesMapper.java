package com.accp.mapper;

import com.accp.domain.SystemRoles;
import com.accp.domain.SystemRolesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemRolesMapper {
    int countByExample(SystemRolesExample example);

    int deleteByExample(SystemRolesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SystemRoles record);

    int insertSelective(SystemRoles record);

    List<SystemRoles> selectByExample(SystemRolesExample example);

    SystemRoles selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SystemRoles record, @Param("example") SystemRolesExample example);

    int updateByExample(@Param("record") SystemRoles record, @Param("example") SystemRolesExample example);

    int updateByPrimaryKeySelective(SystemRoles record);

    int updateByPrimaryKey(SystemRoles record);
}