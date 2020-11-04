package com.company.restudy.Date;

import java.util.Date;

public class SimpleDateFormat {
    public static void main(String[] args) {
        java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyy年MM月dd日");
        Date date = new Date();
        String s = dateFormat.format(date);
        System.out.println(s);
    }
}
