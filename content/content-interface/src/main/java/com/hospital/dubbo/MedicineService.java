package com.hospital.dubbo;

import com.hospital.pojo.Medicine;

import java.util.List;
import java.util.Map;

public interface MedicineService {

    List<Medicine> getAllMedicine(Map<String, Object> map);
}
