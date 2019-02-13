package com.hospital.pojo;

import java.io.Serializable;

public class MenuAndEmp implements Serializable {

    private String menuName;
    private String menuUrl;
    private String empName;
    private String empUrl;
    private Integer empId;
    private Integer orderNum;

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getEmpUrl() {
        return empUrl;
    }

    public void setEmpUrl(String empUrl) {
        this.empUrl = empUrl;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
