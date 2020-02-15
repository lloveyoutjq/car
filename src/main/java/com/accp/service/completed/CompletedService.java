package com.accp.service.completed;

import com.accp.domain.MaintainCompleted;
import com.accp.mapper.MaintainCompletedMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public PageInfo completionInspection(String number, String carNumber, String frameNumber, String eligibility,Integer pages,Integer limit){
        Page page = PageHelper.startPage(pages,limit);
        maintainCompletedMapper.completionInspection("%"+number+"%","%"+carNumber+"%","%"+frameNumber+"%","%"+eligibility+"%");
        return  page.toPageInfo();
    }

    //竣工检验
    public MaintainCompleted selectByPrimaryKey(Integer id){
        return maintainCompletedMapper.selectByPrimaryKey(id);
    }

}
