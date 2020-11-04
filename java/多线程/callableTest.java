package com.company.java.多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class callableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 用callable来计算 一百的阶乘
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println(Thread.currentThread().getName()+"开始计算");
                int sum=1;
                for (int i=1;i<20;i++){
                    sum*=i;
                    Thread.sleep(100);
                }
                return sum;
            }
        };
        // 将callable实例变为FutureTask实例
        FutureTask<Integer> task = new FutureTask<>(callable);
        Thread thread = new Thread(task);
        thread.start();
        //接受返回值
       Integer sum=task.get();
       System.out.println("结果是"+sum);
    }
}
