package com.hospital.controller;


import com.hospital.dubbo.EmpService;
import com.hospital.pojo.Emp;
import com.hospital.utils.Coding2utf8;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping(value = "/selectEmp")
    public String selectEmp(@RequestParam(name = "empId")Integer empId,
            @RequestParam(name = "deptName")String deptName, Model model){
        List<Emp> list = empService.selectEmpByDept(empId);
        deptName = Coding2utf8.getString(deptName);
        model.addAttribute("emp",list);
        model.addAttribute("deptName",deptName);
        return "empInfo";
    }
}
