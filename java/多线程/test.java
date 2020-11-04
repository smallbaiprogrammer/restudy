package com.company.java.多线程;

import jdk.nashorn.internal.ir.Block;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * 线程池的最高接口 Executor 线程池的执行excute
 *  ExecuteService 线程池的管理接口
 *      ThreadPoolExecutor
 *           ScheduledTheadPoolExecutor
 *  线程池的创建 Executors 创建线程池的工具类
 *  （1） 创建固定线程个数的线程池
 *  （2） 创建缓存线程池，个数由任务的多少决定
 *  （3） 创建单线程池
 *  （4） 创建调度线程池 调度:周期、定时执行
 */
public class test {
    public static void main(String[] args) {
        // 创建一个线程数量为4 的线程池
        //ExecutorService executorService = Executors.newFixedThreadPool(4);
        ExecutorService executorService = Executors.newCachedThreadPool();
        // 单个线程池,只有一个线程的线程池
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        // 创建一个调度线程池
        ExecutorService executorService2 = Executors.newScheduledThreadPool(5);
        // 向线程池提交任务
        Runnable runnable = new Runnable() {
            private int ticket = 100;
            @Override
            public void run() {
                while (true){
                    if (ticket<=0){
                        break;
                    }
                    System.out.println(Thread.currentThread().getName()+"买了第"+ticket+"张票");
                    ticket--;
                }
            }
        };
        // 将任务提交给线程池
        for (int i=0;i<10;i++){
            executorService.submit(runnable);
        }
        // 执行完成，关闭线程池
        // 这个命令不会等待线程结束，会暂停执行所有的线程
        //executorService.shutdownNow();
        // 等待线程中的所以任务执行完毕，才会关闭线程池
        executorService.shutdown();
    }
}
