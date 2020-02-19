package com.accp.mapper;

import com.accp.domain.PersonnelStaff;
import com.accp.domain.PersonnelStaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonnelStaffMapper {
    /*组织机构*/
    List<PersonnelStaff> institutionsSelect(@Param("personnelStaff") PersonnelStaff personnelStaff);
    List<PersonnelStaff> institutionsSelectOpen(@Param("personnelStaff") PersonnelStaff personnelStaff);
    /*通讯名单*/
    List<PersonnelStaff> communicationSelect(@Param("personnelStaff") PersonnelStaff personnelStaff);
    List<PersonnelStaff> communicationSelectId(@Param("personnelStaff") PersonnelStaff personnelStaff);
    /*离职登记*/
    List<PersonnelStaff> departureSelect(@Param("personnelStaff") PersonnelStaff personnelStaff);
    List<PersonnelStaff> departureSelectTwo();
    List<PersonnelStaff> departureSelectId(@Param("personnelStaff") PersonnelStaff personnelStaff);




    int countByExample(PersonnelStaffExample example);

    int deleteByExample(PersonnelStaffExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PersonnelStaff record);

    int insertSelective(PersonnelStaff record);

    List<PersonnelStaff> selectByExample(PersonnelStaffExample example);

    PersonnelStaff selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PersonnelStaff record, @Param("example") PersonnelStaffExample example);

    int updateByExample(@Param("record") PersonnelStaff record, @Param("example") PersonnelStaffExample example);

    int updateByPrimaryKeySelective(PersonnelStaff record);

    int updateByPrimaryKey(PersonnelStaff record);
}