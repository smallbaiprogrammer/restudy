package com.company.java.多线程.B战学习视频.经典问题.生产者消费之问题;

public class Product implements Runnable {
    private BreadCon b ;
    public Product(BreadCon con){
        this.b=con;
    }
    @Override
    public void run() {
        for (int i=0;i<30;i++){
            b.input(new Bread(i,Thread.currentThread().getName()));
        }
    }
}
