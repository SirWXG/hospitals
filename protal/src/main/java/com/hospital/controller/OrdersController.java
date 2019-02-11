package com.hospital.controller;


import com.hospital.dubbo.EmpService;
import com.hospital.dubbo.OrdersService;
import com.hospital.pojo.Orders;
import com.hospital.utils.CardId;
import com.hospital.utils.Coding2utf8;
import com.hospital.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
@RequestMapping(value = "/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @Autowired
    private EmpService empService;

    /*thymleaf返回结果*/
    @RequestMapping(value = "/addOrders")
    public String addOrders(@RequestParam(name = "empId")String empName,@RequestParam(name="deptName")String deptName,Model model){
        Orders orders = new Orders();
        empName = Coding2utf8.getString(empName);
        deptName = Coding2utf8.getString(deptName);
        orders.setEmpName(empName);
        orders.setOrderDeptId(deptName);
        model.addAttribute("orders",orders);
        return "orderInfo";
    }

    @RequestMapping(value = "/addOrder",method = RequestMethod.POST)
    public String add(Orders orders){
        Msg msg = new Msg();
        orders.setOrderId(CardId.getCardId());
        Date date = new Date();
        empService.updateNum(orders.getEmpName());
        orders.setOrderDate(date);
        orders.setOrderStatus(1);
        ordersService.addOrders(orders);
        return "redirect:/dept/selectAllDept";
    }
}
