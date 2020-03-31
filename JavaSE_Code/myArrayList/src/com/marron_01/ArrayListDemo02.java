package com.marron_01;

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        array.add("hello");
        array.add("world");
        array.add("java");

        // 输出集合
//        System.out.println("array: " + array);

        // 删除
//        array.remove("world");
//        System.out.println("array: " + array);

        // 删除: 按索引
//        array.remove(0);
//        System.out.println("array: " + array);

        // 修改：指定索引处
//        array.set(2, "javaSE");
//        System.out.println("array: " + array);

        // 查询: 索引处的元素
//        System.out.println(array.get(2));
//        System.out.println("array: " + array);

        // 集合长度
        System.out.println(array.size());

    }
}
