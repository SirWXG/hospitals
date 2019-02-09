package com.hospital.pojo;

import java.io.Serializable;

public class Roler implements Serializable {
    private Integer rolerId;

    private String rolerName;

    public Integer getRolerId() {
        return rolerId;
    }

    public void setRolerId(Integer rolerId) {
        this.rolerId = rolerId;
    }

    public String getRolerName() {
        return rolerName;
    }

    public void setRolerName(String rolerName) {
        this.rolerName = rolerName == null ? null : rolerName.trim();
    }
}