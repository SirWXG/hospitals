package com.bank.controller;

import com.bank.dubbo.dictService;
import com.bank.pojo.Dict;
import com.bank.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/dict")
public class DictController {
@Autowired
private dictService dict;

    /**
     * @auther
     * @return
     */
    @GetMapping("/select")
    public Msg get(){
        Msg data =new Msg();
        List<Dict> list=dict.getAll();
        data.setData(list);
        return data;
    }
    @RequestMapping(value = "/getAll")
    public List<Dict> getAll(@RequestParam(name = "dictCategory",defaultValue = "")String dictCategory ){
        return dict.getAll();
    }



}
