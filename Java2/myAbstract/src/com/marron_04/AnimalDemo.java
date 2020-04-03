package com.marron_04;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(4);
        System.out.println(a.getName() + "," + a.getAge());
        System.out.println("---------");

        a = new Cat("加菲", 5);
        System.out.println(a.getName() + "," + a.getAge());
        System.out.println("---------");

        Animal a2 = new Dog();
        a2.setName("加菲");
        a2.setAge(4);
        System.out.println(a2.getName() + "," + a2.getAge());
        System.out.println("---------");

        a2 = new Dog("加菲", 5);
        System.out.println(a.getName() + "," + a.getAge());

    }
}
