package com.accp.service.data;

import com.accp.domain.DataItemtype;
import com.accp.mapper.DataItemtypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ItemtypeService {

    @Autowired(required = false)
    DataItemtypeMapper dataItemtypeMapper;

    public List<DataItemtype> selectDataItemtype(){
        List<DataItemtype> list = dataItemtypeMapper.selectByExample(null);
        DataItemtype parentPerms = new DataItemtype();
        parentPerms.setId(0);
        recursionPerm(parentPerms, list);
        System.out.println(parentPerms);
        return parentPerms.getChildren();

    }

    public int  insertDataaItemtype(DataItemtype dataItemtype){
        int count=dataItemtypeMapper.insertSelective(dataItemtype);
        return  count;
    }

    public int deleteDataItemtype(Integer id){
        int count=dataItemtypeMapper.deleteByPrimaryKey(id);
        return  count;
    }


    public int updateItemtype(DataItemtype dataItemtype){
        return dataItemtypeMapper.updateByPrimaryKeySelective(dataItemtype);
    }

    /**
     * 递归层次关系
     * @param parentPerms
     * @param list
     */
    private void recursionPerm(DataItemtype parentPerms,List<DataItemtype> list){
        for(DataItemtype perm : list){
            if(perm.getParentid() == parentPerms.getId()){

                Map map = new HashMap();

                perm.setTitle(perm.getName());

                DataItemtype newPerms = perm;
                parentPerms.getChildren().add(newPerms);
                recursionPerm(newPerms,list);
            }
        }
    }

}
