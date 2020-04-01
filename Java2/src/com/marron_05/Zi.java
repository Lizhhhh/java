package com.marron_05;

public class Zi extends Fu {
    public void method() {
        System.out.println("Zi中的method()方法被调用");
    }

    public void show() {
        super.show();
        System.out.println("Zi中show()方法被调用");
    }
}
