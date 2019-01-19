package com.bank.controller;

import com.bank.dubbo.dictService;
import com.bank.pojo.Dict;
import com.bank.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/dict")
public class DictController {
    @Autowired
    private dictService dict;

    /**
     * @return
     * @auther
     */
    @GetMapping("/select")
    public Msg get() {
        Msg data = new Msg();
        List<Dict> list=null;
        //list = dict.getAll(new HashMap<String,Object>());
        data.setData(list);
        return data;
    }
//
    @RequestMapping(value = "/getAll")
    @ResponseBody
    public List<Dict> getAll(@RequestParam(name = "dictCategory", defaultValue = "") String dictCategory,
    @RequestParam(name = "dictId", defaultValue = "") String dictId
    ) {
        Map<String, Object> map = new HashMap<>();
        if (dictCategory.trim().length() > 0) {
            map.put("dictCategory", dictCategory);
        }
        if(dictId.trim().length()>0){
            map.put("dictId",dictId);
        }
        return dict.getAll(map);
    }


}
