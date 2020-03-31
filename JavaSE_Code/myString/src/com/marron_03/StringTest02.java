package com.marron_03;

import java.util.Scanner;

public class StringTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串: ");
        String line = sc.nextLine();

        for (int i = 0; i < line.length(); i++) {
            System.out.println(line.charAt(i));
        }
    }
}
