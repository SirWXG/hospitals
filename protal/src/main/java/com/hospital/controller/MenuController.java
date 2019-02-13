package com.hospital.controller;

import com.hospital.dubbo.MenuService;
import com.hospital.pojo.MenuAndEmp;
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
@RequestMapping(value = "/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "/getMenu",method = RequestMethod.GET)
    public String getMenu(@RequestParam(name = "empId")String empId,Model model){
        List<MenuAndEmp> list = menuService.selectMenuByEmp(empId);
        Map<String,Object> map = new HashMap<>();
        String empName = list.get(0).getEmpName();
        String empUrl = list.get(0).getEmpUrl();
        Integer orderNum = list.get(0).getOrderNum();
        map.put("empName",empName);
        map.put("empUrl",empUrl);
        map.put("orderNum",orderNum);
        model.addAttribute("menu",list);
        model.addAttribute("emp",map);
        return "before_view";
    }
}
