package com.company.restudy.OfenObject;

public class Class {
    String name;
    int num;
    public Class (String name,int num){
        this.name=name;
        this.num=num;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println(this.name+"被回收了");
    }
}
