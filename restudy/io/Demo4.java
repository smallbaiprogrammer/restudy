package com.company.restudy.io;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        // 文件读取流
        FileInputStream fileInputStream = new FileInputStream("E:\\code\\java\\idea\\src\\com\\company\\restudy\\io\\testIo.txt");
        // 采用缓存流，进行保存数据
        // 缓存流的大小为8k字节
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        int data = 0;
        byte[] bytes = new byte[10];
        while ((data = bufferedInputStream.read(bytes))!=-1 ){
            System.out.println(new String(bytes,0,data));
        }
        bufferedInputStream.close();
        // 采用流来写入数据
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\code\\java\\idea\\src\\com\\company\\restudy\\io\\testio.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        for (int i=0;i<10;i++){
            bufferedOutputStream.write("helloworld\n".getBytes());
            bufferedOutputStream.flush();
        }
        bufferedOutputStream.close();
    }
}
