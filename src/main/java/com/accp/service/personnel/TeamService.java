package com.accp.service.personnel;

import com.accp.domain.PersonnelArtisan;
import com.accp.domain.PersonnelArtisanclass;
import com.accp.domain.PersonnelArtisanlevel;
import com.accp.domain.PersonnelLegworkcat;
import com.accp.mapper.PersonnelArtisanMapper;
import com.accp.mapper.PersonnelArtisanclassMapper;
import com.accp.mapper.PersonnelArtisanlevelMapper;
import com.accp.mapper.PersonnelLegworkcatMapper;
import com.accp.service.PermissionsService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    //班组技工
    @Autowired(required = false)
    PersonnelArtisanMapper personnelArtisanMapper;
    //班组名称
    @Autowired(required = false)
    PersonnelArtisanclassMapper personnelArtisanclassMapper;

    /**
     * 查询所有
     */
    public PageInfo<PersonnelArtisan> teamSelect(Integer index, Integer limit,List<Integer> ids) {
        Page<PersonnelArtisan> page = PageHelper.startPage(index, limit);
        PersonnelArtisan personnelArtisan = new PersonnelArtisan();
        /*ids.add(1);
        ids.add(2);*/
        personnelArtisan.setIds(ids);
        personnelArtisanMapper.teamSelect(personnelArtisan);
        return page.toPageInfo();
    }
    /**
     * 查询所有技工表
     */
    public List<PersonnelArtisanclass> exArtisanclass(){
        return personnelArtisanclassMapper.selectByExample(null);
    }
    /**
     * 查询树状结构树
     */
    public List<PersonnelArtisanclass> teamSelectTwo(){
        List<PersonnelArtisanclass> lists = personnelArtisanclassMapper.selectByExample(null);
        PersonnelArtisanclass parentPerms = new PersonnelArtisanclass();
        parentPerms.setArtisanclassid(0);
        recursionPerm(parentPerms, lists);
        System.out.println(parentPerms);
        return parentPerms.getChildren();
    }
    /**
     * 递归层次关系
     * @param parentPerms
     * @param list
     */
    private void recursionPerm(PersonnelArtisanclass parentPerms,List<PersonnelArtisanclass> list){
        for(PersonnelArtisanclass perm : list){
            if(perm.getParentid() == parentPerms.getArtisanclassid()){

               /* Map map = new HashMap();
                map.put("type",0);
                map.put("checked",perm.getState());
                perm.setTitle(perm.getName());
                perm.setCheckArr(map);*/
                perm.setTitle(perm.getArtisanclassname());
                perm.setId(perm.getArtisanclassid());
                PersonnelArtisanclass newPerms = perm;
                parentPerms.getChildren().add(newPerms);
                recursionPerm(newPerms,list);
            }
        }
    }
    /**
     * 根据条件查询所有
     * @return
     */
    public PageInfo<PersonnelArtisan> teamSelectOpen(Integer index, Integer size, PersonnelArtisan personnelArtisan){
        Page<PersonnelArtisan> page = PageHelper.startPage(index,size);
        personnelArtisanMapper.teamSelectOpen(personnelArtisan);
        return page.toPageInfo();
    }
    /**
     * 新增
     */
    public int teamAdd(PersonnelArtisan personnelArtisan){
        return personnelArtisanMapper.insert(personnelArtisan);
    }
    /**
     * 修改
     */
    public int teamUpdate(PersonnelArtisan personnelArtisan){
        return personnelArtisanMapper.updateByPrimaryKeySelective(personnelArtisan);
    }
    /**
     * 删除
     */
    public int teamRemove(Integer artisanid){
        return personnelArtisanMapper.deleteByPrimaryKey(artisanid);
    }
}
