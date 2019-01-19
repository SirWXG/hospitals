package com.bank.dubbo;

import com.bank.pojo.Card;
import com.bank.pojo.TransferPojo;
import com.bank.pojo.CardUser;

import java.util.List;
import java.util.Map;

public interface cardService {
    /**
     * 查看用户的所有或单个银行卡
     * @param map
     * @return
     */
    public List<Card> getCard(Map<String,Object> map);

    /**
     *增加用户的一个银行卡
     * @param card
     * @return int 验证是否增加成功
     */

    public int addCard(Card card);

    /**
     * 更新银行卡
     * @param card
     * @return int 验证是否更新成功
     */
    public int updateCard(Card card);

    /**
     * 删除用户的一个银行卡
     * @param cardid
     * @return int 验证是否删除成功
     */
    public int deleteCard(Integer cardid);

    /**
     * 用户进行转账操作
     * @param transferPojo
     * @return
     */
    String transfer(TransferPojo transferPojo);

    List<Card> getCardId();

    int updateCardStatus(Map<String,Object> map);

}
