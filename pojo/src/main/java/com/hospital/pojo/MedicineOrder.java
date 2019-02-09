package com.hospital.pojo;

import java.io.Serializable;

public class MedicineOrder implements Serializable {
    private String medicineOrderId;

    private String cottomsId;

    public String getMedicineOrderId() {
        return medicineOrderId;
    }

    public void setMedicineOrderId(String medicineOrderId) {
        this.medicineOrderId = medicineOrderId == null ? null : medicineOrderId.trim();
    }

    public String getCottomsId() {
        return cottomsId;
    }

    public void setCottomsId(String cottomsId) {
        this.cottomsId = cottomsId == null ? null : cottomsId.trim();
    }
}