package com.marron_02;

public class InterfaceDemo {
    public static void main(String[] args) {
        Inter i = new InterImp();
        System.out.println(i.num);
//        i.num2 = 40;
//        i.num = 20;
        System.out.println(i.num2);
        System.out.println(Inter.num);
    }
}
