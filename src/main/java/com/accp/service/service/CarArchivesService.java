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

import java.util.List;

@Transactional
@Service
public class CarArchivesService {
    @Autowired(required = false)
    ClientCarinfoMapper clientCarinfoMapper;
    @Autowired(required = false)
    MaintainMaintenanceRegistrationMapper maintainMaintenanceRegistrationMapper;

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
        if(clientId != null && clientId != 0){
            example.createCriteria().andClientidEqualTo(clientId);
        }
        clientCarinfoMapper.selectByExample(example);
        return page.toPageInfo();
    }

    /*****************************保养********************************/
    /**
     * 添加保养
     * @param maintainMaintenanceRegistration
     * @return
     */
    public Integer addUpkeep(MaintainMaintenanceRegistration maintainMaintenanceRegistration){
        return maintainMaintenanceRegistrationMapper.insertSelective(maintainMaintenanceRegistration);
    }

    /**
     * 修改保养
     * @param maintainMaintenanceRegistration
     * @return
     */
    public Integer updateUpkeep(MaintainMaintenanceRegistration maintainMaintenanceRegistration){
        return maintainMaintenanceRegistrationMapper.updateByPrimaryKeySelective(maintainMaintenanceRegistration);
    }

    /**
     * 删除保养
     * @param id
     * @return
     */
    public Integer deleteUpkeep(Integer id){
        return maintainMaintenanceRegistrationMapper.deleteByPrimaryKey(id);
    }

    /**
     * 查询保养
     * @param carInfoId
     * @param index
     * @param pageSize
     * @return
     */
    public PageInfo<MaintainMaintenanceRegistration> selectUpkeep(Integer carInfoId, Integer index, Integer pageSize){
        Page<MaintainMaintenanceRegistration> page = PageHelper.startPage(index,pageSize);
        MaintainMaintenanceRegistrationExample example = new MaintainMaintenanceRegistrationExample();
        example.createCriteria().andCarinfoidEqualTo(carInfoId);
        List<MaintainMaintenanceRegistration> lists = maintainMaintenanceRegistrationMapper.selectByExample(example);
        return page.toPageInfo();
    }


}
