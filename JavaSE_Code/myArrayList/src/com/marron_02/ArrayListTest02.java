package com.marron_02;

import java.util.ArrayList;

public class ArrayListTest02 {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<Student> StudentList = new ArrayList<>();

        // 创建学生对象
        Student s1 = new Student("Marron", 18);
        Student s2 = new Student("Mar", 17);
        Student s3 = new Student("lzhhc", 19);

        // 添加元素到集合中
        StudentList.add(s1);
        StudentList.add(s2);
        StudentList.add(s3);

        for (int i = 0; i < StudentList.size(); i++) {
            Student tmpStu = StudentList.get(i);
            System.out.println(tmpStu.getName() + "今年" + tmpStu.getAge() + "岁");
        }
    }
}
