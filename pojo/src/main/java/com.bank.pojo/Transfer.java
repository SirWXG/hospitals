package com.bank.pojo;

import java.util.Date;

public class Transfer {
    private Integer transferId;

    private String transferOut;

    private Integer transferAmount;

    private Date transferDate;

    private String transferIn;

    private String transferInName;

    private String transferInfo;

    private String transferStatus;

    private String transferOther;

    public Integer getTransferId() {
        return transferId;
    }

    public void setTransferId(Integer transferId) {
        this.transferId = transferId;
    }

    public String getTransferOut() {
        return transferOut;
    }

    public void setTransferOut(String transferOut) {
        this.transferOut = transferOut == null ? null : transferOut.trim();
    }

    public Integer getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(Integer transferAmount) {
        this.transferAmount = transferAmount;
    }

    public Date getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(Date transferDate) {
        this.transferDate = transferDate;
    }

    public String getTransferIn() {
        return transferIn;
    }

    public void setTransferIn(String transferIn) {
        this.transferIn = transferIn == null ? null : transferIn.trim();
    }

    public String getTransferInName() {
        return transferInName;
    }

    public void setTransferInName(String transferInName) {
        this.transferInName = transferInName == null ? null : transferInName.trim();
    }

    public String getTransferInfo() {
        return transferInfo;
    }

    public void setTransferInfo(String transferInfo) {
        this.transferInfo = transferInfo == null ? null : transferInfo.trim();
    }

    public String getTransferStatus() {
        return transferStatus;
    }

    public void setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus == null ? null : transferStatus.trim();
    }

    public String getTransferOther() {
        return transferOther;
    }

    public void setTransferOther(String transferOther) {
        this.transferOther = transferOther == null ? null : transferOther.trim();
    }
}