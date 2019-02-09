package com.bank.controller;


import com.bank.dubbo.EmpService;
import com.bank.pojo.Emp;
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
    public String selectEmp(@RequestParam(name = "empId")Integer empId, Model model){
        List<Emp> list = empService.selectEmpByDept(empId);
        model.addAttribute("emp",list);
        return "empInfo";
    }
}
