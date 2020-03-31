package com.marron_03;

import java.util.Scanner;

public class StringTest03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String print = sc.nextLine();
        int upper = 0;
        int lower = 0;
        int number = 0;

        for (int i = 0; i < print.length(); i++) {
            char ch = print.charAt(i);
            if ('0' <= ch && ch <= '9') {
                number++;
            }
            if ('a' <= ch && ch <= 'z') {
                lower++;
            }
            if ('A' <= ch && ch <= 'Z') {
                upper++;
            }
        }
        System.out.println("大写字母个数为: " + upper);
        System.out.println("小写字母个数为: " + lower);
        System.out.println("数字个数为: " + number);
    }
}
