package com.company.java.多线程;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    // 重入锁
     private Lock lock = new ReentrantLock();
     private String[] strs = {"A","b","","",""};
     private int count=2;
    public void add(String value){
        lock.lock();
        try{
            strs[count]=value;
            count++;
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public String[] getStrs(){
        return strs;
    }

    public static void main(String[] args) throws InterruptedException {
        LockDemo demo = new LockDemo();
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                demo.add("ss");
            }
        };
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                demo.add("bb");
            }
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(Arrays.toString(demo.getStrs()));
    }
}
