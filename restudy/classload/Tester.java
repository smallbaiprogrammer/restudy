package com.company.restudy.classload;
class fath {
    static {
        System.out.println("fath类被初始化");
    }
    public static void show(){
        System.out.println("fath类该静态方法被调用");
    }
}
public class Tester extends fath {
    public final static int a = 2*3;
    public final static double b = 2*(Math.random()*100)+1;
    static {
        System.out.println("tester类被初始化");
    }
}
class test{
    public static void main(String[] args) {
        Tester.show();
    }
}
