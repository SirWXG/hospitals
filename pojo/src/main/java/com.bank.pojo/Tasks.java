package com.bank.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Tasks implements Serializable {
    private String taskId;

    private Integer taskEmpid;

    private Date taskDate;

    private String taskTitle;

    private String taskInfo;

    private String taskResult;

    private String taskOther;
    private List<Streamline> streamline;
private Emp emp;

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    public List<Streamline> getStreamline() {
        return streamline;
    }

    public void setStreamline(List<Streamline> streamline) {
        this.streamline = streamline;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public Integer getTaskEmpid() {
        return taskEmpid;
    }

    public void setTaskEmpid(Integer taskEmpid) {
        this.taskEmpid = taskEmpid;
    }

    public Date getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(Date taskDate) {
        this.taskDate = taskDate;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle == null ? null : taskTitle.trim();
    }

    public String getTaskInfo() {
        return taskInfo;
    }

    public void setTaskInfo(String taskInfo) {
        this.taskInfo = taskInfo == null ? null : taskInfo.trim();
    }

    public String getTaskResult() {
        return taskResult;
    }

    public void setTaskResult(String taskResult) {
        this.taskResult = taskResult == null ? null : taskResult.trim();
    }

    public String getTaskOther() {
        return taskOther;
    }

    public void setTaskOther(String taskOther) {
        this.taskOther = taskOther == null ? null : taskOther.trim();
    }
}