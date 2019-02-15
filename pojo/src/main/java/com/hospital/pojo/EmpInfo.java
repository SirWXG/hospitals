package com.hospital.pojo;

import java.io.Serializable;

public class EmpInfo implements Serializable {

    private String empId;
    private String empName;
    private String empImg;
    private Integer orderNum;
    private String deptName;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpImg() {
        return empImg;
    }

    public void setEmpImg(String empImg) {
        this.empImg = empImg;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "EmpInfo{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", empImg='" + empImg + '\'' +
                ", orderNum=" + orderNum +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
