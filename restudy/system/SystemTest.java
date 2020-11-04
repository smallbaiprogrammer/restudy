package com.company.restudy.system;

import java.util.Arrays;

public class SystemTest {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6};
        int[] tem = new int[10];
        System.arraycopy(nums,0,tem,2,3);
        System.out.println(Arrays.toString(tem));
    }
}
