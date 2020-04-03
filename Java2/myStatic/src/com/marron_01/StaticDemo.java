package com.marron_01;

public class StaticDemo {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "张三";
        s1.age = 18;
        s1.university = "华中科技大学";
        s1.show();

        Student s2 = new Student();
        s2.name = "Mar";
        s2.age = 15;
//        s2.university = "华中科技大学";
        s2.show();
    }
}
