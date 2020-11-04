package com.company.restudy.classload;

public class ClassA {
    public static void main(String[] args) throws ClassNotFoundException {
        // 获取类加载器
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        Class<?> objclass = loader.loadClass("com.company.restudy.classload.ClassB");
        System.out.println("after load classb");
        objclass = Class.forName("com.company.restudy.classload.ClassB");
    }
}
 class ClassB {
    static {
        System.out.println("now init classb");
    }
}