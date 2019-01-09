package com.bank.pojo;

import java.io.Serializable;

public class Card implements Serializable {
    private Integer cardId;

    private String cardPassword;

    private Integer customerId;

    private Float cardBalance;

    private String cardStatus;

    private Integer cardFail;

    private String cardPhone;

    private Integer cardBankId;

    private String cardOther;

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getCardPassword() {
        return cardPassword;
    }

    public void setCardPassword(String cardPassword) {
        this.cardPassword = cardPassword == null ? null : cardPassword.trim();
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Float getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(Float cardBalance) {
        this.cardBalance = cardBalance;
    }

    public String getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus == null ? null : cardStatus.trim();
    }

    public Integer getCardFail() {
        return cardFail;
    }

    public void setCardFail(Integer cardFail) {
        this.cardFail = cardFail;
    }

    public String getCardPhone() {
        return cardPhone;
    }

    public void setCardPhone(String cardPhone) {
        this.cardPhone = cardPhone == null ? null : cardPhone.trim();
    }

    public Integer getCardBankId() {
        return cardBankId;
    }

    public void setCardBankId(Integer cardBankId) {
        this.cardBankId = cardBankId;
    }

    public String getCardOther() {
        return cardOther;
    }

    public void setCardOther(String cardOther) {
        this.cardOther = cardOther == null ? null : cardOther.trim();
    }
}