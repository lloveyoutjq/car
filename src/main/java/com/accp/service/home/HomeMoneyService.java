package com.accp.service.home;

import com.accp.mapper.SystemHomeMoneyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Transactional
@Service
public class HomeMoneyService {
    @Autowired(required=false)
    SystemHomeMoneyMapper systemHomeMoneyMapper;
    @Autowired(required=false)
    HomeBoot homeBoot;

    public Map<String, Object> getCountAndSumMoney(){
        int count = 0;
        int sum = 0;
        count = systemHomeMoneyMapper.selectByDateMoney(1,homeBoot.getPastDate(0)).size();
        sum = systemHomeMoneyMapper.selectByExample(null).size();
        Map<String,Object> map = new HashMap<>();
        map.put("count",count);
        map.put("sum",sum);
        return map;
    }

}
