package com.accp.mapper;

import com.accp.domain.DataIncomebrackets;
import com.accp.domain.DataIncomebracketsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataIncomebracketsMapper {
    int countByExample(DataIncomebracketsExample example);

    int deleteByExample(DataIncomebracketsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataIncomebrackets record);

    int insertSelective(DataIncomebrackets record);

    List<DataIncomebrackets> selectByExample(DataIncomebracketsExample example);

    DataIncomebrackets selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataIncomebrackets record, @Param("example") DataIncomebracketsExample example);

    int updateByExample(@Param("record") DataIncomebrackets record, @Param("example") DataIncomebracketsExample example);

    int updateByPrimaryKeySelective(DataIncomebrackets record);

    int updateByPrimaryKey(DataIncomebrackets record);
}