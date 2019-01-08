package com.bank.pojo;

import java.util.Date;

public class Withdraw {
    private Integer withdrawId;

    private String cardId;

    private Float withdrawAmount;

    private Date withdrawDate;

    private Integer withdrawBankId;

    private String withdrawOther;

    public Integer getWithdrawId() {
        return withdrawId;
    }

    public void setWithdrawId(Integer withdrawId) {
        this.withdrawId = withdrawId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public Float getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(Float withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public Date getWithdrawDate() {
        return withdrawDate;
    }

    public void setWithdrawDate(Date withdrawDate) {
        this.withdrawDate = withdrawDate;
    }

    public Integer getWithdrawBankId() {
        return withdrawBankId;
    }

    public void setWithdrawBankId(Integer withdrawBankId) {
        this.withdrawBankId = withdrawBankId;
    }

    public String getWithdrawOther() {
        return withdrawOther;
    }

    public void setWithdrawOther(String withdrawOther) {
        this.withdrawOther = withdrawOther == null ? null : withdrawOther.trim();
    }
}