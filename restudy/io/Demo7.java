package com.company.restudy.io;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class Demo7 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("userName","张三");
        properties.setProperty("age","20");
        properties.setProperty("tex","nan");
        Set<String> set = properties.stringPropertyNames();
        for (String s:set){
            System.out.println(s);
        }
        // 采用流将数据打印到文件中
        PrintWriter pw = new PrintWriter("d:\\print.text");
        properties.list(pw);
        pw.close();
        FileWriter fos = new FileWriter("d:\\print.text");
        properties.store(fos,"注释");
        fos.close();
        System.out.println(properties.toString());
    }
}
