package com.bank.pojo;

import java.util.Date;

public class Consume {
    private Integer consumeId;

    private String cardId;

    private Float consumeAmount;

    private Date consumeDate;

    private String consumeReceipt;

    private String consumeOther1;

    private String consumeOther2;

    public Integer getConsumeId() {
        return consumeId;
    }

    public void setConsumeId(Integer consumeId) {
        this.consumeId = consumeId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public Float getConsumeAmount() {
        return consumeAmount;
    }

    public void setConsumeAmount(Float consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    public Date getConsumeDate() {
        return consumeDate;
    }

    public void setConsumeDate(Date consumeDate) {
        this.consumeDate = consumeDate;
    }

    public String getConsumeReceipt() {
        return consumeReceipt;
    }

    public void setConsumeReceipt(String consumeReceipt) {
        this.consumeReceipt = consumeReceipt == null ? null : consumeReceipt.trim();
    }

    public String getConsumeOther1() {
        return consumeOther1;
    }

    public void setConsumeOther1(String consumeOther1) {
        this.consumeOther1 = consumeOther1 == null ? null : consumeOther1.trim();
    }

    public String getConsumeOther2() {
        return consumeOther2;
    }

    public void setConsumeOther2(String consumeOther2) {
        this.consumeOther2 = consumeOther2 == null ? null : consumeOther2.trim();
    }
}