package com.bank.pojo;

import java.io.Serializable;
import java.util.Date;

public class Streamline implements Serializable{
   private Integer streamlineId;

    private String streamlineName;

    private Integer checkEmpid;

    private Date streamlineDate;

    private String streamlineInfo;

    private String streamlineResult;

    private Integer lastId;

    private Integer nextEmpid;

    private String streamlineOther;
    private  Emp emp;

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    public Integer getStreamlineId() {
        return streamlineId;
    }

    public void setStreamlineId(Integer streamlineId) {
        this.streamlineId = streamlineId;
    }

    public String getStreamlineName() {
        return streamlineName;
    }

    public void setStreamlineName(String streamlineName) {
        this.streamlineName = streamlineName == null ? null : streamlineName.trim();
    }

    public Integer getCheckEmpid() {
        return checkEmpid;
    }

    public void setCheckEmpid(Integer checkEmpid) {
        this.checkEmpid = checkEmpid;
    }

    public Date getStreamlineDate() {
        return streamlineDate;
    }

    public void setStreamlineDate(Date streamlineDate) {
        this.streamlineDate = streamlineDate;
    }

    public String getStreamlineInfo() {
        return streamlineInfo;
    }

    public void setStreamlineInfo(String streamlineInfo) {
        this.streamlineInfo = streamlineInfo == null ? null : streamlineInfo.trim();
    }

    public String getStreamlineResult() {
        return streamlineResult;
    }

    public void setStreamlineResult(String streamlineResult) {
        this.streamlineResult = streamlineResult == null ? null : streamlineResult.trim();
    }

    public Integer getLastId() {
        return lastId;
    }

    public void setLastId(Integer lastId) {
        this.lastId = lastId;
    }

    public Integer getNextEmpid() {
        return nextEmpid;
    }

    public void setNextEmpid(Integer nextEmpid) {
        this.nextEmpid = nextEmpid;
    }

    public String getStreamlineOther() {
        return streamlineOther;
    }

    public void setStreamlineOther(String streamlineOther) {
        this.streamlineOther = streamlineOther == null ? null : streamlineOther.trim();
    }
}