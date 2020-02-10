package com.accp.service.personnel;

import com.accp.domain.PersonnelAddressbook;
import com.accp.domain.PersonnelPost;
import com.accp.mapper.PersonnelAddressbookMapper;
import com.accp.mapper.PersonnelPostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 人事-员工资料-组织机构
 */
@Transactional
@Service
public class InstitutionsService {
    @Autowired(required = false)
    PersonnelPostMapper personnelPostMapper;
    @Autowired(required = false)
    PersonnelAddressbookMapper personnelAddressbookMapper;

    /**
     * 查询所有组织机构
     */
    public List<PersonnelPost> InstitutionsSelect(){
        return personnelPostMapper.selectByExample(null);
    }
    /**
     * 根据条件查询
     */
    public PersonnelPost InstitutionsSelectId(Integer postid){
        return null;
    }
    /**
     * 新增员工
     */
    public int InstitutionsAdd(PersonnelPost personnelPost){
        return personnelPostMapper.insert(personnelPost);
    }
    /**
     * 修改员工
     */
    public int InstitutionsUpdate(PersonnelPost personnelPost){
        return personnelPostMapper.updateByPrimaryKey(personnelPost);
    }
    /**
     * 删除员工
     */
    public int InstitutionsRemove(Integer postid){
        return personnelPostMapper.deleteByPrimaryKey(postid);
    }
}
