package com.accp.service.personnel;

import com.accp.domain.PersonnelAddressbook;
import com.accp.domain.PersonnelStaff;
import com.accp.mapper.PersonnelAddressbookMapper;
import com.accp.mapper.PersonnelStaffMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    //员工表
    @Autowired(required = false)
    PersonnelStaffMapper personnelStaffMapper;

    /**
     * 查询所有
     */
    public PageInfo<PersonnelStaff> communicationSelect(Integer index, Integer limit, List<Integer> ids){
        Page<PersonnelStaff> page = PageHelper.startPage(index,limit);
        PersonnelStaff personnelStaff = new PersonnelStaff();
        /*ids.add(1);
        ids.add(2);*/
        personnelStaff.setIds(ids);
        personnelStaffMapper.communicationSelect(personnelStaff);
        return page.toPageInfo();
    }
    /**
     * 根据条件查询
     */
    public List<PersonnelStaff> communicationSelectId(PersonnelStaff personnelStaff){
        return personnelStaffMapper.communicationSelectId(personnelStaff);
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
        return personnelStaffMapper.updateByPrimaryKeySelective(personnelStaff);
    }
    /**
     * 删除
     */
    public int communicationRemove(Integer id){
        return personnelStaffMapper.deleteByPrimaryKey(id);
    }
}
