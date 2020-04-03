package com.marron_02;

public class Student {
    private String name = "Marron";
    private static String university = "华中科技大学";


    // 非静态成员方法
    public void show1() {
    }

    // 非青苔成员方法
    public void show2() {
        System.out.println(name);
        System.out.println(university);
        show1();
        show3();
    }

    // 静态成员方法
    public static void show3() {
    }

    // 静态成员方法
    public static void show4() {
//        System.out.println(name);
        System.out.println(university);
//        show1();
        show3();
    }
}
