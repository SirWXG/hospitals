package com.hospital.pojo;

import java.io.Serializable;

public class Patients implements Serializable {
    private String patientIdentity;

    private String patientName;

    private String patientSex;

    private String patientEmpid;

    public String getPatientIdentity() {
        return patientIdentity;
    }

    public void setPatientIdentity(String patientIdentity) {
        this.patientIdentity = patientIdentity == null ? null : patientIdentity.trim();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    public String getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(String patientSex) {
        this.patientSex = patientSex == null ? null : patientSex.trim();
    }

    public String getPatientEmpid() {
        return patientEmpid;
    }

    public void setPatientEmpid(String patientEmpid) {
        this.patientEmpid = patientEmpid == null ? null : patientEmpid.trim();
    }
}