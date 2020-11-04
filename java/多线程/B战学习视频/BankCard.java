package com.company.java.多线程.B战学习视频;

public class BankCard {
    // 余额
    private double money;
    // 如果有钱为true，没钱就是false
    private boolean flag = false;
    public synchronized void save(double money){
        while (flag){
           try {
               this.wait();
               // 此时该锁进入等待队列，释放锁
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
       this.money+=money;
       System.out.println(Thread.currentThread().getName()+"存了"+money+"元，"+"余额是"+this.money);
       // 修改标记，然后唤醒等待线程
        flag = true;
        this.notifyAll();
    }
    public synchronized void take(double money){
        while (!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.money-=money;
        System.out.println(Thread.currentThread().getName()+"取了"+money+"元，"+"余额是"+this.money);
        // 然后修改标记，唤醒线程
        flag = false;
        this.notifyAll();
    }
}
