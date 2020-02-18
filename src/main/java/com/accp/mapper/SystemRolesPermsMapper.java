package com.accp.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemRolesPermsMapper {
    int countByExample(SystemRolesPermsExample example);

    int deleteByExample(SystemRolesPermsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SystemRolesPerms record);

    int insertSelective(SystemRolesPerms record);

    List<SystemRolesPerms> selectByExample(SystemRolesPermsExample example);

    SystemRolesPerms selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SystemRolesPerms record, @Param("example") SystemRolesPermsExample example);

    int updateByExample(@Param("record") SystemRolesPerms record, @Param("example") SystemRolesPermsExample example);

    int updateByPrimaryKeySelective(SystemRolesPerms record);

    int updateByPrimaryKey(SystemRolesPerms record);
}