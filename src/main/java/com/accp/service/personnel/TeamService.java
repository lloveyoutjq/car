package com.accp.service.personnel;

import com.accp.domain.PersonnelLegworkcat;
import com.accp.mapper.PersonnelLegworkcatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 人事-技工管理-班组技工
 */
@Transactional
@Service
public class TeamService {
    //外勤车辆
    @Autowired(required = false)
    PersonnelLegworkcatMapper personnelLegworkcatMapper;

    /**
     * 查询所有
     */
    public List<PersonnelLegworkcat> TeamSelect(){
        return personnelLegworkcatMapper.selectByExample(null);
    }
    /**
     * 根据条件查询
     */
    public PersonnelLegworkcat TeamSelectId(Integer legworkcatid){
        return null;
    }
    /**
     * 新增
     */
    public int TeamAdd(PersonnelLegworkcat personnelPost){
        return personnelLegworkcatMapper.insert(personnelPost);
    }
    /**
     * 修改
     */
    public int TeamUpdate(PersonnelLegworkcat personnelPost){
        return personnelLegworkcatMapper.updateByPrimaryKey(personnelPost);
    }
    /**
     * 删除
     */
    public int TeamRemove(Integer legworkcatid){
        return personnelLegworkcatMapper.deleteByPrimaryKey(legworkcatid);
    }
}
