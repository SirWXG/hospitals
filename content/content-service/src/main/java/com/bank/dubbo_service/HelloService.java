package com.bank.dubbo_service;


import com.bank.dubbo.Hello;
import org.springframework.stereotype.Service;

import java.io.Serializable;


@Service
public class HelloService implements Hello, Serializable {

    @Override
    public String hllow(String name) {
        return "hellow"+name;
    }
}
