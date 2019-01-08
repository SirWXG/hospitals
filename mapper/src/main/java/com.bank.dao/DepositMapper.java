package com.bank.dao;

import com.bank.pojo.Deposit;
import com.bank.pojo.DepositExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepositMapper {
    long countByExample(DepositExample example);

    int deleteByExample(DepositExample example);

    int deleteByPrimaryKey(Integer depositId);

    int insert(Deposit record);

    int insertSelective(Deposit record);

    List<Deposit> selectByExample(DepositExample example);

    Deposit selectByPrimaryKey(Integer depositId);

    int updateByExampleSelective(@Param("record") Deposit record, @Param("example") DepositExample example);

    int updateByExample(@Param("record") Deposit record, @Param("example") DepositExample example);

    int updateByPrimaryKeySelective(Deposit record);

    int updateByPrimaryKey(Deposit record);
}