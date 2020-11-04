package com.company.java.多线程;

import javax.swing.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemp {
    public static void main(String[] args) {
        ConcurrentHashMap<String,String> hashMap = new ConcurrentHashMap<>();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                ConcurrentHashMap<String,String> hashMap = new ConcurrentHashMap<>();
                for(int i =0;i<5;i++){
                    hashMap.put("s",i+"");
                }
            }
        });

    }
}
