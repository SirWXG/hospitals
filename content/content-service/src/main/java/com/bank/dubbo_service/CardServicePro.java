package com.bank.dubbo_service;

import com.bank.dao.CardMapper;
import com.bank.dubbo.cardService;
import com.bank.pojo.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class CardServicePro implements cardService {
    @Autowired
    private CardMapper cardMapper;
    /**
     * 查看用户的所有或单个银行卡
     * @param map 放入用户ID或者
     * @return
     */
    @Override
    public List<Card> getCard(Map<String, Object> map) {
        return cardMapper.selectByCond(map);
    }
    /**
     * 增加用户的一个银行卡
     * @param card
     * @return int 验证是否增加成功
     */
    @Override
    public int addCard(Card card) {
        int flag =cardMapper.addCard(card);
        return flag;
    }

    /**
     * 更新银行卡
     *
     * @param card
     * @return int 验证是否更新成功
     */
    @Override
    public int updateCard(Card card) {
        return 0;
    }

    /**
     * 删除用户的一个银行卡
     *
     * @param cardid
     * @return int 验证是否删除成功
     */
    @Override
    public int deleteCard(Integer cardid) {
        return 0;
    }

    @Override
    public List<Card> selectAllCard() {
        List<Card> list = cardMapper.selectAllCard();
        return list;
    }
}
