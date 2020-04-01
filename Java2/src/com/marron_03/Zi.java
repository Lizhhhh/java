package com.marron_03;

public class Zi extends Fu {
    public int age = 20;

    public void show() {
        int age = 30;
        System.out.println(age + ",局部变量");
        // 我要访问本垒的成员变量age,怎么办呢?
        System.out.println(this.age + ",子类的成员变量");
        // 我要访问父类的成员变量age, 怎么办呢?
        System.out.println(super.age + ",父类的成员变量");
    }
}
