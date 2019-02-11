package com.hospital.controller;

import com.hospital.dubbo.MedicineService;
import com.hospital.pojo.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/medicine")
public class MedicineController {
    @Autowired
    private MedicineService medicinePro;

    @RequestMapping("/all")
    @ResponseBody
    public List<Medicine> getAll(){
        Map<String,Object> map = new HashMap<>();
       List<Medicine> list= medicinePro.getAllMedicine(map);
        System.out.println(list);
return list;
    }
}
