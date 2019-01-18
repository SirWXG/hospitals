package com.bank.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable {
    private Integer customerId;

    private String customerName;

    private String realName;

    private String customerIdentity;

    private String customerAddress;

    private String customerPhone;

    private String customerPassword;

    private String customerSex;

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date customerBirth;

    private Integer customerCredit;

    private String customerOther1;

    private String customerOther2;

    private String customerStatus;

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getCustomerIdentity() {
        return customerIdentity;
    }

    public void setCustomerIdentity(String customerIdentity) {
        this.customerIdentity = customerIdentity == null ? null : customerIdentity.trim();
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress == null ? null : customerAddress.trim();
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword == null ? null : customerPassword.trim();
    }

    public String getCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(String customerSex) {
        this.customerSex = customerSex == null ? null : customerSex.trim();
    }

    public Date getCustomerBirth() {
        return customerBirth;
    }

    public void setCustomerBirth(Date customerBirth) {
        this.customerBirth = customerBirth;
    }

    public Integer getCustomerCredit() {
        return customerCredit;
    }

    public void setCustomerCredit(Integer customerCredit) {
        this.customerCredit = customerCredit;
    }

    public String getCustomerOther1() {
        return customerOther1;
    }

    public void setCustomerOther1(String customerOther1) {
        this.customerOther1 = customerOther1 == null ? null : customerOther1.trim();
    }

    public String getCustomerOther2() {
        return customerOther2;
    }

    public void setCustomerOther2(String customerOther2) {
        this.customerOther2 = customerOther2 == null ? null : customerOther2.trim();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", realName='" + realName + '\'' +
                ", customerIdentity='" + customerIdentity + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerPassword='" + customerPassword + '\'' +
                ", customerSex='" + customerSex + '\'' +
                ", customerBirth=" + customerBirth +
                ", customerCredit=" + customerCredit +
                ", customerOther1='" + customerOther1 + '\'' +
                ", customerOther2='" + customerOther2 + '\'' +
                ", customerStatus='" + customerStatus + '\'' +
                '}';
    }
}