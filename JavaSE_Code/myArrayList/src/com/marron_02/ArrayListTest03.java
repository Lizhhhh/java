package com.marron_02;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest03 {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList();
        addStudent(array);
        addStudent(array);
        addStudent(array);

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄");
        int age = sc.nextInt();

        Student s = new Student();
        s.setName(name);
        s.setAge(age);
        array.add(s);
    }
}
