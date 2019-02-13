package com.hospital.controller;

import com.hospital.dubbo.MenuService;
import com.hospital.pojo.MenuAndEmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "/getMenu",method = RequestMethod.GET)
    public String getMenu(@RequestParam(name = "empId")String empId,Model model){
        List<MenuAndEmp> list = menuService.selectMenuByEmp(empId);
        String empName = list.get(0).getEmpName();
        String empUrl = list.get(0).getEmpUrl();
        model.addAttribute("empUrl",empUrl);
        model.addAttribute("menu",list);
        model.addAttribute("empName",empName);
        return "before_view";
    }
}
