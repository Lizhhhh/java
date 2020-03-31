package com.marron_01;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        // 创建一个空集合对象
        ArrayList<String> array = new ArrayList<>();

        // 输出集合
        System.out.println("array: " + array);

        // 添加元素
        array.add("hello");
        array.add("world");
        array.add("java");
        System.out.println("array: " + array);

        // 在指定位置添加元素
        array.add(1, "javaSE");
        System.out.println("array: " + array);
    }
}
