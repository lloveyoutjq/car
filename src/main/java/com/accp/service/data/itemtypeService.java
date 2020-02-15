package com.accp.service.data;

import com.accp.domain.DataMaintain;
import com.accp.mapper.DataMaintainMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class itemtypeService {

    @Autowired(required = false)
    DataMaintainMapper dataMaintainMapper;

    public List<DataMaintain> selectDataaMaintain(){
        List<DataMaintain> list = dataMaintainMapper.selectByExample(null);
        DataMaintain parentPerms = new DataMaintain();
        parentPerms.setId(0);
        recursionPerm(parentPerms, list);
        System.out.println(parentPerms);
        return parentPerms.getChildren();

    }

    public int  insertDataaMaintain(DataMaintain dataMaintain){
        int count=dataMaintainMapper.insert(dataMaintain);
        return  count;
    }

    public int deleteDataaMaintain(Integer id){
        int count=dataMaintainMapper.deleteByPrimaryKey(id);
        return  count;
    }

    public int updateaMaintain(DataMaintain dataMaintain){
        return dataMaintainMapper.updateByPrimaryKey(dataMaintain);
    }

    /**
     * 递归层次关系
     * @param parentPerms
     * @param list
     */
    private void recursionPerm(DataMaintain parentPerms,List<DataMaintain> list){
        for(DataMaintain perm : list){
            if(perm.getId() == parentPerms.getId()){

                Map map = new HashMap();

                perm.setMaintainname(perm.getMaintainname());

                DataMaintain newPerms = perm;
                parentPerms.getChildren().add(newPerms);
                recursionPerm(newPerms,list);
            }
        }
    }

}
