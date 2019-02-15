package com.hospital.controller;

import com.hospital.dubbo.EmpInfoService;
import com.hospital.dubbo.EmpService;
import com.hospital.dubbo.MenuService;
import com.hospital.pojo.EmpInfo;
import com.hospital.pojo.MenuAndEmp;
import com.hospital.utils.Coding2utf8;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private EmpService empService;

    @Autowired
    private MenuService menuService;

    @Autowired
    private EmpInfoService empInfoService;

    @RequestMapping(value = "/doLogin",method = RequestMethod.POST)
    public String doLogin(@RequestParam(name = "empName")String empName,
                          @RequestParam(name = "password")String password, Model model){
        Map<String,Object> map = new HashMap<>();
        map.put("name", Coding2utf8.getString(empName));
        map.put("password",password);
        EmpInfo emp = empInfoService.checkLogin(empName);
        System.out.println(emp);
        List<MenuAndEmp> list = menuService.selectMenuByEmp(emp.getEmpId());
        model.addAttribute("emp",emp);
        model.addAttribute("menu",list);
        return "before_view";
    }
}
