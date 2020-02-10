package com.accp.service.personnel;

import com.accp.domain.PersonnelDimission;
import com.accp.mapper.PersonnelDimissionMapper;
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
    //离职登记
    @Autowired(required = false)
    PersonnelDimissionMapper personnelDimissionMapper;

    /**
     * 查询所有
     */
    public List<PersonnelDimission> departureSelect(){
        return personnelDimissionMapper.selectByExample(null);
    }
    /**
     * 根据条件查询
     */
    public PersonnelDimission departureSelectId(Integer id){
        return null;
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
