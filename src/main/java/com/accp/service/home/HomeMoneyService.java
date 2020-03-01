package com.accp.service.home;

import com.accp.domain.SystemHomeMoney;
import com.accp.mapper.SystemHomeMoneyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional
@Service
public class HomeMoneyService {
    @Autowired(required=false)
    SystemHomeMoneyMapper systemHomeMoneyMapper;
    @Autowired(required=false)
    HomeBoot homeBoot;

    public Map<String, Object> getCountAndSumMoney(){
        double count = 0;
        double sum = 0;
        List<SystemHomeMoney> list1= systemHomeMoneyMapper.selectByDateMoney(1,homeBoot.getPastDate(0));
        for(SystemHomeMoney item : list1){
            count += item.getMoney().doubleValue();
        }

        List<SystemHomeMoney> list2 = systemHomeMoneyMapper.selectByExample(null);
        for(SystemHomeMoney item : list2){
            sum += item.getMoney().doubleValue();
        }

        Map<String,Object> map = new HashMap<>();
        map.put("count",count);
        map.put("sum",sum);
        return map;
    }

}
