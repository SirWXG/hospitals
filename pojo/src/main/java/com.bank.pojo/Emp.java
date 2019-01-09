package com.bank.pojo;

import java.io.Serializable;
import java.util.Date;

public class Emp implements Serializable {
    private Integer empId;

    private Integer roleId;

    private String empName;

    private String empPassword;

    private String empSex;

    private Date empBirth;

    private Date empHiredate;

    private String empIdentity;

    private String empAddress;

    private String empPhone;

    private String empEmail;

    private Float empSalary;

    private Integer empBankId;

    private String empOther1;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getEmpPassword() {
        return empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword == null ? null : empPassword.trim();
    }

    public String getEmpSex() {
        return empSex;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex == null ? null : empSex.trim();
    }

    public Date getEmpBirth() {
        return empBirth;
    }

    public void setEmpBirth(Date empBirth) {
        this.empBirth = empBirth;
    }

    public Date getEmpHiredate() {
        return empHiredate;
    }

    public void setEmpHiredate(Date empHiredate) {
        this.empHiredate = empHiredate;
    }

    public String getEmpIdentity() {
        return empIdentity;
    }

    public void setEmpIdentity(String empIdentity) {
        this.empIdentity = empIdentity == null ? null : empIdentity.trim();
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress == null ? null : empAddress.trim();
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone == null ? null : empPhone.trim();
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail == null ? null : empEmail.trim();
    }

    public Float getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Float empSalary) {
        this.empSalary = empSalary;
    }

    public Integer getEmpBankId() {
        return empBankId;
    }

    public void setEmpBankId(Integer empBankId) {
        this.empBankId = empBankId;
    }

    public String getEmpOther1() {
        return empOther1;
    }

    public void setEmpOther1(String empOther1) {
        this.empOther1 = empOther1 == null ? null : empOther1.trim();
    }
}