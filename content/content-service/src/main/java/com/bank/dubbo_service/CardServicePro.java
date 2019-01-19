package com.bank.dubbo_service;

import com.bank.dao.CardMapper;
import com.bank.dao.TransferMapper;
import com.bank.dao.WithdrawMapper;
import com.bank.dubbo.cardService;
import com.bank.exception.Myexception;
import com.bank.pojo.Card;
import com.bank.pojo.Transfer;
import com.bank.pojo.TransferPojo;
import com.bank.pojo.Withdraw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CardServicePro implements cardService {
    @Autowired
    private CardMapper cardMapper;
    @Autowired
    private TransferMapper transferMapper;
    @Autowired
    private WithdrawMapper withdrawMapper;

    /**
     * 查看用户的所有或单个银行卡
     *
     * @param map 放入用户ID或者
     * @return
     */
    @Override
    public List<Card> getCard(Map<String, Object> map) {
        return cardMapper.selectByCond(map);
    }

    /**
     * 增加用户的一个银行卡
     *
     * @param card
     * @return int 验证是否增加成功
     */
    @Override
    public int addCard(Card card) {
        int flag = cardMapper.addCard(card);
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
        String status = card.getCardStatus();
        if (status != null && card.getCardOther() != null) {
            Withdraw with = new Withdraw();
            with.setCardId(card.getCardId());
            with.setWithdrawAmount(Float.valueOf(card.getCardOther()));
            if ("in".equals(status)) {
                with.setWithdrawOther("存款");
            } else if ("out".equals(status)) {
                with.setWithdrawOther("取款");
            }
            withdrawMapper.insert(with);
            card.setCardStatus(null);
        }
        int res = cardMapper.updateByPrimaryKeySelective(card);
        if (res == 0) {
            try {
                throw new Myexception("卡信息更新异常");
            } catch (Myexception myexception) {
                myexception.printStackTrace();
            } finally {
                return res;
            }
        }
        return res;
    }

    /**
     * 删除用户的一个银行卡
     *
     * @param cardid
     * @return int 验证是否删除成功
     */
    @Override
    public int deleteCard(Integer cardid) {
        return cardMapper.deleteByPrimaryKey(cardid);
    }

    /**
     * 查询所有的银行卡号
     *
     * @return
     */
    @Override
    public List<Card> getCardId() {
        return cardMapper.selectCardId();
    }

    @Override
    public int updateCardStatus(Map<String, Object> map) {
        int flag = cardMapper.updateCardStatus(map);
        return flag;
    }

    /**
     * 用户进行转账操作
     *
     * @param transferPojo
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public String transfer(TransferPojo transferPojo) throws Myexception {
        String str = "";
        Map<String, Object> map = new HashMap<>();
        map.put("cardId", transferPojo.getOutCard());
        List<Card> list = cardMapper.selectByCond(map);
        if (list.size() < 1)
            return "系统发生异常";
        Card outCard = list.get(0);
        if (outCard.getCardBalance() <= transferPojo.getMoney())
            return "账户余额不足";
        Card card1 = new Card();//临时修改银行卡信息的对象
        card1.setCardId(outCard.getCardId());
        card1.setCardBalance(outCard.getCardBalance() - transferPojo.getMoney());
        int out = cardMapper.updateByPrimaryKeySelective(card1);
        map.put("cardId", transferPojo.getInCard());
        List<Card> list2 = cardMapper.selectByCond(map);

            if (list2.size() != 1 || !list2.get(0).getCustomer().getRealName().equals(transferPojo.getInName())) {
                throw new Myexception("收款人信息有误");
            }
            Card inCard = list2.get(0);
            card1.setCardId(inCard.getCardId());
            card1.setCardBalance(inCard.getCardBalance() + transferPojo.getMoney());
            int in = cardMapper.updateByPrimaryKeySelective(card1);
            if (in != 1 || out != 1) {
                throw new Myexception("转账失败");
            }

        Transfer outTransfer = new Transfer();//转账记录
        outTransfer.setTransferOut(transferPojo.getOutCard());
        outTransfer.setTransferAmount(transferPojo.getMoney());
        outTransfer.setTransferIn(transferPojo.getInCard());
        outTransfer.setTransferInfo(transferPojo.getInfo());
        outTransfer.setTransferInName(transferPojo.getInName());
        outTransfer.setTransferStatus("finish");
        transferMapper.insert(outTransfer);
        return "转账成功";
    }
}
