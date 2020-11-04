package com.company.java.多线程;

public class Foo {
    public static volatile boolean  flag1;
    public static volatile boolean flag2;
    public Foo() {
        flag1 = false;
        flag2 = false;
    }

    public synchronized void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        flag1 = true;
        flag2 = false;
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        if (!flag1){
            this.wait();
        }

        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        flag2 =true;
        this.notifyAll();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {
        if (!flag2){
            this.wait();
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        this.notifyAll();
    }
}
