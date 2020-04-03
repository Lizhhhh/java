package com.marron_04;

public class AnimalDemo {
    public static void main(String[] args) {
        // 多态
        Animal a = new Cat();       // 向上转型:子类对象转为父类
        a.eat();

        // 向下转型
        Cat c = (Cat) a;
        c.eat();
        c.playGame();
    }
}
