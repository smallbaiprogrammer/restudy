package com.company.restudy.io;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("E:\\code\\java\\idea\\src\\com\\company\\restudy\\io\\testIo.txt");
        // 一个个字符读
        int count = 0;
//        while ((count=reader.read())!=-1){
//            System.out.print((char)count);
//        }
        // 缓存数组读
        char[] buf = new char[1024];
        while ((count = reader.read(buf))!=-1){
            System.out.print(new String(buf,0,count));
        }
        reader.close();
    }
}
