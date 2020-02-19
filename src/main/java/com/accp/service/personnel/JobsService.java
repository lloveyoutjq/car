package com.accp.service.personnel;

import com.accp.domain.PersonnelPost;
import com.accp.mapper.PersonnelPostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 人事-员工资料-岗位定义
 */
@Transactional
@Service
public class JobsService {
    //岗位定义
    @Autowired(required = false)
    PersonnelPostMapper personnelPostMapper;

    /**
     * 查询所有
     */
    public List<PersonnelPost> jobsSelect(){
        return personnelPostMapper.selectByExample(null);
    }
    /**
     * 根据条件查询
     */
    public PersonnelPost jobsSelectId(Integer postid){
        return personnelPostMapper.selectByPrimaryKey(postid);
    }
    /**
     * 新增
     */
    public int jobsAdd(PersonnelPost personnelPost){
        return personnelPostMapper.insert(personnelPost);
    }
    /**
     * 修改
     */
    public int jobsUpdate(PersonnelPost personnelPost){
        return personnelPostMapper.updateByPrimaryKey(personnelPost);
    }
    /**
     * 删除
     */
    public int jobsRemove(Integer postid){
        return personnelPostMapper.deleteByPrimaryKey(postid);
    }
}
