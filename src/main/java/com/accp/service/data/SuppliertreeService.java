package com.accp.service.data;

import com.accp.domain.DataSupplierTree;
import com.accp.mapper.DataSupplierTreeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class SuppliertreeService {
     @Autowired(required = false)
    DataSupplierTreeMapper dataSupplierTreeMapper;

    public List<DataSupplierTree> selectDataSupplierTree(){
        List<DataSupplierTree> list = dataSupplierTreeMapper.selectByExample(null);
        DataSupplierTree parentPerms = new DataSupplierTree();
        parentPerms.setId(0);
        recursionPerm(parentPerms, list);
        System.out.println(parentPerms);
        return parentPerms.getChildren();

    }

    public int  insertDataSupplierTree(DataSupplierTree dataSupplierTree){
        int count=dataSupplierTreeMapper.insertSelective(dataSupplierTree);
        return  count;
    }

    public int deleteDataSupplierTree(Integer id){
        int count=dataSupplierTreeMapper.deleteByPrimaryKey(id);
        return  count;
    }


    public int updateSupplierTree(DataSupplierTree dataSupplierTree){
        return dataSupplierTreeMapper.updateByPrimaryKeySelective(dataSupplierTree);
    }

    /**
     * 递归层次关系
     * @param parentPerms
     * @param list
     */

    private void recursionPerm(DataSupplierTree parentPerms,List<DataSupplierTree> list){
        for(DataSupplierTree perm : list){
            if(perm.getParentid() == parentPerms.getId()){

                Map map = new HashMap();

                perm.setTitle(perm.getName());

                DataSupplierTree newPerms = perm;
                parentPerms.getChildren().add(newPerms);
                recursionPerm(newPerms,list);
            }
        }
    }

}
