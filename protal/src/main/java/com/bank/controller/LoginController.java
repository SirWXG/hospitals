package com.bank.controller;

import com.bank.dubbo.empService;
import com.bank.pojo.Emp;
import com.bank.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private empService service;

    @RequestMapping(value = "/doLogin",method = RequestMethod.GET)
    public String doLogin(@RequestParam(name = "username")String username,
                          @RequestParam(name="password")String password) throws UnsupportedEncodingException {
        username = new String(username.getBytes("iso-8859-1"),"utf-8");
        Msg msg = new Msg();
        Map<String,Object> map = new HashMap<>();
        map.put("empName",username);
        map.put("empPassword",password);
        List<Emp> list = service.checkLogin(map);
        if(list.size()<1){
           return "redirect:/login.jsp";
        }
        return "redirect:/bank.jsp";
    }
}
