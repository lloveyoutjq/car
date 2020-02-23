package com.accp.service.system;

import com.accp.domain.PersonnelArtisan;
import com.accp.domain.PersonnelArtisanExample;
import com.accp.domain.PersonnelStaff;
import com.accp.domain.PersonnelStaffExample;
import com.accp.entity.User;
import com.accp.mapper.PersonnelArtisanMapper;
import com.accp.mapper.PersonnelStaffMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.Date;
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
    public User login(String user, String pwd, String type){
        User userMsg = new User();
        if("0".equals(type)){
            PersonnelStaffExample example = new PersonnelStaffExample();
            example.createCriteria().andEmailEqualTo(user).andPasswordEqualTo(pwd);
            example.or().andStaffaccountEqualTo(user).andPasswordEqualTo(pwd);
            List<PersonnelStaff> lists = personnelStaffMapper.selectByExample(example);
            userMsg.setState(lists.size());
            if(lists.size()>0){
                PersonnelStaff record = new PersonnelStaff();
                record.setPastcodedate(new Date());
                record.setAuthcode("1");
                personnelStaffMapper.updateByExampleSelective(record, example);

                userMsg.setType(Integer.valueOf(type));
                userMsg.setUid(lists.get(0).getId());
                userMsg.setPassword(pwd);
                userMsg.setUser(user);
                userMsg.setUserName(lists.get(0).getStaffname());
                userMsg.setHeadImgUrl(lists.get(0).getPicture());
            }


        }else if("1".equals(type)){
            PersonnelArtisanExample example = new PersonnelArtisanExample();
            example.createCriteria().andAccountEqualTo(user).andPasswordEqualTo(pwd);
            example.or().andEmailEqualTo(user).andPasswordEqualTo(pwd);
            List<PersonnelArtisan> lists = personnelArtisanMapper.selectByExample(example);

            userMsg.setState(lists.size());
            if(lists.size()>0){
                PersonnelArtisan record = new PersonnelArtisan();
                record.setPastcodedate(new Date());
                record.setAuthcode("1");
                personnelArtisanMapper.updateByExampleSelective(record, example);

                userMsg.setType(Integer.valueOf(type));
                userMsg.setUid(lists.get(0).getArtisanid());
                userMsg.setPassword(pwd);
                userMsg.setUser(user);
                userMsg.setUserName(lists.get(0).getArtisanname());
                userMsg.setHeadImgUrl(lists.get(0).getDefault1());

            }


        }else{
            userMsg.setState(0);
        }
        return userMsg;
    }

    /**
     * 退出登录
     * @param id
     * @param type
     * @return
     */
    public int logOut(Integer id, String type){
        int count = 0;
        if("0".equals(type)){
            PersonnelStaff record = new PersonnelStaff();
            record.setId(id);
            record.setAuthcode("0");
            count = personnelStaffMapper.updateByPrimaryKeySelective(record);

        }else if("1".equals(type)) {
            PersonnelArtisan record = new PersonnelArtisan();
            record.setArtisanid(id);
            record.setAuthcode("0");
            count = personnelArtisanMapper.updateByPrimaryKeySelective(record);
        }
        return count;
    }

    /**
     * 找回密码 / 设置密码
     */
    public int retrieve(String user, String pwd, String type){
        int count = 0;
        if("0".equals(type)){
            PersonnelStaffExample example = new PersonnelStaffExample();
            example.createCriteria().andEmailEqualTo(user);
            example.or().andStaffaccountEqualTo(user);

            PersonnelStaff record = new PersonnelStaff();
            record.setPassword(pwd);
            count = personnelStaffMapper.updateByExampleSelective(record,example);


        }else if("1".equals(type)){
            PersonnelArtisanExample example = new PersonnelArtisanExample();
            example.createCriteria().andAccountEqualTo(user);
            example.or().andEmailEqualTo(user);

            PersonnelArtisan record = new PersonnelArtisan();
            record.setPassword(pwd);
            count = personnelArtisanMapper.updateByExampleSelective(record,example);

        }
        return count;
    }

    /**
     * email是否存在
     */
    public int emaliNotNull(String email, String type){
        int count = 0;
        if("0".equals(type)){
            PersonnelStaffExample example = new PersonnelStaffExample();
            example.createCriteria().andEmailEqualTo(email);

            List<PersonnelStaff> lists = personnelStaffMapper.selectByExample(example);
            count = lists.size();

        }else if("1".equals(type)){
            PersonnelArtisanExample example = new PersonnelArtisanExample();
            example.or().andEmailEqualTo(email);
            List<PersonnelArtisan> lists = personnelArtisanMapper.selectByExample(example);
            count = lists.size();
        }
        return count;
    }


}
