package com.marron_03;

import java.util.Scanner;

public class StringBuilderTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串: ");
        String str = sc.nextLine();
        System.out.println(reverseStr(str));
    }
    public static String reverseStr(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
