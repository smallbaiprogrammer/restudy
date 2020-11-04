package com.company.java.多线程;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSafe {
    public static void main(String[] args) {
        List<String> arraylist = new ArrayList<>();
       List<String> synlist = Collections.synchronizedList(arraylist);
        for (int i=0;i<20;i++){
            int temp = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j=0;j<10;j++){
                        synlist.add(Thread.currentThread().getName()+temp);
                        System.out.println(Thread.currentThread().getName()+"=============="+synlist.toString()+"=====================");

                    }
                }
            }).start();
        }
    }
}
