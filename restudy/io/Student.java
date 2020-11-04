package com.company.restudy.io;

import java.io.Serializable;

/**
 *  可序列化 接口
 */
public class Student implements Serializable {

    private String name;
    private transient int age;
    public Student(){
    }
    public Student(String name,int age){
        this.age= age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
