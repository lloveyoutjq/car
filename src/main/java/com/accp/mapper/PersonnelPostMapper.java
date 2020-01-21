package com.accp.mapper;

import com.accp.domain.PersonnelPost;
import com.accp.domain.PersonnelPostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonnelPostMapper {
    int countByExample(PersonnelPostExample example);

    int deleteByExample(PersonnelPostExample example);

    int deleteByPrimaryKey(Integer postid);

    int insert(PersonnelPost record);

    int insertSelective(PersonnelPost record);

    List<PersonnelPost> selectByExample(PersonnelPostExample example);

    PersonnelPost selectByPrimaryKey(Integer postid);

    int updateByExampleSelective(@Param("record") PersonnelPost record, @Param("example") PersonnelPostExample example);

    int updateByExample(@Param("record") PersonnelPost record, @Param("example") PersonnelPostExample example);

    int updateByPrimaryKeySelective(PersonnelPost record);

    int updateByPrimaryKey(PersonnelPost record);
}