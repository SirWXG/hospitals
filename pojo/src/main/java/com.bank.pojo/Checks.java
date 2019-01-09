package com.bank.pojo;

import java.io.Serializable;
import java.util.Date;

public class Checks implements Serializable {
    private Integer checkId;

    private Integer bankId;

    private String payCardId;

    private Float checkAmount;

    private Date checkCreate;

    private String receiptName;

    private String receiptCard;

    private String checkUse;

    private String checkOther1;

    public Integer getCheckId() {
        return checkId;
    }

    public void setCheckId(Integer checkId) {
        this.checkId = checkId;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getPayCardId() {
        return payCardId;
    }

    public void setPayCardId(String payCardId) {
        this.payCardId = payCardId == null ? null : payCardId.trim();
    }

    public Float getCheckAmount() {
        return checkAmount;
    }

    public void setCheckAmount(Float checkAmount) {
        this.checkAmount = checkAmount;
    }

    public Date getCheckCreate() {
        return checkCreate;
    }

    public void setCheckCreate(Date checkCreate) {
        this.checkCreate = checkCreate;
    }

    public String getReceiptName() {
        return receiptName;
    }

    public void setReceiptName(String receiptName) {
        this.receiptName = receiptName == null ? null : receiptName.trim();
    }

    public String getReceiptCard() {
        return receiptCard;
    }

    public void setReceiptCard(String receiptCard) {
        this.receiptCard = receiptCard == null ? null : receiptCard.trim();
    }

    public String getCheckUse() {
        return checkUse;
    }

    public void setCheckUse(String checkUse) {
        this.checkUse = checkUse == null ? null : checkUse.trim();
    }

    public String getCheckOther1() {
        return checkOther1;
    }

    public void setCheckOther1(String checkOther1) {
        this.checkOther1 = checkOther1 == null ? null : checkOther1.trim();
    }
}