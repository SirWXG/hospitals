package com.bank.dao;

import com.bank.pojo.Withdraw;
import com.bank.pojo.WithdrawExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WithdrawMapper {
    long countByExample(WithdrawExample example);

    int deleteByExample(WithdrawExample example);

    int deleteByPrimaryKey(Integer withdrawId);

    int insert(Withdraw record);

    int insertSelective(Withdraw record);

    List<Withdraw> selectByExample(WithdrawExample example);

    Withdraw selectByPrimaryKey(Integer withdrawId);

    int updateByExampleSelective(@Param("record") Withdraw record, @Param("example") WithdrawExample example);

    int updateByExample(@Param("record") Withdraw record, @Param("example") WithdrawExample example);

    int updateByPrimaryKeySelective(Withdraw record);

    int updateByPrimaryKey(Withdraw record);
}