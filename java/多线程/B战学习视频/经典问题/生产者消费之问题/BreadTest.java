package com.company.java.多线程.B战学习视频.经典问题.生产者消费之问题;

public class BreadTest {
    public static void main(String[] args) {
        BreadCon breadCon = new BreadCon();
        Product product = new Product(breadCon);
        Consume consume = new Consume(breadCon);
        Thread thread1 = new Thread(product,"做");
        Thread thread2 = new Thread(consume,"吃");
        thread1.start();
        thread2.start();
    }
}
