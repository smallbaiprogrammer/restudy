package com.company.java.多线程.B战学习视频;

import com.company.java.多线程.B战学习视频.BankCard;

public class subMoney implements Runnable{
    private BankCard bankCard;
    public subMoney(BankCard bankCard){
        this.bankCard = bankCard;
    }
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            bankCard.take(1000);
        }
    }
}

