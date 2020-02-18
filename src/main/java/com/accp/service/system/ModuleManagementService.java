package com.accp.service.system;

import com.accp.service.PermissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ModuleManagementService {
    @Autowired(required = false)
    SystemPermissionsMapper systemPermissionsMapper;
    @Autowired(required = false)
    PermissionsService permissionsService;
    @Autowired(required = false)
    PermissionsControlService permissionsControlService;
    @Autowired(required = false)
    SystemRolesPermsMapper systemRolesPermsMapper;

    public int insertPermissions(SystemPermissions systemPermissions){
        int count = systemPermissionsMapper.insertSelective(systemPermissions);
        System.out.println("新增id"+systemPermissions.getId());
        List<SystemRoles> lists = permissionsControlService.selectSystemRolesAll();
        for(SystemRoles item : lists){
            SystemRolesPerms systemRolesPerms = new SystemRolesPerms();
            systemRolesPerms.setState(1);
            systemRolesPerms.setRid(item.getId());
            systemRolesPerms.setPid(systemPermissions.getId());
            systemRolesPermsMapper.insertSelective(systemRolesPerms);
        }
        return count;
    }

    public SystemPermissions getPermission(Integer id){
        return systemPermissionsMapper.selectByPrimaryKey(id);
    }

    public List<SystemPermissions> selectPermissions(){
        List<SystemPermissions> lists =  systemPermissionsMapper.selectByExample(null);
        SystemPermissions parentPerms = new SystemPermissions();
        parentPerms.setId(0);
        permissionsService.recursionPerm(parentPerms, lists);
        //System.out.println(parentPerms);
        return parentPerms.getChildren();
    }

    public int updatePermissions(SystemPermissions systemPermissions){
        return systemPermissionsMapper.updateByPrimaryKeySelective(systemPermissions);
    }
    public int deletePermissions(Integer id){
        return systemPermissionsMapper.deleteByPrimaryKey(id);
    }

    /**
     * 数据条件来查询 权限
     * @param systemPermissions
     * @return
     */
    public List<SystemPermissions> selectPermissionsWhere(SystemPermissions systemPermissions,Integer rid){
        SystemPermissionsExample example = new SystemPermissionsExample();
        if(systemPermissions.getParentid() != null){
            example.createCriteria().andParentidEqualTo(systemPermissions.getParentid()).andCatalogEqualTo(1);
        }
        List<SystemPermissions> lists = systemPermissionsMapper.selectByExample(example);
        if(rid != null && rid !=0){
            for(SystemPermissions item : lists){
                SystemRolesPerms systemRolesPerms = permissionsControlService.selectSystemRolesPermsWhere(rid,item.getId()).get(0);
                item.setState(systemRolesPerms.getState());
            }
        }
        return lists;
    }
}
