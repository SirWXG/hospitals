package com.bank.controller;

import com.bank.dubbo.dictService;
import com.bank.pojo.Dict;
import com.bank.utils.Data2layui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DictController {
@Autowired
private dictService dict;

    /**
     * @auther
     * @return
     */
    @GetMapping("/select")
    public Data2layui get(){
        Data2layui data =new Data2layui();
        List<Dict> list=dict.getAll();
        data.setData(list);
        return data;
    }


}
