package com.accp.mapper;

import com.accp.domain.PersonnelArtisanlevel;
import com.accp.domain.PersonnelArtisanlevelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonnelArtisanlevelMapper {
    List<PersonnelArtisanlevel> starSelect(@Param("personnelArtisanlevel") PersonnelArtisanlevel personnelArtisanlevel);

    int countByExample(PersonnelArtisanlevelExample example);

    int deleteByExample(PersonnelArtisanlevelExample example);

    int deleteByPrimaryKey(Integer artisanlevelid);

    int insert(PersonnelArtisanlevel record);

    int insertSelective(PersonnelArtisanlevel record);

    List<PersonnelArtisanlevel> selectByExample(PersonnelArtisanlevelExample example);

    PersonnelArtisanlevel selectByPrimaryKey(Integer artisanlevelid);

    int updateByExampleSelective(@Param("record") PersonnelArtisanlevel record, @Param("example") PersonnelArtisanlevelExample example);

    int updateByExample(@Param("record") PersonnelArtisanlevel record, @Param("example") PersonnelArtisanlevelExample example);

    int updateByPrimaryKeySelective(PersonnelArtisanlevel record);

    int updateByPrimaryKey(PersonnelArtisanlevel record);
}