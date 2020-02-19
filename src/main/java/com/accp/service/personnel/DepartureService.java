package com.accp.service.personnel;

import com.accp.domain.PersonnelDimission;
import com.accp.domain.PersonnelStaff;
import com.accp.mapper.PersonnelDimissionMapper;
import com.accp.mapper.PersonnelStaffMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public PageInfo<PersonnelStaff> departureSelect(Integer index, Integer limit, List<Integer> ids){
        Page<PersonnelStaff> page = PageHelper.startPage(index,limit);
        PersonnelStaff personnelStaff = new PersonnelStaff();
        /*ids.add(1);
        ids.add(2);*/
        personnelStaff.setIds(ids);
        personnelStaffMapper.departureSelect(personnelStaff);
        return page.toPageInfo();
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
        return personnelDimissionMapper.updateByPrimaryKeySelective(personnelDimission);
    }
    /**
     * 删除
     */
    public int departureRemove(Integer id){
        return personnelDimissionMapper.deleteByPrimaryKey(id);
    }
}
