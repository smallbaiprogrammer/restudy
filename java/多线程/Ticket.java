package com.company.java.多线程;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {
    private  int count = 1000;
    private Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            lock.lock();
            try {
            if (count<=0){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"买了第"+count+"张票");
            count--;
            }finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i=0;i<5;i++){
            executorService.submit(ticket);
        }
        executorService.shutdown();
    }
}
