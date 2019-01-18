package com.bank.dubbo;

import com.bank.pojo.CardUser;

import java.util.List;

public interface CardUserService {
    List<CardUser> selectAllCard();
}
