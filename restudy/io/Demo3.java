package com.company.restudy.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        // 文件复制
        FileInputStream fileInputStream = new FileInputStream("E:\\code\\java\\idea\\src\\com\\company\\restudy\\io\\timg.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\code\\java\\idea\\src\\com\\company\\restudy\\io\\copy.jpg");
        byte[] bytes = new byte[1024];
        int count = 0;
        while ((count=fileInputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,count);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
