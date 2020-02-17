package com.accp.mapper;

import com.accp.domain.MaintainRescue;
import com.accp.domain.MaintainRescueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MaintainRescueMapper {
    int countByExample(MaintainRescueExample example);

    int deleteByExample(MaintainRescueExample example);

    int deleteByPrimaryKey(String number);

    int insert(MaintainRescue record);

    int insertSelective(MaintainRescue record);

    List<MaintainRescue> selectByExample(MaintainRescueExample example);

    MaintainRescue selectByPrimaryKey(String number);

    int updateByExampleSelective(@Param("record") MaintainRescue record, @Param("example") MaintainRescueExample example);

    int updateByExample(@Param("record") MaintainRescue record, @Param("example") MaintainRescueExample example);

    int updateByPrimaryKeySelective(MaintainRescue record);

    int updateByPrimaryKey(MaintainRescue record);
}