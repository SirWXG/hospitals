package com.bank.pojo;

import java.io.Serializable;
import java.util.Date;

public class Card  implements Serializable {
    private String cardId;

    private String cardPassword;

    private Integer customerId;

    private Float cardBalance;

    private String cardStatus;

    private Integer cardFail;

    private String cardPhone;

    private Date cardDate;

    private Integer cardBankId;

    private String cardOther;
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardId='" + cardId + '\'' +
                ", cardPassword='" + cardPassword + '\'' +
                ", customerId=" + customerId +
                ", cardBalance=" + cardBalance +
                ", cardStatus='" + cardStatus + '\'' +
                ", cardFail=" + cardFail +
                ", cardPhone='" + cardPhone + '\'' +
                ", cardDate=" + cardDate +
                ", cardBankId=" + cardBankId +
                ", cardOther='" + cardOther + '\'' +
                '}';
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
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

    public Date getCardDate() {
        return cardDate;
    }

    public void setCardDate(Date cardDate) {
        this.cardDate = cardDate;
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