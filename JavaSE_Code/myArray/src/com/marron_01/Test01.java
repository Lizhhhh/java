package com.marron_01;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数: ");
        int day = sc.nextInt();
        while (day < 1 || day > 7) {
            System.out.println("请输入整数 1~7");
            day = sc.nextInt();
        }
        if (day == 1) {
            System.out.println("跑步");
        }
        if (day == 2) {
            System.out.println("游泳");
        }
        if (day == 3) {
            System.out.println("慢走");
        }
        if (day == 4) {
            System.out.println("动感单车");
        }
        if (day == 5) {
            System.out.println("拳击");
        }
        if (day == 6) {
            System.out.println("爬山");
        }
        if (day == 7) {
            System.out.println("好好吃一顿");
        }
    }
}
