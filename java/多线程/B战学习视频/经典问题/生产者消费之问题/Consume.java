package com.company.java.多线程.B战学习视频.经典问题.生产者消费之问题;

public class Consume implements Runnable {
    private BreadCon breadCon;
    public Consume(BreadCon breadCon){
        this.breadCon =breadCon;
    }
    @Override
    public void run() {
        for (int i=0;i<30;i++){
            breadCon.output();
        }
    }
}
