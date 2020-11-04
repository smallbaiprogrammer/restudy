package com.company.restudy.StringStudy;

import java.util.stream.StreamSupport;

public class Demo1 {
    public static void main(String[] args) {
        // hello 存储在字符串池中，也叫做字符串池中
        String name = "hello";
        // 栈中的局部变量name 指向 字符串池中的 hello
        name = "张三";
        // 赋值过程
        // 在这个过程 在字符串池中重新开辟一块空间，然后name指向 字符出池中 张三
        // hello 就变成了 垃圾 此时如果再创建一个字符串对象
        String name2 = "张三";
        // 那么此时一样 栈中的name2 在字符串池中查找张三，找到之后，地址指向张三，所以 字符串是共享的
        String str = "this is a text";
        String[] strings = str.split(" ");
        for (String s : strings){
            System.out.println(s);
        }
        String ans = str.replace("text","practice");
        System.out.println(ans);
        str = str.replace("text","easy pratice");
        System.out.println(str);
        for (int i=0;i<strings.length;i++){
            strings[i] =Character.toUpperCase(strings[i].charAt(0))+strings[i].substring(1);
        }
        for (String s:strings){
            System.out.print(s+" ");
        }
    }
}
