package com.marron_02;

public class AnimalDemo {
    public static void main(String[] args) {
        // 创建操作类对象,并调用方法
        AnimalOperator ao = new AnimalOperator();
        Animal a = new Cat();
        ao.useAnimal(a);
        System.out.println("--------");

        Animal a2 = ao.getAnimal();  // new Cat()
        a2.eat();
    }
}
