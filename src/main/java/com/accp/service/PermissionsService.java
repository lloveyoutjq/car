package com.accp.service;

import com.accp.domain.Permissions;
import com.accp.mapper.PermissionsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class PermissionsService {
    @Autowired(required = false)
    PermissionsMapper permissionsMapper;
    /**
     * 查询用户菜单权限
     * @return
     */
    public List<Permissions> selectUserMenuAll(Integer uid){
        System.out.println("1111");
        return permissionsMapper.selectUserMenuAll(uid);
    }

    public List<Permissions> selectUserPerm(Integer uid){
        List<Permissions> list = selectUserMenuAll(uid);
        Permissions parentPerms = new Permissions();
        parentPerms.setId(0);
        recursionPerm(parentPerms, list);
        System.out.println(parentPerms);
        return parentPerms.getChildrens();
    }

    private void recursionPerm(Permissions parentPerms,List<Permissions> list){
        for(Permissions perm : list){
            if(perm.getParentid() == parentPerms.getId()){
                Permissions newPerms = perm;
                parentPerms.getChildrens().add(newPerms);
                recursionPerm(newPerms,list);
            }
        }
    }

}
