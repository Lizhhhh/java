package com.marron_01;

public class Student {
    // 成员变量
    String name;
    private int age;

    // 成员方法
    public void show() {
        System.out.println(name + "," + age);
    }

    public int getAge() {
        return this.age;
    }
}
