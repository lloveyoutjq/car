package com.accp.service.data;

import com.accp.domain.DataCommoditytype;
import com.accp.mapper.DataCommoditytypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class CommodityTypeService {

    @Autowired(required = false)
    DataCommoditytypeMapper dataCommoditytypeMapper;


    public List<DataCommoditytype> selectDataCommodityType(){
        List<DataCommoditytype> list = dataCommoditytypeMapper.selectByExample(null);
        DataCommoditytype parentPerms = new DataCommoditytype();
        parentPerms.setId(0);
        recursionPerm(parentPerms, list);
        System.out.println(parentPerms);
        return parentPerms.getChildren();

    }

    public int  insertDataCommodityType(DataCommoditytype dataCommoditytype){
        int count=dataCommoditytypeMapper.insert(dataCommoditytype);
        return  count;
    }

    public int deleteDataCommodityType(Integer id){
        int count=dataCommoditytypeMapper.deleteByPrimaryKey(id);
        return  count;
    }

    public int updateCommodityType(DataCommoditytype dataCommoditytype){
        return dataCommoditytypeMapper.updateByPrimaryKeySelective(dataCommoditytype);
    }

    /**
     * 递归层次关系
     * @param parentPerms
     * @param list
     */
    private void recursionPerm(DataCommoditytype parentPerms,List<DataCommoditytype> list){
        for(DataCommoditytype perm : list){
            if(perm.getParentid() == parentPerms.getId()){

                Map map = new HashMap();

                perm.setTitle(perm.getTypename());

                DataCommoditytype newPerms = perm;
                parentPerms.getChildren().add(newPerms);
                recursionPerm(newPerms,list);
            }
        }
    }



}
