package com.accp.service.home;

import com.accp.domain.PersonnelArtisan;
import com.accp.domain.PersonnelArtisanExample;
import com.accp.domain.PersonnelStaff;
import com.accp.domain.PersonnelStaffExample;
import com.accp.entity.HomeUserList;
import com.accp.mapper.PersonnelArtisanMapper;
import com.accp.mapper.PersonnelStaffMapper;
import java.text.SimpleDateFormat;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class HomeUserService
{
    @Autowired(required=false)
    PersonnelStaffMapper personnelStaffMapper;
    @Autowired(required=false)
    PersonnelArtisanMapper personnelArtisanMapper;

    public List<HomeUserList> getUserList()
    {
        List<HomeUserList> homeUserLists = new ArrayList();

        PersonnelStaffExample personnelStaffExample = new PersonnelStaffExample();
        personnelStaffExample.setOrderByClause(" pastCodeDate desc limit 0,10");
        List<PersonnelStaff> list1 = personnelStaffMapper.selectByExample(personnelStaffExample);
        for (PersonnelStaff item : list1)
        {
            HomeUserList homeUserList= new HomeUserList();
            homeUserList.setId(item.getId().intValue());
            homeUserList.setName(item.getStaffname());
            homeUserList.setPastCodeDate(item.getPastcodedate());
            homeUserList.setState(item.getAuthcode());
            homeUserList.setType("员工");
            homeUserLists.add(homeUserList);
        }
        PersonnelArtisanExample personnelArtisanExample = new PersonnelArtisanExample();
        personnelStaffExample.setOrderByClause(" pastCodeDate desc limit 0,10");
        List<PersonnelArtisan> list2 = personnelArtisanMapper.selectByExample(personnelArtisanExample);
        for (PersonnelArtisan item : list2)
        {
            HomeUserList homeUserList = new HomeUserList();
            homeUserList.setId(item.getArtisanid().intValue());
            homeUserList.setName(item.getArtisanname());
            homeUserList.setPastCodeDate(item.getPastcodedate());
            homeUserList.setState(item.getAuthcode());
            homeUserList.setType("技工");
            homeUserLists.add(homeUserList);
        }
        ListSort(homeUserLists);

        List<HomeUserList> newHomeUserLists = new ArrayList();
        for(int i= 0 ; i < 7 ; i++){
            newHomeUserLists.add(homeUserLists.get(i));
        }
        return newHomeUserLists;
    }

    private static void ListSort(List<HomeUserList> list)
    {
        //排序方法
        Collections.sort(list, new Comparator<HomeUserList>() {
            public int compare(HomeUserList o1, HomeUserList o2) {
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    // format.format(o1.getTime()) 表示 date转string类型 如果是string类型就不要转换了
                    Date dt1 = format.parse(format.format(o1.getPastCodeDate()));
                    Date dt2 = format.parse(format.format(o2.getPastCodeDate()));
                    // 这是由大向小排序   如果要由小向大转换比较符号就可以
                    if (dt1.getTime() < dt2.getTime()) {
                        return 1;
                    } else if (dt1.getTime() > dt2.getTime()) {
                        return -1;
                    } else {
                        return 0;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return 0;
            }

        });
    }

    public Map<String, Object> getUserOnLine(){
        List<PersonnelStaff> lists1 = personnelStaffMapper.selectByExample(null);
        List<PersonnelArtisan> lists2 = personnelArtisanMapper.selectByExample(null);
        int count = 0;
        for(PersonnelStaff item : lists1){
            if(!"0".equals(item.getAuthcode())){
                count ++;
            }
        }

        for(PersonnelArtisan item : lists2){
            if(!"0".equals(item.getAuthcode())){
                count ++;
            }
        }
        Map<String,Object> map = new HashMap<>();
        map.put("count",count);
        map.put("sum",lists1.size() + lists2.size());
        return map;
    }


}

