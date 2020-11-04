package com.company.restudy.StringStudy;

public class StringBuilderTest {
    public static void main(String[] args) {
        // string stringbuilder stringbuffer 三者测试
        String string = new String("");
        StringBuffer stringBuffer = new StringBuffer("");
        StringBuilder stringBuilder = new StringBuilder("");
        long StartTimesString = System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            string+=i;
        }
        long EndTimesString = System.currentTimeMillis();
        System.out.println("String 运行时间" + (EndTimesString-StartTimesString));
        long StartTimesStringBuffer = System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            stringBuffer.append(i);
        }
        long EndTimesStringBuffer = System.currentTimeMillis();
        System.out.println("StringBuffer 运行时间" + (EndTimesStringBuffer - StartTimesStringBuffer) );
        long startTimesStringBuilder = System.currentTimeMillis();
        for (int i = 0 ;i < 100000 ;i++){
            stringBuilder.append(i);
        }
        long endTimesStringBuffer = System.currentTimeMillis();
        System.out.println("StringBuilder运行时间" + (endTimesStringBuffer - startTimesStringBuilder));
    }
}
