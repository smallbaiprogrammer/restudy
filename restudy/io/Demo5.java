package com.company.restudy.io;

import java.io.*;

public class Demo5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 将数据转为对象数据，反序列化，一个文件只能读取一次
        FileInputStream fileInputStream = new FileInputStream("E:\\code\\java\\idea\\src\\com\\company\\restudy\\io\\testio2.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student student1 =(Student)objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(student1.toString());
    }
}
