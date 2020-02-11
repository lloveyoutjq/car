package com.accp.mapper;

import com.accp.domain.PersonnelAddressbook;
import com.accp.domain.PersonnelAddressbookExample;
import com.accp.domain.PersonnelStaff;
import com.accp.domain.PersonnelStaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonnelStaffMapper {
    /*通讯名单*/
    List<PersonnelStaff> communicationSelect();
    PersonnelStaff communicationSelectId(Integer id,String staffname);
    /*离职登记*/
    List<PersonnelStaff> departureSelect();
    PersonnelStaff departureSelectId(Integer id,String staffname);


    int countByExample(PersonnelStaffExample example);

    int deleteByExample(PersonnelStaffExample example);

    int deleteByPrimaryKey(String id);

    int insert(PersonnelStaff record);

    int insertSelective(PersonnelStaff record);

    List<PersonnelStaff> selectByExample(PersonnelStaffExample example);

    PersonnelStaff selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PersonnelStaff record, @Param("example") PersonnelStaffExample example);

    int updateByExample(@Param("record") PersonnelStaff record, @Param("example") PersonnelStaffExample example);

    int updateByPrimaryKeySelective(PersonnelStaff record);

    int updateByPrimaryKey(PersonnelStaff record);
}