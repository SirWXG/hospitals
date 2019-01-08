package com.bank.pojo;

import java.util.Date;

public class Customer {
    private Integer customerId;

    private String customerName;

    private String realName;

    private String customerIdentity;

    private String customerAddress;

    private String customerPhone;

    private String customerPassword;

    private String customerSex;

    private Date customerBirth;

    private Integer customerCredit;

    private String customerOther1;

    private String customerOther2;

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
}