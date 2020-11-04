package com.company.restudy.OfenObject;

public class Test {
    public static void main(String[] args) throws Throwable {
       Integer integer1 = new Integer(100);
       Integer integer2 = new Integer(100);
       System.out.println(integer1==integer2);
       // 返回false 的具体原因


        Integer integer3 = 100;
        Integer integer4 = 100;
        System.out.println(integer3==integer4);
        // 这里为什么变成了true

        Integer integer5 = 200;
        Integer integer6 = 200;
        System.out.println(integer5 == integer6);
        // 这里为什么变成了 false
        Object obj = new Object();

    }
}
