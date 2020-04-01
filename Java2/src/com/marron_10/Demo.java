package com.marron_10;

public class Demo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setAge(18);
        t1.setName("Marron");
        System.out.println(t1.getName() + "," + t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("Mar", 17);
        System.out.println(t2.getName() + "," + t2.getAge());
        t2.teach();

    }
}
