package com.company.java.多线程;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo2 {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(6);
        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i=1;i<=30;i++){
                    try {
                        queue.put(i);
                        System.out.println(Thread.currentThread().getName()+"生产了第"+i+"块面包");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread1.setName("生产者");
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=30;i++){
                    try {
                        queue.take();
                        System.out.println(Thread.currentThread().getName()+"消费了第"+i+"块面包");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }            }
        });
        thread2.setName("消费者");
        thread1.start();
        thread2.start();
    }
}
