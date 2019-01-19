package com.bank.utils;

import java.util.List;

public class Msg {
    private List<?> data;
    private int count;
    private int code;
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "data=" + data +
                ", count=" + count +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
