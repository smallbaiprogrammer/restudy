package com.company.restudy.io;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.InflaterInputStream;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("E:\\code\\java\\idea\\src\\com\\company\\restudy\\io\\testIo.txt");
        // read 方法 读一个字节

        //inputStream.read();
        // 单个字节的读取方式，不能读取汉字，也就是不支持Unicode码
//        int x = 0;
//        while ((x=inputStream.read())!=-1){
//            System.out.print((char)x);
//        }
        // 一串串读
        byte[] bys = new byte[3];
        //int count = inputStream.read(bys);
        int count = 0;
        while ((count=inputStream.read(bys))!=-1){
            System.out.println(new String(bys,0,count));
        }
        for (int i=0;i<count;i++){
            System.out.print((char) bys[i]);
        }
        inputStream.close();
    }


}
