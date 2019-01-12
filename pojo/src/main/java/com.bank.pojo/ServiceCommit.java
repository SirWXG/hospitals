package com.bank.pojo;

import java.util.Date;

public class ServiceCommit {
    private Integer id;

    private String serviceType;

    private String serviceCustomer;

    private String serviceCard;

    private String serviceUse;

    private String servicePhone;

    private Date serviceDate;

    private String serviceDesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType == null ? null : serviceType.trim();
    }

    public String getServiceCustomer() {
        return serviceCustomer;
    }

    public void setServiceCustomer(String serviceCustomer) {
        this.serviceCustomer = serviceCustomer == null ? null : serviceCustomer.trim();
    }

    public String getServiceCard() {
        return serviceCard;
    }

    public void setServiceCard(String serviceCard) {
        this.serviceCard = serviceCard == null ? null : serviceCard.trim();
    }

    public String getServiceUse() {
        return serviceUse;
    }

    public void setServiceUse(String serviceUse) {
        this.serviceUse = serviceUse == null ? null : serviceUse.trim();
    }

    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone == null ? null : servicePhone.trim();
    }

    public Date getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public String getServiceDesc() {
        return serviceDesc;
    }

    public void setServiceDesc(String serviceDesc) {
        this.serviceDesc = serviceDesc == null ? null : serviceDesc.trim();
    }
}