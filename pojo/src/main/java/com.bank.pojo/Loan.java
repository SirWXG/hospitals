package com.bank.pojo;

import java.util.Date;

public class Loan {
    private Integer loanId;

    private String customerId;

    private Integer loanAmount;

    private String loanCardId;

    private Integer loanTerm;

    private Integer loanRate;

    private String loanGuarantor;

    private String loanMortgage;

    private Float mortgageValue;

    private Integer accountId;

    private String loanBankId;

    private Date loanDate;

    private String loanProcess;

    private String loanOther;

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public Integer getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Integer loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getLoanCardId() {
        return loanCardId;
    }

    public void setLoanCardId(String loanCardId) {
        this.loanCardId = loanCardId == null ? null : loanCardId.trim();
    }

    public Integer getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(Integer loanTerm) {
        this.loanTerm = loanTerm;
    }

    public Integer getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(Integer loanRate) {
        this.loanRate = loanRate;
    }

    public String getLoanGuarantor() {
        return loanGuarantor;
    }

    public void setLoanGuarantor(String loanGuarantor) {
        this.loanGuarantor = loanGuarantor == null ? null : loanGuarantor.trim();
    }

    public String getLoanMortgage() {
        return loanMortgage;
    }

    public void setLoanMortgage(String loanMortgage) {
        this.loanMortgage = loanMortgage == null ? null : loanMortgage.trim();
    }

    public Float getMortgageValue() {
        return mortgageValue;
    }

    public void setMortgageValue(Float mortgageValue) {
        this.mortgageValue = mortgageValue;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getLoanBankId() {
        return loanBankId;
    }

    public void setLoanBankId(String loanBankId) {
        this.loanBankId = loanBankId == null ? null : loanBankId.trim();
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public String getLoanProcess() {
        return loanProcess;
    }

    public void setLoanProcess(String loanProcess) {
        this.loanProcess = loanProcess == null ? null : loanProcess.trim();
    }

    public String getLoanOther() {
        return loanOther;
    }

    public void setLoanOther(String loanOther) {
        this.loanOther = loanOther == null ? null : loanOther.trim();
    }
}