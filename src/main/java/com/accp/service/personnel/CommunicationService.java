package com.accp.service.personnel;

import com.accp.domain.PersonnelAddressbook;
import com.accp.domain.PersonnelStaff;
import com.accp.mapper.PersonnelAddressbookMapper;
import com.accp.mapper.PersonnelStaffMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 人事-员工资料-通讯名单
 */
@Transactional
@Service
public class CommunicationService {
    //通讯名单
    @Autowired(required = false)
    PersonnelAddressbookMapper personnelAddressbookMapper;
    //员工表
    @Autowired(required = false)
    PersonnelStaffMapper personnelStaffMapper;

    /**
     * 查询所有
     */
    public List<PersonnelStaff> communicationSelect(){
        return personnelStaffMapper.communicationSelect();
    }
    /**
     * 根据条件查询
     */
    public PersonnelStaff communicationSelectId(Integer staffid,String staffname){
        return personnelStaffMapper.communicationSelectId(staffid,staffname);
    }
    /**
     * 新增
     */
    public int communicationAdd(PersonnelStaff personnelStaff){
        return personnelStaffMapper.insert(personnelStaff);
    }
    /**
     * 修改
     */
    public int communicationUpdate(PersonnelStaff personnelStaff){
        return personnelStaffMapper.updateByPrimaryKey(personnelStaff);
    }
    /**
     * 删除
     */
    public int communicationRemove(String id){
        return personnelStaffMapper.deleteByPrimaryKey(id);
    }
}