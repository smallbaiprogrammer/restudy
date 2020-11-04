package com.company.restudy.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("E:\\code\\java\\idea\\src\\com\\company\\restudy\\io\\testIo.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\code\\java\\idea\\src\\com\\company\\restudy\\io\\testIo2.txt",true);
        byte[] bytes = new byte[10];
        int count = fileInputStream.read(bytes);
        fileInputStream.close();
        // 覆盖原文件
        fileOutputStream.write(bytes,0,count);
        fileOutputStream.close();
    }
}
