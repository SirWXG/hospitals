package com.hospital.utils;

import java.io.UnsupportedEncodingException;


public class Coding2utf8 {
    public static String getString(String filePath) {
        try {
            return new String(filePath.getBytes("ISO-8859-1"), "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }
}
