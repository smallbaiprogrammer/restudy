package com.company.restudy.io;

import java.io.*;

public class Demo6 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\code\\java\\idea\\src\\com\\company\\Main.java");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader streamReader = new InputStreamReader(fileInputStream,"utf-8");
        int data = 0;
        char[] chars = new char[1024];
        while ((data = streamReader.read(chars))!=-1){
            System.out.println(new String(chars,0,data));
        }
        streamReader.close();

    }
}
