package com.accp.service.personnel;

import com.accp.domain.PersonnelDepartment;
import com.accp.domain.PersonnelStaff;
import com.accp.mapper.PersonnelDepartmentMapper;
import com.accp.mapper.PersonnelStaffMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * 人事-员工资料-组织机构
 */
@Transactional
@Service
public class InstitutionsService {
    @Autowired(required = false)
    PersonnelStaffMapper personnelStaffMapper;
    @Autowired(required = false)
    PersonnelDepartmentMapper personnelDepartmentMapper;

    /**
     * 查询所有
     * @return
     */
    public PageInfo<PersonnelStaff> institutionsSelect(Integer index, Integer limit,List<Integer> ids){
        Page<PersonnelStaff> page = PageHelper.startPage(index,limit);
        PersonnelStaff personnelStaff = new PersonnelStaff();
        /*ids.add(1);
        ids.add(2);*/
        personnelStaff.setIds(ids);
        personnelStaffMapper.institutionsSelect(personnelStaff);
        return page.toPageInfo();
    }


    /**
     * 查询树状结构树
     */
    public List<PersonnelDepartment> institutionsSelectTwo(){
        List<PersonnelDepartment> lists = personnelDepartmentMapper.selectByExample(null);
        PersonnelDepartment parentPerms = new PersonnelDepartment();
        parentPerms.setId(0);
        recursionPerm(parentPerms, lists);
        System.out.println(parentPerms);
        return parentPerms.getChildren();
    }
    /**
     * 递归层次关系
     * @param parentPerms
     * @param list
     */
    private void recursionPerm(PersonnelDepartment parentPerms,List<PersonnelDepartment> list){
        for(PersonnelDepartment perm : list){
            if(perm.getParentid() == parentPerms.getId()){

               /* Map map = new HashMap();
                map.put("type",0);
                map.put("checked",perm.getState());
                perm.setTitle(perm.getName());
                perm.setCheckArr(map);*/
                perm.setTitle(perm.getDepartmentname());
                perm.setId(perm.getId());
                PersonnelDepartment newPerms = perm;
                parentPerms.getChildren().add(newPerms);
                recursionPerm(newPerms,list);
            }
        }
    }
    /**
     * 根据条件查询
     */
    public PersonnelStaff institutionsSelectId(Integer id){
        return null;
    }
    /**
     * 新增员工
     */
    public int institutionsAdd(PersonnelStaff personnelStaff){
        return personnelStaffMapper.insert(personnelStaff);
    }
    /**
     * 修改员工
     */
    public int institutionsUpdate(PersonnelStaff personnelStaff){
        return personnelStaffMapper.updateByPrimaryKey(personnelStaff);
    }
    /**
     * 删除员工
     */
    public int institutionsRemove(Integer id){
        return personnelStaffMapper.deleteByPrimaryKey(id);
    }
}
