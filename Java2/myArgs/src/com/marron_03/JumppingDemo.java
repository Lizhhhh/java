package com.marron_03;

public class JumppingDemo {
    public static void main(String[] args) {
        // 创建操作对象,并调用方法
        JumppingOperator jo = new JumppingOperator();
        Jumpping j = new Cat();
        jo.useJumpping(j);
        System.out.println("---------");

        Jumpping j2 = jo.getJumpping();
        j2.jump();
    }
}
