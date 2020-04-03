package com.marron_02;

public interface Inter {
    public int num = 10;
    public final int num2 = 20;
    int num3 = 30;  // 在接口中等价于 public static final int num3 = 30;

    //    public Inter(){}      // 接口中无构造方法

    void method();  // 等价于 public abstract void method()
}
