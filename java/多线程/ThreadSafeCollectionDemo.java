package com.company.java.多线程;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSafeCollectionDemo {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i=0;i<5;i++){
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    for (int j=0;j<10;j++){
                        set.add(Thread.currentThread().getName()+j);
                    }
                }
            });
        }
        executorService.shutdown();
        for (String str:set){
            System.out.println(str);
        }
    }
}
