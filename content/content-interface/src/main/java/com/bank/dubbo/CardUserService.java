package com.bank.dubbo;

import com.bank.pojo.CardUser;

import java.util.Map;


public interface CardUserService {
    CardUser selectAllCard(Map<String,Object> map);
}
