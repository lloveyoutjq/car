package com.accp.mapper;

import com.accp.domain.MaintainEwitem;
import com.accp.domain.MaintainEwitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MaintainEwitemMapper {
    int countByExample(MaintainEwitemExample example);

    int deleteByExample(MaintainEwitemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MaintainEwitem record);

    int insertSelective(MaintainEwitem record);

    List<MaintainEwitem> selectByExample(MaintainEwitemExample example);

    MaintainEwitem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MaintainEwitem record, @Param("example") MaintainEwitemExample example);

    int updateByExample(@Param("record") MaintainEwitem record, @Param("example") MaintainEwitemExample example);

    int updateByPrimaryKeySelective(MaintainEwitem record);

    int updateByPrimaryKey(MaintainEwitem record);
}