package com.company.java.多线程.B战学习视频;

import com.company.java.多线程.B战学习视频.BankCard;

public class addMoney implements Runnable {
    private BankCard card;
    public addMoney(BankCard card){
        this.card=card;
    }
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            card.save(1000);
        }
    }
}
