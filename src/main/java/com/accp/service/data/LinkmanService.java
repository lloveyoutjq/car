package com.accp.service.data;

import com.accp.domain.DataLinkman;
import com.accp.mapper.DataLinkmanMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LinkmanService {
    @Autowired(required = false)
    DataLinkmanMapper dataLinkmanMapper;

    public PageInfo<DataLinkman> selectDataLinkman(Integer index, Integer limit, List<Integer> ids){
        Page<DataLinkman> page = PageHelper.startPage(index,limit);
        DataLinkman personnelStaff = new DataLinkman();
        /*ids.add(1);
        ids.add(2);*/
        personnelStaff.setIds(ids);
        dataLinkmanMapper.selectDataLinkman(personnelStaff);
        return page.toPageInfo();
    }



    public int  insertDataLinkman(DataLinkman dataLinkman){
        int count=dataLinkmanMapper.insert(dataLinkman);
        return  count;
    }

    public int deleteDataLinkman(Integer id){
        int count=dataLinkmanMapper.deleteByPrimaryKey(id);
        return  count;
    }

    public int updateLinkman(DataLinkman dataLinkman){
        return dataLinkmanMapper.updateByPrimaryKey(dataLinkman);
    }
}
