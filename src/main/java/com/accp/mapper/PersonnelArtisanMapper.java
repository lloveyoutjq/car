package com.accp.mapper;

import com.accp.domain.PersonnelArtisan;
import com.accp.domain.PersonnelArtisanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonnelArtisanMapper {
    List<PersonnelArtisan> teamSelect();
    PersonnelArtisan teamSelectId(String artisanid);



    int countByExample(PersonnelArtisanExample example);

    int deleteByExample(PersonnelArtisanExample example);

    int deleteByPrimaryKey(Integer artisanid);

    int insert(PersonnelArtisan record);

    int insertSelective(PersonnelArtisan record);

    List<PersonnelArtisan> selectByExample(PersonnelArtisanExample example);

    PersonnelArtisan selectByPrimaryKey(Integer artisanid);

    int updateByExampleSelective(@Param("record") PersonnelArtisan record, @Param("example") PersonnelArtisanExample example);

    int updateByExample(@Param("record") PersonnelArtisan record, @Param("example") PersonnelArtisanExample example);

    int updateByPrimaryKeySelective(PersonnelArtisan record);

    int updateByPrimaryKey(PersonnelArtisan record);
}