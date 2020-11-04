package com.company.java.多线程;

import javafx.beans.property.Property;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteDemo {
    // 实例化一个读写锁
    private ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
    // 获取该读写锁的读锁
    private ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
    // 获取写锁
    private ReentrantReadWriteLock.WriteLock writeLock  = reentrantReadWriteLock.writeLock();
    private ReentrantLock lock = new ReentrantLock();
    private String value;
    public String getValue(){
        //
        //readLock.lock();
        lock.lock();
        try{
            try {
                Thread.sleep(100);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("读取");
            return this.value;
        }finally {
           // readLock.unlock();
            lock.unlock();
        }
    }
    public void setValue(String value){
        //writeLock.lock();
        lock.lock();
        try{
            try{
                Thread.sleep(100);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("写入"+value);
            this.value=value;
        }finally {
           // writeLock.unlock();
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReadWriteDemo readWriteDemo = new ReadWriteDemo();
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        Runnable read = new Runnable() {
            @Override
            public void run() {
                readWriteDemo.getValue();
            }
        };
        Runnable write = new Runnable() {
            @Override
            public void run() {
                readWriteDemo.setValue("hello world");
            }
        };
        long timeStart = System.currentTimeMillis();
        for (int i=0;i<2;i++){
            executorService.submit(write);
        }
        for (int i=0;i<18;i++){
            executorService.submit(read);
        }

        executorService.shutdown();
        while (!executorService.isTerminated()){}
        long endTime = System.currentTimeMillis();
        System.out.println("互斥锁"+(endTime-timeStart));
        Set<Integer> set = new CopyOnWriteArraySet<>();
        set = new ConcurrentSkipListSet<>();
        List<Integer> list = new CopyOnWriteArrayList<>();
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        Queue<Integer> queue1 = new ConcurrentLinkedDeque<>();
        //Queue<Integer> queue2 = new ArrayBlockingQueue<>();
        Queue<Integer> queue3 = new LinkedBlockingDeque<>();

        //相当于 HashMap
        Map<Integer,Integer> map = new ConcurrentHashMap<>();
        //  相当于sortedMap
        map = new ConcurrentSkipListMap<>();
        map = new Hashtable<>();

    }
}
