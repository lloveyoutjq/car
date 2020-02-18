package com.accp.mapper;

import com.accp.domain.PersonnelAddressbook;
import com.accp.domain.PersonnelAddressbookExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonnelAddressbookMapper {
    int countByExample(PersonnelAddressbookExample example);

    int deleteByExample(PersonnelAddressbookExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PersonnelAddressbook record);

    int insertSelective(PersonnelAddressbook record);

    List<PersonnelAddressbook> selectByExample(PersonnelAddressbookExample example);

    PersonnelAddressbook selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PersonnelAddressbook record, @Param("example") PersonnelAddressbookExample example);

    int updateByExample(@Param("record") PersonnelAddressbook record, @Param("example") PersonnelAddressbookExample example);

    int updateByPrimaryKeySelective(PersonnelAddressbook record);

    int updateByPrimaryKey(PersonnelAddressbook record);
}