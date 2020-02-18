package com.accp.service.personnel;

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
    public List<PersonnelArtisanlevel> starSelect(){
        return personnelArtisanlevelMapper.selectByExample(null);
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
        return personnelArtisanlevelMapper.updateByPrimaryKey(personnelArtisanlevel);
    }
    /**
     * 删除
     */
    public int starRemove(Integer artisanlevelid){
        return personnelArtisanlevelMapper.deleteByPrimaryKey(artisanlevelid);
    }
}
