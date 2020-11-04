package com.company.restudy.math;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        double d1 = 10.1;
        double d2 = 9.9;
        double ans = d1 - d2;
        System.out.println(ans);
        BigDecimal bigDecimal = new BigDecimal("10.1");
        BigDecimal bigDecimal1= new BigDecimal("9.9");
        System.out.println(bigDecimal.subtract(bigDecimal1));
    }
}
