package com.bank.pojo;

public class Bank {
    private Integer bankId;

    private String bankName;

    private String bankAddress;

    private String bankTel;

    private Double bankLoanLimit;

    private String bankOther1;

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress == null ? null : bankAddress.trim();
    }

    public String getBankTel() {
        return bankTel;
    }

    public void setBankTel(String bankTel) {
        this.bankTel = bankTel == null ? null : bankTel.trim();
    }

    public Double getBankLoanLimit() {
        return bankLoanLimit;
    }

    public void setBankLoanLimit(Double bankLoanLimit) {
        this.bankLoanLimit = bankLoanLimit;
    }

    public String getBankOther1() {
        return bankOther1;
    }

    public void setBankOther1(String bankOther1) {
        this.bankOther1 = bankOther1 == null ? null : bankOther1.trim();
    }
}