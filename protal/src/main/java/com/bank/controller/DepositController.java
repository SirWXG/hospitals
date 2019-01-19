package com.bank.controller;

import com.bank.dubbo.depositService;
import com.bank.pojo.Deposit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/deposit")
public class DepositController {
    @Autowired
    private depositService deposits;
    //增加
    @RequestMapping("/add")
    @ResponseBody
    public int addDeposit(Deposit deposit){
       return  deposits.addDeposit(deposit);
    }
    //查询
    @RequestMapping("/select")
    @ResponseBody
    public List<Deposit> getDeposit(@RequestParam(name = "depositId",defaultValue = "")String depositid,
                                    @RequestParam(name = "customerId",defaultValue = "")String customertId){
        Map<String ,Object> map =new HashMap<>();
        if(depositid.trim().length()>0){
            map.put("depositId",depositid);
        }
        if(customertId.trim().length()>0){
            map.put("customertId",customertId);
        }
       return  deposits.getAll(map);
    }
    //修改
    @RequestMapping("/update")
    @ResponseBody
    public int updateDeposit(Deposit deposit){
        return  deposits.updateDeposit(deposit);
    }
}
