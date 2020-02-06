package com.accp.service.system;

import com.accp.domain.SystemRoles;
import com.accp.domain.SystemRolesExample;
import com.accp.domain.SystemRolesPerms;
import com.accp.domain.SystemRolesPermsExample;
import com.accp.mapper.SystemRolesMapper;
import com.accp.mapper.SystemRolesPermsMapper;
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

    public SystemRolesPerms selectSystemRolesPerms(Integer rid) {
        return systemRolesPermsMapper.selectByPrimaryKey(rid);
    }
    public List<SystemRoles> selectSystemRolesAll(){
        return systemRolesMapper.selectByExample(null);
    }
    public int updatePerm(Integer pid,Integer rid,Integer state){
        SystemRolesPerms record = new SystemRolesPerms();
        SystemRolesPermsExample example = new SystemRolesPermsExample();
        record.setState(state);
        example.createCriteria().andPidEqualTo(pid).andRidEqualTo(rid);

        return systemRolesPermsMapper.updateByExampleSelective(record,example);
    }
}
