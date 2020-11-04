package com.company.java.多线程;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class BlockQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);
        queue.put("aaaaaaa");
        queue.put("bbbbbbbb");
        queue.put("ccccccc");
        queue.put("ddddddd");
        queue.put("eeeeee");
        queue.put("ffffff");
    }
}
