package com.accp.mapper;

import com.accp.domain.PersonnelArtisanclass;
import com.accp.domain.PersonnelArtisanclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonnelArtisanclassMapper {
    int countByExample(PersonnelArtisanclassExample example);

    int deleteByExample(PersonnelArtisanclassExample example);

    int deleteByPrimaryKey(Integer artisanclassid);

    int insert(PersonnelArtisanclass record);

    int insertSelective(PersonnelArtisanclass record);

    List<PersonnelArtisanclass> selectByExample(PersonnelArtisanclassExample example);

    PersonnelArtisanclass selectByPrimaryKey(Integer artisanclassid);

    int updateByExampleSelective(@Param("record") PersonnelArtisanclass record, @Param("example") PersonnelArtisanclassExample example);

    int updateByExample(@Param("record") PersonnelArtisanclass record, @Param("example") PersonnelArtisanclassExample example);

    int updateByPrimaryKeySelective(PersonnelArtisanclass record);

    int updateByPrimaryKey(PersonnelArtisanclass record);
}