package com.hospital.dao;

import com.hospital.pojo.Repertory;
import com.hospital.pojo.RepertoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepertoryMapper {
    long countByExample(RepertoryExample example);

    int deleteByExample(RepertoryExample example);

    int deleteByPrimaryKey(String repertoryId);

    int insert(Repertory record);

    int insertSelective(Repertory record);

    List<Repertory> selectByExample(RepertoryExample example);

    Repertory selectByPrimaryKey(String repertoryId);

    int updateByExampleSelective(@Param("record") Repertory record, @Param("example") RepertoryExample example);

    int updateByExample(@Param("record") Repertory record, @Param("example") RepertoryExample example);

    int updateByPrimaryKeySelective(Repertory record);

    int updateByPrimaryKey(Repertory record);
}