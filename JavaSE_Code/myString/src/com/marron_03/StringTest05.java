package com.marron_03;

import java.util.Scanner;

public class StringTest05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.nextLine();
        System.out.printf(reverseStr(str));
    }

    public static String reverseStr(String s) {
        String tmpS = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            tmpS += s.charAt(i);
        }
        return tmpS;
    }
}
