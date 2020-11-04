package com.company.java.多线程;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Demo1 {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        queue.offer("apple");
        queue.offer("origin");
        queue.offer("banana");
        queue.offer("beer");
        Iterator<String> iterable = queue.iterator();
        while (iterable.hasNext()){
            System.out.println(iterable.next());
        }
    }
}
