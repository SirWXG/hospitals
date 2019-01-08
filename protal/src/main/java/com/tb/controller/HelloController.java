package com.tb.controller;

import com.tb.dubbo.Hello;
import com.tb.dubbo.ItestService;
import com.tb.pojo.Test;
import com.tb.utils.Utf8;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 何龙
 * @create 2019-01-08 11:36
 */
@RestController
public class HelloController {
    @Autowired
    private Hello hello;
    @GetMapping("/hello")
    public String h(@RequestParam("name")String name){
        return hello.hllow(Utf8.getString(name));
    }


    @Autowired
    private ItestService itestService;
    @GetMapping("/test")
    public List<Test> getAll(){
        return itestService.getAll();
    }

    @GetMapping("/name")
    public List<Test> getOne(@RequestParam("name")String name){
        return itestService.getOne(Utf8.getString(name));
    }

}
