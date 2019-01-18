package com.bank.dao;

import com.bank.pojo.CardUser;

import java.util.List;

public interface CardUserMapper {
    List<CardUser> selectAllCard();
}
