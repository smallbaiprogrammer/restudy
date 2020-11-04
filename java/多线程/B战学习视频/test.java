package com.company.java.多线程.B战学习视频;

public class test {
    public static void main(String[] args) {
        // 多存多去还是出现问题，可能进入死锁
        // 而且线程唤醒之后，不需要判断标记，就可以直接取钱了，所以余额会出现负数，所以可以将if判断换成while判断，这样无论哪里中断，线程取钱依然需要判断标记
        BankCard bankCard = new BankCard();
        addMoney addMoney = new addMoney(bankCard);
        subMoney subMoney = new subMoney(bankCard);
        Thread thread1 = new Thread(addMoney,"bxr");
        Thread thread2 = new Thread(subMoney,"hsy");
        Thread thread3 = new Thread(addMoney,"jb");
        Thread thread4 = new Thread(subMoney,"cc");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
