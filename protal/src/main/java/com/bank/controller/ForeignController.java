package com.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/money")
public class ForeignController {

    @GetMapping(value = "/exchangeMoney")
    public Float exchangeMoney(@RequestParam(name="foreign")Float foreign,
                               @RequestParam(name="money")Float money){
        return foreign/money;
    }
}
