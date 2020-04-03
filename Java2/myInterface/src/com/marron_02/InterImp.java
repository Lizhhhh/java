package com.marron_02;

// 等价于 public class InterImp extends Object implements Inter{
public class InterImp implements Inter {
    public InterImp() {
        super();
    }

    @Override
    public void method() {
        System.out.println("子类重写了void方法");
    }
}
