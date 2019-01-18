package com.bank.dubbo_service;

import com.bank.dao.CardUserMapper;
import com.bank.dubbo.CardUserService;
import com.bank.pojo.CardUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardUserServiceImpl implements CardUserService {

    @Autowired
    private CardUserMapper cardUserMapper;

    @Override
    public List<CardUser> selectAllCard() {
        List<CardUser> list = cardUserMapper.selectAllCard();
        return list;
    }
}
