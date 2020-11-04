package com.company.restudy.Interface;

public class Outer {
    private String name = "张三";
    private int age = 30;
    public void show(){
         String address =  "深圳";
        class Inner{
            private String addres  = "北京";
            private String phone = "110";
            public void show(){
                System.out.println(name);
                System.out.println(age);
                System.out.println(addres);
                System.out.println(phone);
            }
        }
    }

}
