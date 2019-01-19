package com.bank.controller;

import com.bank.dubbo.CardUserService;
import com.bank.dubbo.cardService;
import com.bank.pojo.Card;
import com.bank.pojo.CardUser;
import com.bank.utils.CardId;
import com.bank.utils.Msg;
import com.bank.pojo.TransferPojo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.corba.se.spi.ior.ObjectKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @Autowired
    private CardUserService userService;

    /**
     * 根据条件查询银行卡信息主要用于取款
     * @param customerId
     * @param cardId
     * @return
     */
    @RequestMapping("/select")
    @ResponseBody
    public List<Card> getCard(@RequestParam(name = "customerId", defaultValue = "") String customerId,
                              @RequestParam(name = "cardId", defaultValue = "") String cardId,
                              @RequestParam(name = "cardpass", defaultValue = "") String password) {
        List<Card> cards = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        if (customerId.trim().length() > 0)
            map.put("customerId", customerId);
        if (cardId.trim().length() > 0 && password.trim().length() > 0) {
            map.put("cardId", cardId);
            map.put("cardPass", password);
        }
        if (map.size() > 0)
            cards = card.getCard(map);
        return cards;
    }

    @RequestMapping("/getcard")
    @ResponseBody
    public List<Card> getCard() {

        return card.getCardId();
    }

    //修改银行卡的信息 如余额，密码，状态等
    @RequestMapping("/update")
    @ResponseBody
    public int updateOneCard(Card cards) {
       System.out.println(cards);

        return card.updateCard(cards);
    }

    //进行转账操作

    @RequestMapping(value = "/addCard",method = RequestMethod.POST)
    @ResponseBody
    public int addCard(Card cards){
        cards.setCardId(CardId.getCardId());
        return card.addCard(cards);
    }

    @RequestMapping(value = "/selectCardToId",method = RequestMethod.GET)
    @ResponseBody
    public CardUser selectAllCard(@RequestParam(name="cardIds")String cardId,@RequestParam(name="cardIdentitys")String cardIdentity){

        Map<String,Object> map = new HashMap<>();
        map.put("cardId",cardId);
        map.put("cardIdentity",cardIdentity);
        CardUser list = userService.selectAllCard(map);
        return list;
    }

    @RequestMapping("/transfer")
    public String doTrandfer(TransferPojo transfer) {
        return card.transfer(transfer);
    }

    @RequestMapping(value = "/updateCardStatus",method = RequestMethod.GET)
    @ResponseBody
    public CardUser updateCard(@RequestParam(name="cardIds")String cardId,@RequestParam(name = "cardIdentitys")String cardIdentity,
                             @RequestParam(name="cardStatus")boolean cardStatus){
        String status = "";
        if(cardStatus){
             status = "on";
        }
        Map<String, Object> map = new HashMap<>();
        map.put("cardId",cardId);
        map.put("cardIdentity",cardIdentity);
        map.put("cardStatus",status);
        card.updateCardStatus(map);
        System.out.println(map);
        CardUser user = userService.selectAllCard(map);
        return user;
    }


}
