package com.accp.service.completed;

import com.accp.domain.MaintainCompleted;
import com.accp.mapper.MaintainCompletedMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CompletedService {

    @Autowired
    MaintainCompletedMapper maintainCompletedMapper;

    //竣工检测主页面
    public List<MaintainCompleted> completionInspection(String number,String carNumber,String frameNumber,String eligibility){
        return  maintainCompletedMapper.completionInspection("%"+number+"%","%"+carNumber+"%","%"+frameNumber+"%",eligibility);
    }

}
