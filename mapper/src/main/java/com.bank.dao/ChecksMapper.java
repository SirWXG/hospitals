package com.bank.dao;

import com.bank.pojo.Checks;
import com.bank.pojo.ChecksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChecksMapper {
    long countByExample(ChecksExample example);

    int deleteByExample(ChecksExample example);

    int deleteByPrimaryKey(Integer checkId);

    int insert(Checks record);

    int insertSelective(Checks record);

    List<Checks> selectByExample(ChecksExample example);

    Checks selectByPrimaryKey(Integer checkId);

    int updateByExampleSelective(@Param("record") Checks record, @Param("example") ChecksExample example);

    int updateByExample(@Param("record") Checks record, @Param("example") ChecksExample example);

    int updateByPrimaryKeySelective(Checks record);

    int updateByPrimaryKey(Checks record);
}