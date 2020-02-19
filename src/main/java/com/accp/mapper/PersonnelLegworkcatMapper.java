package com.accp.mapper;

import com.accp.domain.PersonnelLegworkcat;
import com.accp.domain.PersonnelLegworkcatExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonnelLegworkcatMapper {
    List<PersonnelLegworkcat> fieldSelect();



    int countByExample(PersonnelLegworkcatExample example);

    int deleteByExample(PersonnelLegworkcatExample example);

    int deleteByPrimaryKey(Integer legworkcatid);

    int insert(PersonnelLegworkcat record);

    int insertSelective(PersonnelLegworkcat record);

    List<PersonnelLegworkcat> selectByExample(PersonnelLegworkcatExample example);

    PersonnelLegworkcat selectByPrimaryKey(Integer legworkcatid);

    int updateByExampleSelective(@Param("record") PersonnelLegworkcat record, @Param("example") PersonnelLegworkcatExample example);

    int updateByExample(@Param("record") PersonnelLegworkcat record, @Param("example") PersonnelLegworkcatExample example);

    int updateByPrimaryKeySelective(PersonnelLegworkcat record);

    int updateByPrimaryKey(PersonnelLegworkcat record);
}