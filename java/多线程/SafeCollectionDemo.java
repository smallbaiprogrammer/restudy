package com.company.java.多线程;

import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SafeCollectionDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        ExecutorService es = Executors.newFixedThreadPool(5);
        for (int i=0;i<5;i++){
            es.submit(new Runnable() {
                @Override
                public void run() {
                    for (int j=0;j<10;j++){
                        list.add(Thread.currentThread().getName()+"..."+new Random().nextInt(1000));
                    }
                }
            });
        }
        es.shutdown();
        while (!es.isTerminated()){}{}
        System.out.println("元素个数"+list.size());
        for (String str:list){
            System.out.println(str);
        }
    }
}
