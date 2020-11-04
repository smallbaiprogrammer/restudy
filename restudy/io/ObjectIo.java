package com.company.restudy.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIo {
    public static void main(String[] args) throws IOException {
        // 该流可以写入的内容，八种基本类型，引用类型都可以，之前的流都只能读取字节
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\code\\java\\idea\\src\\com\\company\\restudy\\io\\testio2.bin");
        // 对象流以节点流为基础
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        // 对象必须可以序列化，也就是必须要实现Setiblable 接口 可序列化接口，此接口为标记接口
        Student student1 = new Student("张三",11);
        objectOutputStream.writeObject(student1);
        objectOutputStream.close();
        System.out.println("序列化完毕");
    }
}
