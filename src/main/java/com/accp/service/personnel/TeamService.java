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
    public List<PersonnelArtisan> teamSelect(){
        return personnelArtisanMapper.teamSelect();
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
     * 根据条件查询
     */
    public List<PersonnelArtisan> teamSelectId(PersonnelArtisan personnelArtisan){
        return personnelArtisanMapper.teamSelectId(personnelArtisan);
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
        return personnelArtisanMapper.updateByPrimaryKey(personnelArtisan);
    }
    /**
     * 删除
     */
    public int teamRemove(Integer artisanid){
        return personnelArtisanMapper.deleteByPrimaryKey(artisanid);
    }
}
