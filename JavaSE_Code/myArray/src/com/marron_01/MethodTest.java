package com.marron_01;

public class MethodTest {
    public static void main(String[] args) {
        printMax(10, 9);
    }

    public static void printMax(int x, int y) {
        if (x > y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }
    }
}
