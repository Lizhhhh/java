package com.marron;

import java.awt.desktop.SystemSleepEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("------欢迎来到学生管理系统------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入您的选择:");
            String option = sc.nextLine();
            if (option.equals("1")) {
                addStudent(array);
            }
            if (option.equals("2")) {
                deleteStudent(array);
            }
            if (option.equals("3")) {
                updateStudent(array);
            }
            if (option.equals("4")) {
                findAllStudent(array);
            }
            if (option.equals("5")) {
                System.out.println("感谢您的使用");
                break;
            }
        }

    }

    // 定义一个方法,用于添加学生信息
    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        String sid;

        while (true) {
            System.out.println("请输入学生学号: ");
            sid = sc.nextLine();

            boolean flag = isUsed(array, sid);
            if (flag) {
                System.out.println("学号重复!");
            } else {
                break;
            }
        }


        System.out.println("请输入学生姓名: ");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄: ");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地: ");
        String address = sc.nextLine();

        // 创建学生对象
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        // 将学生对象添加到集合中
        array.add(s);

        System.out.println("添加成功");
    }

    // 判断学号是否被使用
    public static boolean isUsed(ArrayList<Student> array, String sid) {
        boolean flag = false;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    // 定义一个方法,用于查看学生信息
    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("无信息,请先添加信息再查询!");
            return;
        }
        System.out.println("学号\t\t姓名\t\t年龄\t\t居住地");
        // \t其实就是tab的意思

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t\t" + s.getAddress());
        }

    }

    // 定义一个方法,用于删除学生信息
    public static void deleteStudent(ArrayList<Student> array) {
        System.out.println("请输入您要删除的学生的学号: ");
        Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();
        // 检查学生学号是否存在
        int index = -1;

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("该信息不存在,请重新输入");
        } else {
            array.remove(index);
            System.out.println("删除学生成功");
        }

    }

    // 定义一个方法,用于修改学生信息
    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您要修改的学生的学号: ");
        String sid = sc.nextLine();

        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("需要修改的学生不存在,请重写选择");
        } else {

            // 录入要修改的学生信息
            System.out.println("请输入学生新姓名: ");
            String name = sc.nextLine();
            System.out.println("请输入学生新年龄: ");
            String age = sc.nextLine();
            System.out.println("请输入学生新居住地: ");
            String address = sc.nextLine();

            // 创建学生对象
            Student s = new Student();
            s.setSid(sid);
            s.setName(name);
            s.setAge(age);
            s.setAddress(address);

            array.set(index, s);
            // 修改成功的提示
            System.out.println("修改学生成功");
        }


    }


}
