package com.company.restudy.io;

import java.io.File;
import java.io.IOException;

public class FileTets {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\code\\java\\idea\\src\\com\\company\\restudy\\io\\timg.jpg");
        // 路径分隔符
        System.out.println(File.pathSeparator);
        System.out.println(File.separator);
        if (file.exists()){
            file.delete();
        }else {
            file.createNewFile();
        }
        // 获取文件信息
        System.out.println(file.canExecute());

    }
}
