package com.accp.mapper;

import com.accp.domain.PersonnelArtisan;
import com.accp.domain.PersonnelArtisanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonnelArtisanMapper {
    /*班组技工*/
    List<PersonnelArtisan> teamSelect(@Param("personnelArtisan") PersonnelArtisan personnelArtisan);
    List<PersonnelArtisan> teamSelectOpen(@Param("personnelArtisan") PersonnelArtisan personnelArtisan);




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