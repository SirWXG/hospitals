package com.bank.controller;

import com.bank.dubbo.cardService;
import com.bank.pojo.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/card")
public class CardController {
    @Autowired
    private cardService card;

    /**
     * 根据条件查询银行卡信息
     * @param customerId
     * @param cardId
     * @return
     */
    @RequestMapping("/select")
    @ResponseBody
    public List<Card> getCard(@RequestParam(name = "customerId", defaultValue = "") String customerId,
                              @RequestParam(name = "cardId", defaultValue = "") String cardId) {
        List<Card> cards = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        if (customerId.trim().length() > 0)
            map.put("customerId", customerId);
        if (cardId.trim().length() > 0)
            map.put("cardId", cardId);
        if (map.size() > 0)
            cards = card.getCard(map);
        return cards;
    }
    //修改银行卡的信息 如余额，密码，状态等
    @RequestMapping("/update")
    public int updateOneCard(Card cards){
        return card.updateCard(cards);
    }
    //进行转账操作



}
