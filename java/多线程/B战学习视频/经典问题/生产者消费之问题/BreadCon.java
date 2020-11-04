package com.company.java.多线程.B战学习视频.经典问题.生产者消费之问题;

public class BreadCon {
    private Bread[] cons = new Bread[6];
    private int len = cons.length;
    private int index = 0;

    public synchronized void input(Bread bread){
        if (index>=len){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        cons[index]=bread;
        System.out.println(Thread.currentThread().getName()+"生产了"+bread.getId()+"");
        index++;
        this.notify();
    }
    public synchronized void output(){
        if (index<=0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        index--;
        System.out.println();
        Bread b = cons[index];
        System.out.println(Thread.currentThread().getName()+"消费了"+b.getId());
        this.notify();
    }
}
