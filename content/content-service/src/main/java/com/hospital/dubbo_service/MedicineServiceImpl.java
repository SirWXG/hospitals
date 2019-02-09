package com.hospital.dubbo_service;

import com.hospital.dao.MedicineMapper;
import com.hospital.dubbo.MedicineService;
import com.hospital.pojo.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MedicineServiceImpl implements MedicineService {
    @Autowired
    private MedicineMapper medicineMapper;
    @Override
    public List<Medicine> getAllMedicine(Map<String, Object> map) {
        System.out.println("start");
        List<Medicine> list =medicineMapper.selectByCond(map);
        System.out.println("finish");
        return list;
    }
}
