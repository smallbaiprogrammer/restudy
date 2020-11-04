package com.company.java.多线程;

import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> future1=executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum0=0;
                for (int i=1;i<50;i++){
                    sum0+=i;
                }
                return sum0;
            }
        });
        System.out.println(future1.get());
        Future<Integer> future2 = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum2=0;
                for (int sum=50;sum<100;sum++){
                    sum2+=sum;
                }
                return sum2;
            }
        });
        System.out.println(future2.get());
        System.out.println(future1.get()+future2.get());
        executorService.shutdown();
    }
}
