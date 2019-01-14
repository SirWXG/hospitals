package com.bank.controller;

import com.bank.dubbo.empService;
import com.bank.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/emps")
public class EmpController {
  @Autowired
  private empService emps;

  @RequestMapping("/select")
  @ResponseBody
    public List<Emp> getEmp(){
      Map<String,Object> map=new HashMap<>();
      HttpServletRequest request=((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
      HttpSession session = request.getSession();
      //预先存入1主要进行测试
      session.setAttribute("empBankId",1);
      Object empBankId = session.getAttribute("empBankId");
      map.put("empBankId",empBankId);
      List<Emp> all = emps.getAll(map);
      return emps.getAll(map);
  }



}
