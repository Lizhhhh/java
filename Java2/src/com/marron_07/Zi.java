package com.marron_07;

public class Zi extends Fu {

/*    @Override
    private void show() {
        System.out.println("Zi中show()方法调用");
    }

    1. 父类中的私有内容,子类中是继承不到的
 */

    @Override
    public void method() {
        System.out.println("Zi中method()方法被调用");
    }
    // 子类方法访问权限不能更低 (public > 默认 > 私有)
}
