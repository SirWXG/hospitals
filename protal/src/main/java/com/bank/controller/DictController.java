package com.bank.controller;

import com.bank.dubbo.dictService;
import com.bank.pojo.Dict;
import com.bank.utils.coding2utf8;
import com.bank.utils.data2layui;
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
    public data2layui get(){
        data2layui data =new data2layui();
        List<Dict> list=dict.getAll();
        data.setData(list);
        return data;
    }


}
