package com.hospital.pojo;

import java.io.Serializable;

public class Cottoms implements Serializable {
    private String cottomsId;

    private String orderId;

    private String empId;

    private String patientId;

    private String patientAge;

    private String result;

    public String getCottomsId() {
        return cottomsId;
    }

    public void setCottomsId(String cottomsId) {
        this.cottomsId = cottomsId == null ? null : cottomsId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge == null ? null : patientAge.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }
}