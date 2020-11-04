package com.company.restudy.Date;

import java.util.Calendar;

public class CalendarTest {
    int x ;


    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime().toLocaleString());
        System.out.println(calendar.getTimeInMillis());
        System.out.println(calendar.get(Calendar.YEAR));
        calendar.set(Calendar.YEAR,2012);
        calendar.add(Calendar.YEAR,555);
        System.out.println(calendar.get(Calendar.YEAR));
    }
}
