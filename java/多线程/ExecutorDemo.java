package com.company.java.多线程;

import java.util.concurrent.*;

public class ExecutorDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建线程池
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> integerFuture=executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum=0;
                for (int i=1;i<100;i++){
                    sum+=i;
                    Thread.sleep(10);
                }
                return sum;
            }
        });
        System.out.println(integerFuture.get());
        executorService.shutdown();
    }
}
