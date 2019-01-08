package com.tb.dubbo_service;


import com.tb.dubbo.Hello;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author 何龙
 * @create 2019-01-07 21:24
 */
@Service
public class HelloService implements Hello, Serializable {

    @Override
    public String hllow(String name) {
        return "hellow"+name;
    }
}
