package com.marron_02;

import java.util.ArrayList;

public class ArrayListTest01 {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<String> array = new ArrayList<>();

        // 在集合中添加字符串对象
        array.add("Marron");
        array.add("Mar");
        array.add("lzhhc");

        // 遍历集合
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}
