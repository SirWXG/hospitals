package com.bank.dao;

import com.bank.pojo.Streamline;
import com.bank.pojo.StreamlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StreamlineMapper {
    long countByExample(StreamlineExample example);

    int deleteByExample(StreamlineExample example);

    int deleteByPrimaryKey(Integer streamlineId);

    int insert(Streamline record);

    int insertSelective(Streamline record);

    List<Streamline> selectByExample(StreamlineExample example);

    Streamline selectByPrimaryKey(Integer streamlineId);

    int updateByExampleSelective(@Param("record") Streamline record, @Param("example") StreamlineExample example);

    int updateByExample(@Param("record") Streamline record, @Param("example") StreamlineExample example);

    int updateByPrimaryKeySelective(Streamline record);

    int updateByPrimaryKey(Streamline record);
}