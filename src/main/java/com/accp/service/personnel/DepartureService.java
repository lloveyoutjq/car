package com.accp.service.personnel;

import com.accp.domain.PersonnelDimission;
import com.accp.domain.PersonnelStaff;
import com.accp.mapper.PersonnelDimissionMapper;
import com.accp.mapper.PersonnelStaffMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 人事-员工资料-离职登记
 */
@Transactional
@Service
public class DepartureService {
    //员工表
    @Autowired(required = false)
    PersonnelStaffMapper personnelStaffMapper;
    //离职表
    @Autowired(required = false)
    PersonnelDimissionMapper personnelDimissionMapper;

    /**
     * 查询所有
     */
    public List<PersonnelStaff> departureSelect(){
        return personnelStaffMapper.departureSelect();
    }
    /**
     * 查询所有离职人员
     */
    public List<PersonnelStaff> departureSelectTwo(){
        return personnelStaffMapper.departureSelectTwo();
    }
    /**
     * 根据条件查询
     */
    public List<PersonnelStaff> departureSelectId(PersonnelStaff personnelStaff){
        return personnelStaffMapper.departureSelectId(personnelStaff);
    }
    /**
     * 新增
     */
    public int departureAdd(PersonnelDimission personnelDimission){
        return personnelDimissionMapper.insert(personnelDimission);
    }
    /**
     * 修改
     */
    public int departureUpdate(PersonnelDimission personnelDimission){
        return personnelDimissionMapper.updateByPrimaryKey(personnelDimission);
    }
    /**
     * 删除
     */
    public int departureRemove(Integer id){
        return personnelDimissionMapper.deleteByPrimaryKey(id);
    }
}
