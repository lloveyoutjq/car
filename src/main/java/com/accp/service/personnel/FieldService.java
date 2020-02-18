package com.accp.service.personnel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 人事-技工管理-外勤车俩
 */
@Transactional
@Service
public class FieldService {
    //外勤车辆
    @Autowired(required = false)
    PersonnelLegworkcatMapper personnelLegworkcatMapper;

    /**
     * 查询所有
     */
    public List<PersonnelLegworkcat> fieldSelect(){
        return personnelLegworkcatMapper.fieldSelect();
    }
    /**
     * 根据条件查询
     */
    public PersonnelLegworkcat fieldSelectId(Integer legworkcatid){
        return null;
    }
    /**
     * 新增
     */
    public int fieldAdd(PersonnelLegworkcat personnelLegworkcat){
        return personnelLegworkcatMapper.insert(personnelLegworkcat);
    }
    /**
     * 修改
     */
    public int fieldUpdate(PersonnelLegworkcat personnelLegworkcat){
        return personnelLegworkcatMapper.updateByPrimaryKey(personnelLegworkcat);
    }
    /**
     * 删除
     */
    public int fieldRemove(Integer legworkcatid){
        return personnelLegworkcatMapper.deleteByPrimaryKey(legworkcatid);
    }
}
