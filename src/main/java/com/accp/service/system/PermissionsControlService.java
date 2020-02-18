package com.accp.service.system;

import com.accp.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class PermissionsControlService {

    @Autowired(required = false)
    SystemRolesPermsMapper systemRolesPermsMapper;
    @Autowired(required = false)
    SystemRolesMapper systemRolesMapper;
    @Autowired(required = false)
    SystemPermissionsMapper systemPermissionsMapper;


    /**
     * 查询角色权限表
     * @param rid
     * @return
     */
    public SystemRolesPerms selectSystemRolesPerms(Integer rid) {
        return systemRolesPermsMapper.selectByPrimaryKey(rid);
    }

    /**
     * 根据rid和pid查询角色权限表
     * @param rid
     * @param pid
     * @return
     */
    public List<SystemRolesPerms> selectSystemRolesPermsWhere(Integer rid,Integer pid) {
        SystemRolesPermsExample example = new SystemRolesPermsExample();
        example.createCriteria().andPidEqualTo(pid).andRidEqualTo(rid);

        return systemRolesPermsMapper.selectByExample(example);
    }

    /**
     * 查询所有角色
     * @return
     */
    public List<SystemRoles> selectSystemRolesAll(){
        return systemRolesMapper.selectByExample(null);
    }

    /**
     * 添加角色
     * @return
     */
    public int addSystemRoles(SystemRoles systemRoles){
        int count = systemRolesMapper.insertSelective(systemRoles);
        List<SystemPermissions> lists =  systemPermissionsMapper.selectByExample(null);
        for(SystemPermissions item : lists){
            SystemRolesPerms systemRolesPerms = new SystemRolesPerms();
            systemRolesPerms.setPid(item.getId());
            systemRolesPerms.setRid(systemRoles.getId());
            systemRolesPerms.setState(0);

            systemRolesPermsMapper.insertSelective(systemRolesPerms);
        }
        return count;
    }
    /**
     * 修改角色
     * @return
     */
    public int updateSystemRoles(SystemRoles systemRoles){
        return systemRolesMapper.updateByPrimaryKeySelective(systemRoles);
    }
    /**
     * 删除角色
     * @return
     */
    public int deleteSystemRoles(int id){
        List<SystemPermissions> lists =  systemPermissionsMapper.selectByExample(null);
        for(SystemPermissions item : lists){
            SystemRolesPermsExample example = new SystemRolesPermsExample();
            example.createCriteria().andRidEqualTo(id).andPidEqualTo(item.getId());
            systemRolesPermsMapper.deleteByExample(example);
        }

        return systemRolesMapper.deleteByPrimaryKey(id);
    }


    /**
     * 修改角色权限
     * @param pid
     * @param rid
     * @param state
     * @return
     */
    public int updatePerm(Integer pid,Integer rid,Integer state){
        SystemRolesPerms record = new SystemRolesPerms();
        SystemRolesPermsExample example = new SystemRolesPermsExample();
        record.setState(state);
        example.createCriteria().andPidEqualTo(pid).andRidEqualTo(rid);

        return systemRolesPermsMapper.updateByExampleSelective(record,example);
    }



}
