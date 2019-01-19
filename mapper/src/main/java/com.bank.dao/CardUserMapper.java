package com.bank.dao;

import com.bank.pojo.CardUser;

import java.util.Map;


public interface CardUserMapper {
    CardUser selectAllCard(Map<String,Object> map);
}
