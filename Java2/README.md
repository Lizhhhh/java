# 继承

## 继承概述

下面有一个学生类

```java
public class Student{
    private String name;
    private int age;
    
    public void study(){
        System.out.println("努力学习了");
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
}
```

还有一个老师类

```java
public class Teacher {
    private String name;
    private int age;
    
    public void teach(){
        System.out.println("教书育人");
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age =age;
    }
}
```

其中有许多相同的特征,可以提取出来变为一个单独的类

```java
public class Person{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age =age;
    }
}
```

【继承】: 是面向对象三大特征之一。可以使得子类具有父类的属性和方法,还可以在子类中重新定义,追加属性和方法。

使用继承实现上面的类

```java
public class Teacher extends Person{
    public void teach(){
        System.out.println("教书育人");
    }
}
```

【继承的好处和弊端】

继承好处:

- 提高了代码的复用性(多个类相同的成员可以放到同一个类中)
- 提高了代码的维护性(如果方法的代码需要修改,修改一处即可)

继承弊端:

- 继承让类与类之间产生了关系,类的耦合性增强了,当父类发生变化时子类实现也不得不跟着变化,削弱了子类的独立性

## 继承中变量的访问特点

在子类方法中访问一个变量

- 子类局部范围找
- 子类成员范围找
- 父类成员范围找
- 如果都没有就报错(不考虑父亲的父亲..)

## Super

```java
public class Zi extends Fu {
    public int age = 20;

    public void show() {
        int age = 30;
        System.out.println(age + ",局部变量");
        // 我要访问本垒的成员变量age,怎么办呢?
        System.out.println(this.age + ",子类的成员变量");
        // 我要访问父类的成员变量age, 怎么办呢?
        System.out.println(super.age + ",父类的成员变量");
    }
}
```

super关键字的用法和this关键字的用法相似

- this: 代表本类对象的引用
- super: 代表父类存储空间的标识(可以理解为父类对象引用)

| 关键字 | 访问成员变量                     | 访问构造方法               | 访问成员方法                          |
| ------ | -------------------------------- | -------------------------- | ------------------------------------- |
| this   | this.成员变量,访问本类成员变量   | this(...)访问本类构造方法  | this.成员方法()访问本类成员方法       |
| super  | super.成员变量: 访问父类成员变量 | super(...)访问父类构造方法 | super.成员方法(...): 访问父类成员方法 |

## 继承中构造方法的访问特点

子类中所有的构造方法默认都会访问父类中无参的构造方法.

- 因为子类会继承父类中的数据,可能还会使用父类的数据。所以,子类初始化之前,一定要先完成父类数据的初始化。

- 每一个子类的构造方法的第一条语句,默认都是: super()

   

如果父类中没有无参构造方法,只有带参构造方法,该怎么办呢?

- 通过使用super关键字去显示的调用父类的带参构造方法
- 在父类中自己提供一个无参构造方法(推荐)



## 继承中成员方法的访问特点

通过子类对象访问一个方法

- 子类成员范围找
- 父类成员范围找
- 如果没有就报错(不考虑父亲的父亲)

## 方法重写

**方法重写**: 子类中出现了和父类中一模一样的方法声明的现象

**方法重写的应用**: 当子类需要父类的功能,而功能主体子类有自己的特有内容时,可以重写父类中的方法,这样,即沿袭了父类的功能,又定义了子类特有的内容

```java
public class Phone {
    public void call(String name) {
        System.out.println("给" + name + "打电话");
    }
}
```

```java
public class NewPhone extends Phone {
    // 在子类中重写call功能
    @Override
    public void call(String name) {
        System.out.println("开启视频功能");
        super.call(name);
    }
}
```



## 方法重写注意事项

- 父类中的私有内容,子类中是继承不到的

- 子类方法访问权限不能更低 (public > 默认 > 私有)

## Java中继承的注意事项

- Java中类只支持单继承,不支持多继承
- Java中类支持多层继承

```java
public class GrandDad{
    public void drink(){
        System.out.println("爷爷爱喝酒");
    }
}
```

```java
public class Father extends GrandDad{
    public void smoke(){
        System.out.println("爸爸爱抽烟");
    }
}
```

```java
public class Son extends Father{
    
}
```

## 栗子 - 包含关系

需求: 定义老师类和学生类,然后些代码测试;最后找到老师类和学生类当中的共性内容,抽取出一个父类,用继承的方式改写代码,并进行测试.

```java
// Person.java
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

```java
// Teacher.java
public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("老师爱教书哟~");
    }
}
```

```java
// Demo.java
public class Demo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setAge(18);
        t1.setName("Marron");
        System.out.println(t1.getName() + "," + t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("Mar", 17);
        System.out.println(t2.getName() + "," + t2.getAge());
        t2.teach();

    }
}
```

## 栗子 - 并列关系

需求: 请采用继承的思想实现猫和狗的案例,并在测试类中进行测试

```java
// Animal.java
public class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

```java
// Dog.java
public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void lookDoor() {
        System.out.println("狗看门");
    }
}
```

```java
// Cat.java
public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
```

# 修饰符

## 包

**包**: 其实就是文件夹,对类进行分类管理

**包的定义格式**: 

- 格式: package 包名; (多级包名.分开)
- 范例: package com.marron;

