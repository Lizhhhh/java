package com.marron_11;

public class Demo {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.setName("加菲");
        c1.setAge(5);
        System.out.println(c1.getName() + "," + c1.getAge());
        c1.catchMouse();

        Cat c2 = new Cat("加菲猫", 4);
        System.out.println(c2.getName() + "," + c2.getAge());
        c2.catchMouse();
    }
}
