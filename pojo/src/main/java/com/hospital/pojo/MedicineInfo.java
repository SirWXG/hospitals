package com.hospital.pojo;

import java.io.Serializable;

public class MedicineInfo implements Serializable {
    private String medicineInfoId;

    private String medicineId;

    private Integer medicineNum;

    private String medicineOrderId;

    private String medicineDosage;

    public String getMedicineInfoId() {
        return medicineInfoId;
    }

    public void setMedicineInfoId(String medicineInfoId) {
        this.medicineInfoId = medicineInfoId == null ? null : medicineInfoId.trim();
    }

    public String getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId == null ? null : medicineId.trim();
    }

    public Integer getMedicineNum() {
        return medicineNum;
    }

    public void setMedicineNum(Integer medicineNum) {
        this.medicineNum = medicineNum;
    }

    public String getMedicineOrderId() {
        return medicineOrderId;
    }

    public void setMedicineOrderId(String medicineOrderId) {
        this.medicineOrderId = medicineOrderId == null ? null : medicineOrderId.trim();
    }

    public String getMedicineDosage() {
        return medicineDosage;
    }

    public void setMedicineDosage(String medicineDosage) {
        this.medicineDosage = medicineDosage == null ? null : medicineDosage.trim();
    }
}