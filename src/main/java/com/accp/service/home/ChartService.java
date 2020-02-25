package com.accp.service.home;

import com.accp.entity.Charts;
import com.accp.mapper.FrontCashierMapper;
import com.accp.mapper.MaintainRepairMapper;
import com.accp.mapper.MaintainRescueMapper;
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
    FrontCashierMapper frontCashierMapper;
    @Autowired(required=false)
    MaintainRepairMapper maintainRepairMapper;
    @Autowired(required=false)
    MaintainRescueMapper maintainRescueMapper;

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

    /**
     * 收银
     * @return
     */
    public int[] cashierDate(){
        int[] count = new int[7];
        for(int i = 0 ; i < count.length;i++){
            count[i] = frontCashierMapper.selectByDateCashier(homeBoot.getPastDate(i));
        }
        System.out.println(count);
        return count;
    }

    /**
     * 维修
     * @return
     */
    public int[] repairDate(){
        int[] count = new int[7];
        for(int i = 0 ; i < count.length;i++){
            count[i] = maintainRepairMapper.selectByDateRepair(homeBoot.getPastDate(i));
        }
        System.out.println(count);
        return count;
    }

    /**
     * 救援
     * @return
     */
    public int[] rescueDate(){
        int[] count = new int[7];
        for(int i = 0 ; i < count.length;i++){
            count[i] = maintainRescueMapper.selectByDateRescue(homeBoot.getPastDate(i));
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
        /*******************************************************/
        Charts chart1 = new Charts();
        chart1.setName("收银");
        chart1.setType("lime");
        chart1.setStack("总量");
        chart1.setData(Arrays.stream(cashierDate()).boxed().collect(Collectors.toList()));
        Collections.reverse(chart1.getData());

        charts.add(chart1);
        /*******************************************************/
        Charts chart2 = new Charts();
        chart2.setName("维修");
        chart2.setType("lime");
        chart2.setStack("总量");
        chart2.setData(Arrays.stream(repairDate()).boxed().collect(Collectors.toList()));
        Collections.reverse(chart2.getData());

        charts.add(chart2);
        /*******************************************************/
        Charts chart3 = new Charts();
        chart3.setName("救援");
        chart3.setType("lime");
        chart3.setStack("总量");
        chart3.setData(Arrays.stream(rescueDate()).boxed().collect(Collectors.toList()));
        Collections.reverse(chart3.getData());

        charts.add(chart3);
        return charts;
    }

}
