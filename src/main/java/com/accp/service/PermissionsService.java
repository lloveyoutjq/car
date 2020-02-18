package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional
@Service
public class PermissionsService {
    @Autowired(required = false)
    SystemPermissionsMapper permissionsMapper;
    /**
     * 查询用户菜单权限
     * @param uid 根据用户id
     * @return
     */
    public List<SystemPermissions> selectUserMenuAll(Integer type,Integer uid){
        //System.out.println("1111");
        return permissionsMapper.selectUserMenuAll(type,uid);
    }

    /**
     * 根据rid查找权限
     * @param rid
     * @return
     */
    public List<SystemPermissions> selectUserMenuById(Integer rid){
        List<SystemPermissions> list = permissionsMapper.selectUserMenuById(rid);
        SystemPermissions parentPerms = new SystemPermissions();
        parentPerms.setId(0);
        recursionPerm(parentPerms, list);
        return parentPerms.getChildren();
    }

    /**
     * 遍历层次关系
     * @param uid 根据用户id
     * @return
     */
    public List<SystemPermissions> selectUserPerm(Integer type,Integer uid){
        List<SystemPermissions> list = selectUserMenuAll(type,uid);
        SystemPermissions parentPerms = new SystemPermissions();
        parentPerms.setId(0);
        recursionPerm(parentPerms, list);
        //System.out.println(parentPerms);
        return parentPerms.getChildren();
    }

    /**
     * 递归层次关系
     * @param parentPerms
     * @param list
     */
    public void recursionPerm(SystemPermissions parentPerms,List<SystemPermissions> list){
        for(SystemPermissions perm : list){
            if(perm.getParentid() == parentPerms.getId()){

                Map map = new HashMap();
                map.put("type",0);
                map.put("checked",perm.getState());
                perm.setTitle(perm.getName());
                perm.setCheckArr(map);
                if(perm.getCatalog() != null && perm.getCatalog() > 0){
                    perm.setHide(true);
                }

                SystemPermissions newPerms = perm;
                parentPerms.getChildren().add(newPerms);
                recursionPerm(newPerms,list);
            }
        }
    }



    public void recursionTopPerm(int pid){

    }

}
