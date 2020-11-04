package com.company.restudy.classload;
class Father{
    static  int a = 1;
    static {
        System.out.println("init father");
    }

}
class son extends Father{
    static {
        System.out.println("init son");
    }
    static int b = 2 ;
}
public class InitClass {
    private static Father father;

    static {
        System.out.println("init InitClass");
    }
    // 声明Father 类

    public static void main(String[] args) {

        System.out.println("==========================================");
        father = new Father();
    }
}
