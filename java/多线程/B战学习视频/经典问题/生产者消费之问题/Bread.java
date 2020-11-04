package com.company.java.多线程.B战学习视频.经典问题.生产者消费之问题;

import com.company.java.多线程.Bank;

public class Bread {
    private int id;
    private String produceName;
    public Bread(){}
    public Bread(int id,String produceName){
        this.id=id;
        this.produceName = produceName;
    }
    public int getId() {
        return id;
    }

    public String getProduceName() {
        return produceName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProduceName(String produceName) {
        this.produceName = produceName;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "id=" + id +
                ", produceName='" + produceName + '\'' +
                '}';
    }
}
