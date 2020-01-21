package com.accp.service;

import com.accp.domain.SystemPermissions;
import com.accp.mapper.SystemPermissionsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
        System.out.println("1111");
        return permissionsMapper.selectUserMenuAll(type,uid);
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
        System.out.println(parentPerms);
        return parentPerms.getChildrens();
    }

    /**
     * 递归层次关系
     * @param parentPerms
     * @param list
     */
    private void recursionPerm(SystemPermissions parentPerms,List<SystemPermissions> list){
        for(SystemPermissions perm : list){
            if(perm.getParentid() == parentPerms.getId()){
                SystemPermissions newPerms = perm;
                parentPerms.getChildrens().add(newPerms);
                recursionPerm(newPerms,list);
            }
        }
    }

}
