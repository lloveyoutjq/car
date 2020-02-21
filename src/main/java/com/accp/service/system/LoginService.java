package com.accp.service.system;

import com.accp.domain.PersonnelArtisan;
import com.accp.domain.PersonnelArtisanExample;
import com.accp.domain.PersonnelStaff;
import com.accp.domain.PersonnelStaffExample;
import com.accp.mapper.PersonnelArtisanMapper;
import com.accp.mapper.PersonnelStaffMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class LoginService {

    @Autowired(required = false)
    PersonnelStaffMapper personnelStaffMapper;
    @Autowired(required = false)
    PersonnelArtisanMapper personnelArtisanMapper;
    /**
     * 登录
     */
    public Integer login(String user, String pwd, String type){
        int count = 0;
        if("0".equals(type)){
            PersonnelStaffExample example = new PersonnelStaffExample();
            example.createCriteria().andEmailEqualTo(user).andPasswordEqualTo(pwd);
            example.or().andStaffaccountEqualTo(user).andPasswordEqualTo(pwd);
            List<PersonnelStaff> lists = personnelStaffMapper.selectByExample(example);
            count = lists.size();
        }else if("1".equals(type)){
            PersonnelArtisanExample example = new PersonnelArtisanExample();
            example.createCriteria().andAccountEqualTo(user).andPasswordEqualTo(pwd);
            example.or().andEmailEqualTo(user).andPasswordEqualTo(pwd);
            List<PersonnelArtisan> lists = personnelArtisanMapper.selectByExample(example);
            count = lists.size();
        }else{
            count = 0;
        }
        return count;
    }


}
