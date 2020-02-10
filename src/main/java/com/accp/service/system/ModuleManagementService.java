package com.accp.service.system;

import com.accp.domain.SystemPermissions;
import com.accp.domain.SystemRoles;
import com.accp.domain.SystemRolesPerms;
import com.accp.mapper.SystemPermissionsMapper;
import com.accp.mapper.SystemRolesPermsMapper;
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
}
