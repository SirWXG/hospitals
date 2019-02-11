package com.hospital.controller;

import com.hospital.dubbo.DeptService;
import com.hospital.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/selectAllDept",method = RequestMethod.GET)
    public String getAllDept(Model model){
        List<Dept> list = deptService.selectAllDept();
        System.out.println(list.get(0).getDeptName());
        model.addAttribute("dept",list);
        return "order";
    }
}
