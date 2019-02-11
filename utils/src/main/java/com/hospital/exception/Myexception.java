package com.hospital.exception;

import java.io.Serializable;

public class Myexception extends RuntimeException implements Serializable {
    public Myexception(String info){
        super(info);
    }
    public  Myexception(){}
}
