package com.bank.dao;

import com.bank.pojo.Card;
import com.bank.pojo.CardExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CardMapper {
    //查询单个用户的单个或多个卡
    List<Card> selectByCond(Map<String ,Object> map);
    //查询所有的卡号
    List<Card> selectCardId();
    long countByExample(CardExample example);

    int deleteByExample(CardExample example);

    int deleteByPrimaryKey(Integer cardId);

    int insert(Card record);

    int insertSelective(Card record);

    List<Card> selectByExample(CardExample example);

    Card selectByPrimaryKey(Integer cardId);

    int updateByExampleSelective(@Param("record") Card record, @Param("example") CardExample example);

    int updateByExample(@Param("record") Card record, @Param("example") CardExample example);

    int updateByPrimaryKeySelective(Card record);

    int updateByPrimaryKey(Card record);

    int addCard(Card card);

    int updateCardStatus(Map<String,Object> map);

    int updateCardPass(Map<String,Object> map);

}