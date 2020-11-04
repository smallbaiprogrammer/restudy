package com.company.restudy.Date;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        Date date1 = new Date(date.getTime()-(24*60*60*1000));
        System.out.println(date1);
        System.out.println(date.after(date1));
        System.out.println(date.before(date1));
        System.out.println(date.compareTo(date1));
        System.out.println(new Date(0));
    }
}
