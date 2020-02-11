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

    /**
     * 查询所有
     */
    public List<PersonnelStaff> departureSelect(){
        return personnelStaffMapper.departureSelect();
    }
    /**
     * 根据条件查询
     */
    public PersonnelStaff departureSelectId(Integer id,String staffname){
        return personnelStaffMapper.departureSelectId(id,staffname);
    }
    /**
     * 新增
     */
    public int departureAdd(PersonnelStaff personnelStaff){
        return personnelStaffMapper.insert(personnelStaff);
    }
    /**
     * 修改
     */
    public int departureUpdate(PersonnelStaff personnelStaff){
        return personnelStaffMapper.updateByPrimaryKey(personnelStaff);
    }
    /**
     * 删除
     */
    public int departureRemove(String id){
        return personnelStaffMapper.deleteByPrimaryKey(id);
    }
}
