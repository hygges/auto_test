package com.example.autotest.util;

public class MethodUtil {

    public static String demo1(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
