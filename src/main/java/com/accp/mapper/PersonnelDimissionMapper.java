package com.accp.mapper;

import com.accp.domain.PersonnelDimission;
import com.accp.domain.PersonnelDimissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonnelDimissionMapper {
    int countByExample(PersonnelDimissionExample example);

    int deleteByExample(PersonnelDimissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PersonnelDimission record);

    int insertSelective(PersonnelDimission record);

    List<PersonnelDimission> selectByExample(PersonnelDimissionExample example);

    PersonnelDimission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PersonnelDimission record, @Param("example") PersonnelDimissionExample example);

    int updateByExample(@Param("record") PersonnelDimission record, @Param("example") PersonnelDimissionExample example);

    int updateByPrimaryKeySelective(PersonnelDimission record);

    int updateByPrimaryKey(PersonnelDimission record);
}