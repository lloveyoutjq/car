package com.accp.service.personnel;

import com.accp.domain.PersonnelArtisanlevel;
import com.accp.domain.PersonnelLegworkcat;
import com.accp.mapper.PersonnelArtisanlevelMapper;
import com.accp.mapper.PersonnelLegworkcatMapper;
import com.accp.mapper.PersonnelStaffMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 人事-技工管理-技工星级
 */
@Transactional
@Service
public class StarService {
    //技工星级
    @Autowired(required = false)
    PersonnelArtisanlevelMapper personnelArtisanlevelMapper;
    /**
     * 查询所有
     */
    public PageInfo<PersonnelArtisanlevel> starSelect(Integer index, Integer limit, List<Integer> ids) {
        Page<PersonnelArtisanlevel> page = PageHelper.startPage(index, limit);
        PersonnelArtisanlevel personnelArtisanlevel = new PersonnelArtisanlevel();
        /*ids.add(1);
        ids.add(2);*/
        personnelArtisanlevel.setIds(ids);
        personnelArtisanlevelMapper.starSelect(personnelArtisanlevel);
        return page.toPageInfo();
    }
    /**
     * 根据条件查询
     */
    public PersonnelArtisanlevel starSelectId(Integer artisanlevelid){
        return null;
    }
    /**
     * 新增
     */
    public int starAdd(PersonnelArtisanlevel personnelArtisanlevel){
        return personnelArtisanlevelMapper.insert(personnelArtisanlevel);
    }
    /**
     * 修改
     */
    public int starUpdate(PersonnelArtisanlevel personnelArtisanlevel){
        return personnelArtisanlevelMapper.updateByPrimaryKeySelective(personnelArtisanlevel);
    }
    /**
     * 删除
     */
    public int starRemove(Integer artisanlevelid){
        return personnelArtisanlevelMapper.deleteByPrimaryKey(artisanlevelid);
    }
}
