package com.accp.service.home;

import com.accp.entity.Charts;
import com.accp.mapper.PersonnelStaffMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Service
public class ChartService {

    @Autowired(required=false)
    PersonnelStaffMapper personnelStaffMapper;
    @Autowired(required=false)
    HomeBoot homeBoot;

    public void money(){

    }
    public int[] departureDate(){
        int[] count = new int[7];
        for(int i = 0 ; i < count.length;i++){
            count[i] = personnelStaffMapper.selectByDateDeparture(homeBoot.getPastDate(i),0).size();
        }
        System.out.println(count);
        return count;
    }

    public List<Charts> charts(){
        List<Charts> charts = new ArrayList<>();
        Charts chart = new Charts();
        chart.setName("离职");
        chart.setType("lime");
        chart.setStack("总量");
        chart.setData(Arrays.stream(departureDate()).boxed().collect(Collectors.toList()));
        Collections.reverse(chart.getData());

        charts.add(chart);
        return charts;
    }

}
