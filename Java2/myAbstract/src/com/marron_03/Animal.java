package com.marron_03;

public abstract class Animal {
    private int age = 20;
    private final String city = "武汉";

    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }

    public void show() {
        age = 40;
        System.out.println(age);
//        city = "深圳";
        System.out.println(city);
    }

    public abstract void eat();
}
