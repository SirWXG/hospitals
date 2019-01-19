package com.bank.pojo;

import java.io.Serializable;
import java.util.Date;

public class Deposit implements Serializable {
    private Integer depositId;

    private String customerId;

    private Float depositAmount;

    private Integer depositTerm;

    private Float depositRate;

    private Date depositDate;

    private Integer depositBankId;

    private String depositOther;
    private Customer customer;;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getDepositId() {
        return depositId;
    }

    public void setDepositId(Integer depositId) {
        this.depositId = depositId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Float getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(Float depositAmount) {
        this.depositAmount = depositAmount;
    }

    public Integer getDepositTerm() {
        return depositTerm;
    }

    public void setDepositTerm(Integer depositTerm) {
        this.depositTerm = depositTerm;
    }

    public Float getDepositRate() {
        return depositRate;
    }

    public void setDepositRate(Float depositRate) {
        this.depositRate = depositRate;
    }

    public Date getDepositDate() {
        return depositDate;
    }

    public void setDepositDate(Date depositDate) {
        this.depositDate = depositDate;
    }

    public Integer getDepositBankId() {
        return depositBankId;
    }

    public void setDepositBankId(Integer depositBankId) {
        this.depositBankId = depositBankId;
    }

    public String getDepositOther() {
        return depositOther;
    }

    public void setDepositOther(String depositOther) {
        this.depositOther = depositOther == null ? null : depositOther.trim();
    }
}