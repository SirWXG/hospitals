package com.hospital.pojo;

import java.io.Serializable;
import java.util.Date;

public class Emp implements Serializable {

    private Integer id;
    private String empId;
    private String empName;
    private String empPass;
    private Date hiredate;
    private Integer rolerId;
    private Integer deptId;
    private String empInfo;
    private String empImg;
    private Integer empMaxorder;
    private Integer orderNum;

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getEmpPass() {
        return empPass;
    }

    public void setEmpPass(String empPass) {
        this.empPass = empPass;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Integer getRolerId() {
        return rolerId;
    }

    public void setRolerId(Integer rolerId) {
        this.rolerId = rolerId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getEmpInfo() {
        return empInfo;
    }

    public void setEmpInfo(String empInfo) {
        this.empInfo = empInfo;
    }

    public String getEmpImg() {
        return empImg;
    }

    public void setEmpImg(String empImg) {
        this.empImg = empImg;
    }

    public Integer getEmpMaxorder() {
        return empMaxorder;
    }

    public void setEmpMaxorder(Integer empMaxorder) {
        this.empMaxorder = empMaxorder;
    }
}
