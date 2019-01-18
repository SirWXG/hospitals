package com.bank.controller;

import com.bank.dubbo.CustomerService;
import com.bank.pojo.Customer;
import com.bank.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "/checkCustomer")
    public Msg selectCustomer(Customer customer){
        Msg msg = new Msg();
        List<Customer> list = customerService.selectCustomer(customer);
        if(list.size()<1){
            msg.setCode(1);
            msg.setMsg("无此用户");
        }else{
            msg.setCode(0);
            msg.setMsg("已有此用户");
        }
        return msg;
    }

    @PostMapping(value = "/addCustomer")
    public Msg addCustomer(Customer customer){
        Msg msg = new Msg();
        System.out.println(customer.toString());
        int flag = customerService.addCustomer(customer);
        if(flag<1){
            msg.setMsg("请求错误");
            msg.setCode(1);
        }else{
            msg.setCode(0);
            msg.setMsg("请求成功");
        }
        return msg;
    }
}
