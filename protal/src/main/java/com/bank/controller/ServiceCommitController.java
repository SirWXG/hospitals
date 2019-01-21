package com.bank.controller;

import com.bank.dubbo.ServiceCommitService;
import com.bank.pojo.ServiceCommit;
import com.bank.utils.Msg;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping(value = "/serviceCommit")
public class ServiceCommitController {

    @Autowired
    private ServiceCommitService commitService;

    //新增业务请求
    @PostMapping(value = "/addService")
    public Msg addServiceCommit(ServiceCommit serviceCommit){
        Msg msg = new Msg();
//        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
//        HttpSession session = request.getSession();
//        if(session.getAttribute("user")==null){
//            msg.setCode(0);
//            msg.setMsg("尚未登陆，请重新登陆");
//        }
        System.out.println(serviceCommit.getServiceCard());
        int flag = commitService.insert(serviceCommit);
        if(flag<1){
            msg.setCode(1);
            msg.setMsg("参数传递错误,请重新传入");
        }else{
            msg.setCode(0);
            msg.setMsg("");
        }
        return msg;
    }

    @GetMapping(value = "/selectAllService")
    public Msg selectAllService(@RequestParam(name = "status",defaultValue = "1")Integer status,@RequestParam(name = "page",defaultValue = "1")Integer page,
                                @RequestParam(name = "limit",defaultValue = "10")Integer limit){
        Msg msg = new Msg();
        List<ServiceCommit> list =commitService.selectAllByStatus(status);
        int count = list.size();
        msg.setCount(count);
        PageHelper.startPage(page,limit);
        List<ServiceCommit> lists = commitService.selectAllByStatus(status);
        PageInfo<ServiceCommit> pages = new PageInfo<>(lists);
        List<ServiceCommit> slist =pages.getList();
        msg.setMsg("");
        msg.setCode(0);
        msg.setData(slist);
        return  msg;
    }

    @PostMapping(value = "/disposeService")
    public Msg disposeService(ServiceCommit serviceCommit){
        Msg msg = new Msg();
        int flag = commitService.updateService(serviceCommit);
        if(flag<1){
            msg.setCode(1);
            msg.setMsg("请求错误");
            return msg;
        }
        msg.setMsg("请求成功");
        msg.setCode(0);
        return msg;
    }

    @GetMapping(value = "/selectServiceCommit")
    public Msg selectServiceCommit(@RequestParam(name = "serviceCustomer",defaultValue = "sdasdas")String serviceCustomer,
                                   @RequestParam(name="page")Integer page,
                                   @RequestParam(name="limit")Integer limit){
        List<ServiceCommit> list = commitService.selectServiceCommit(serviceCustomer);
        Msg msg = new Msg();
        int count = list.size();
        msg.setCount(count);
        PageHelper.startPage(page,limit);
        List<ServiceCommit> lists = commitService.selectServiceCommit(serviceCustomer);
        PageInfo<ServiceCommit> pages = new PageInfo<>(lists);
        List<ServiceCommit> slist =pages.getList();
        msg.setMsg("");
        msg.setCode(0);
        msg.setData(slist);
        return  msg;
    }
}
