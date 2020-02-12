package com.accp.service.service;

import com.accp.domain.ClientCarinfo;
import com.accp.domain.ClientCarinfoExample;
import com.accp.mapper.ClientCarinfoMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class CarArchivesService {
    @Autowired(required = false)
    ClientCarinfoMapper clientCarinfoMapper;

    /**
     * 添加车
     * @param clientCarinfo
     * @return
     */
    public int addCar(ClientCarinfo clientCarinfo){
        return clientCarinfoMapper.insertSelective(clientCarinfo);
    }

    /**
     * 删除车
     * @param id
     * @return
     */
    public int deleteCar(Integer id){
        return clientCarinfoMapper.deleteByPrimaryKey(id);
    }

    /**
     * 修改车
     * @param clientCarinfo
     * @return
     */
    public int updateCar(ClientCarinfo clientCarinfo){
        return clientCarinfoMapper.updateByPrimaryKeySelective(clientCarinfo);
    }

    /**
     * 查询车
     * @return
     */
    public PageInfo<ClientCarinfo> selectCar(Integer clientId,Integer index, Integer size){
        Page<ClientCarinfo> page = PageHelper.startPage(index,size);
        ClientCarinfoExample example = new ClientCarinfoExample();
        example.createCriteria().andClientidEqualTo(clientId);
        clientCarinfoMapper.selectByExample(example);
        return page.toPageInfo();
    }

}
