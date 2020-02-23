package com.accp.service.maintenance;

import com.accp.domain.MaintainCompleted;
import com.accp.mapper.MaintainCompletedMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class CompletedService {

    @Autowired
    MaintainCompletedMapper maintainCompletedMapper;

    //竣工检测主页面
    public PageInfo completionInspection(String number, String carNumber, String frameNumber,Integer pages,Integer limit){
        Page page = PageHelper.startPage(pages,limit);
        maintainCompletedMapper.completionInspection("%"+number+"%","%"+carNumber+"%","%"+frameNumber+"%");
        return  page.toPageInfo();
    }

    //竣工检验
    public MaintainCompleted selectByPrimaryKey(Integer id){
        return maintainCompletedMapper.selectByPrimaryKey(id);
    }

    //修改竣工
    public int updateComplete(MaintainCompleted completed){
        return maintainCompletedMapper.updateByPrimaryKeySelective(completed);
    }

    //添加竣工单
    public int insertComplete(MaintainCompleted completed){
        return  maintainCompletedMapper.insertSelective(completed);
    }
}
