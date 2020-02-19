package com.accp.mapper;

import com.accp.domain.SystemUsersRoles;
import com.accp.domain.SystemUsersRolesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemUsersRolesMapper {
    int countByExample(SystemUsersRolesExample example);

    int deleteByExample(SystemUsersRolesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SystemUsersRoles record);

    int insertSelective(SystemUsersRoles record);

    List<SystemUsersRoles> selectByExample(SystemUsersRolesExample example);

    SystemUsersRoles selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SystemUsersRoles record, @Param("example") SystemUsersRolesExample example);

    int updateByExample(@Param("record") SystemUsersRoles record, @Param("example") SystemUsersRolesExample example);

    int updateByPrimaryKeySelective(SystemUsersRoles record);

    int updateByPrimaryKey(SystemUsersRoles record);
}