package com.bank.controller;


import com.bank.dubbo.OrdersService;
import com.bank.pojo.Orders;
import com.bank.utils.CardId;
import com.bank.utils.Coding2utf8;
import com.bank.utils.Msg;
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

    /*thymleaf返回结果*/
    @RequestMapping(value = "/addOrders")
    public String addOrders(@RequestParam(name = "empId")String empName,Model model){
        Orders orders = new Orders();
        empName = Coding2utf8.getString(empName);
        orders.setEmpName(empName);
        model.addAttribute("orders",orders);
        return "orderInfo";
    }

    @RequestMapping(value = "/addOrder",method = RequestMethod.POST)
    public String add(Orders orders){
        Msg msg = new Msg();
        orders.setOrderId(CardId.getCardId());
        Date date = new Date();
        orders.setOrderDate(date);
        orders.setOrderStatus(1);
        orders.setOrderDeptId(10);
        int flag = ordersService.addOrders(orders);
        if(flag<1){
            return "";
        }
        return "return";
    }
}
