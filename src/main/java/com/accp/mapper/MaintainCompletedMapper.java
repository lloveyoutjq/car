package com.accp.mapper;

import com.accp.domain.MaintainCompleted;
import com.accp.domain.MaintainCompletedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MaintainCompletedMapper {
    List<MaintainCompleted> completionInspection(@Param("number") String number,@Param("carNumber") String carNumber,@Param("frameNumber") String frameNumber,@Param("eligibility") String eligibility);

    int countByExample(MaintainCompletedExample example);

    int deleteByExample(MaintainCompletedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MaintainCompleted record);

    int insertSelective(MaintainCompleted record);

    List<MaintainCompleted> selectByExample(MaintainCompletedExample example);

    MaintainCompleted selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MaintainCompleted record, @Param("example") MaintainCompletedExample example);

    int updateByExample(@Param("record") MaintainCompleted record, @Param("example") MaintainCompletedExample example);

    int updateByPrimaryKeySelective(MaintainCompleted record);

    int updateByPrimaryKey(MaintainCompleted record);
}