package com.marron_06;

public class PhoneDemo {
    public static void main(String[] args) {
        // 创建对象,调用方法
        Phone p = new Phone();
        p.call("marron");
        System.out.println("--------");

        NewPhone np = new NewPhone();
        np.call("Marron");
    }
}
