package com.bank.pojo;

public class TransferPojo {
    //转出卡的卡号
    private String outCard;
    //转账金额
    private float money;
    //转入银行卡号
    private String inCard;
    //转入卡持有人姓名
    private String inName;
    //备注信息
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getOutCard() {
        return outCard;
    }

    public void setOutCard(String outCard) {
        this.outCard = outCard;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public String getInName() {
        return inName;
    }

    public void setInName(String inName) {
        this.inName = inName;
    }

    public String getInCard() {
        return inCard;
    }

    public void setInCard(String inCard) {
        this.inCard = inCard;
    }


}
