package com.bank.dao;

import com.bank.pojo.ServiceCommit;
import com.bank.pojo.ServiceCommitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceCommitMapper {
    long countByExample(ServiceCommitExample example);

    int deleteByExample(ServiceCommitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ServiceCommit record);

    int insertSelective(ServiceCommit record);

    List<ServiceCommit> selectByExample(ServiceCommitExample example);

    ServiceCommit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ServiceCommit record, @Param("example") ServiceCommitExample example);

    int updateByExample(@Param("record") ServiceCommit record, @Param("example") ServiceCommitExample example);

    int updateByPrimaryKeySelective(ServiceCommit record);

    int updateByPrimaryKey(ServiceCommit record);
}