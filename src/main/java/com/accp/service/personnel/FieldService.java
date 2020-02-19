package com.accp.service.personnel;

import com.accp.domain.PersonnelLegworkcat;
import com.accp.mapper.PersonnelLegworkcatMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public PageInfo<PersonnelLegworkcat> fieldSelect(Integer index, Integer limit, List<Integer> ids) {
        Page<PersonnelLegworkcat> page = PageHelper.startPage(index, limit);
        PersonnelLegworkcat personnelLegworkcat = new PersonnelLegworkcat();
        /*ids.add(1);
        ids.add(2);*/
        personnelLegworkcat.setIds(ids);
        personnelLegworkcatMapper.fieldSelect(personnelLegworkcat);
        return page.toPageInfo();
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
        return personnelLegworkcatMapper.updateByPrimaryKeySelective(personnelLegworkcat);
    }
    /**
     * 删除
     */
    public int fieldRemove(Integer legworkcatid){
        return personnelLegworkcatMapper.deleteByPrimaryKey(legworkcatid);
    }
}
