

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



**带包的Java类编译和执行**: 

- 手动建包:
  - 按照以前的格式编译java文件: `javac HelloWorld.java`
  - 手动创建包: `在磁盘中建立文件夹com, 然后在com下建立文件家 marron`
  - 把class文件放到包的最里面: `把HelloWorld.class文件放到com下的marron这个文件夹下`

- 自动建包:
  - 在使用javac命令编译的时候: `javac -d . HelloWorld.java`
  - 执行的时候: `java com.marron.HelloWorld`

- 附上HelloWorld.java的代码

```java
// HelloWorld.java
package com.marron;

public class HelloWorld{
    public static void main(String[] args){
        System.out.println("HelloWorld");
    }
}
```

## 导包

使用不同包下的类时,使用的时候要写类的全路径,写起来太麻烦了

为了简化带包的操作,Java提供了导包的功能

**导包的格式**:

- 格式: import 包名;
- 范例: import cn.marz.Teacher



## 修饰符

### 权限修饰符

|  修饰符   | 同一个类中 | 同一个包中子类无关类 | 不同包的子类 | 不同包的无关类 |
| :-------: | :--------: | :------------------: | :----------: | :------------: |
|  private  |     √      |                      |              |                |
|   默认    |     √      |          √           |              |                |
| protected |     √      |          √           |      √       |                |
|  public   |     √      |          √           |      √       |       √        |

### 状态修饰符 - final

<font color="red">final</font>关键字是最终的意思,可以修饰成员方法,成员变量、类

**final修饰的特点**

- 修饰方法: 表示该方法是最终方法,不能被重写
- 修饰变量: 表示该变量是常量,不能被再次赋值
- 修饰类: 表示该类是最终类,不能被继承

**final修饰局部变量**

- 变量是基本类型: final修饰指的是基本类型的数据值不能发生改变
- 变量是引用类型: final修饰指的是引用类型的地址值不能发生改变,但是地址值里面的内容是可以发生改变的



### 状态修饰符 - static

<font color="red">static</font>关键字是静态的意思,可以修饰成员方法、成员变量

```java
public class Student {
    public String name;
    public int age;
    public static String university;	// 表示学校类是共享属性,只能被赋值一次

    public void show() {
        System.out.println(name + "," + age + "," + university);
    }
}

/* 测试类 */
public class StaticDemo{
    public static void main(String[] args){
        Student.university = "华中科技大学";
        
        Student s1 = new Student();
        s1.name = "Marron";
        s1.age = 18;
        s1.show();
        
        Student s2 = new Student();
        s2.name = "Mar";
        s2.age = 17;
        s2.show();
    }
}
```

**static修饰的特点**

- 被类的所有对象共享
  - 这也是我们判断是否使用静态关键字的条件
- 可以通过类名调用
  - 当然,也可以通过对象名调用

**static访问特点**

- 非静态成员方法可以访问所有的静态成员(方法)、非静态成员(方法)
- 静态成员方法中,只能访问静态成员(方法)

```java
public class Student {
    private String name = "Marron";
    private static String university = "华中科技大学";


    // 非静态成员方法
    public void show1() {
    }

    // 非青苔成员方法
    public void show2() {
        System.out.println(name);
        System.out.println(university);
        show1();
        show3();
    }

    // 静态成员方法
    public static void show3() {
    }

    // 静态成员方法
    public static void show4() {
//        System.out.println(name);     // 报错
        System.out.println(university);
//        show1();		// 报错
        show3();
    }
}
```

**小结**: 静态成员方法只能访问静态成员

# 多态

同一个对象,在不同时刻表现出来的不同形态

```java
// Animal.java
public class Animal {
    public void eat() {
        System.out.println("动物吃东西");
    }
}

// Cat.java
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

// AnimalDemo.java
public class AnimalDemo {
    public static void main(String[] args) {
        // 有父类引用指向子类实例
        Animal a = new Cat();
    }
}
```

多态的前提:

- 有继承/实现关系
- 有方法重写
- 有父类引用指向子类对象

## 多态中成员访问的特点

```java
// Animal.java
public class Animal {
    public int age = 40;

    public void eat() {
        System.out.println("动物吃东西");
    }
}

// Cat.java
public class Cat extends Animal {

    public int age = 20;
    public int weight = 10;

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void playGame() {
        System.out.println("猫捉迷藏");
    }
}

// AnimalDemo.java
public class AnimalDemo {
    public static void main(String[] args) {
        // 有父类引用指向子类对象
        Animal a = new Cat();

        System.out.println(a.age);
//        System.out.println(a.weight);  // 报错

        a.eat();
//        a.playGame();     // 报错
    }
}
```

- 成员变量: 编译看左边, 执行看左边 `a.age`全是Animal中的数据
- 成员方法: 编译看左边,执行看右边`eat()方法可以使用,但是playGame()不能`

>  *为什么成员变量和成员方法的访问不一样呢?*
>
> - 因为成员方法有重写,而成员变量没有

## 多态的好处和弊端

```java
// Animal.java
public class Animal {
    public void eat() {
        System.out.println("动物吃东西");
    }
}

// Dog.java
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}

// Cat.java
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

// AnimalOperator.java
public class AnimalOperator {
    /* 
    	这里就用到了多态
    	Animal a = new Cat();
    	Animal a = new Dog();
    	// 编译看Animal中有无eat方法, 执行分别看Cat和Dog中eat方法是否重写
    */
    public void useAnimal(Animal a) {
        a.eat();
    }
}

// 测试类: AnimalDemo.java
public class AnimalDemo {
    public static void main(String[] args) {
        // 创建动物操作类的对象,调用方法
        AnimalOperator ao = new AnimalOperator();
        Cat c = new Cat();
        ao.useAnimal(c);

        Dog d = new Dog();
        ao.useAnimal(d);
    }
}
```

- 多态的好处: 提高了程序的扩展性
  - 具体体现: 定义方法的时候,使用父类型作为参数,将来在使用的时候,使用具体的子类型参与操作
- 多态的弊端: 不能使用子类的特有功能

## 多态中的转型

```java
public class Animal {
    public void eat() {
        System.out.println("动物吃东西");
    }
}

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void playGame() {
        System.out.println("猫捉迷藏");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        // 多态
        Animal a = new Cat();       // 向上转型:子类对象转为父类
        a.eat();

        // 向下转型
        Cat c = (Cat) a;
        c.eat();
        c.playGame();
    }
}
```

## 栗子

需求: 用多态的思想实现猫和狗的案例,并在测试类中进行测试

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

    public void eat() {
        System.out.println("动物吃东西");
    }
}

// Cat.java
public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

// AnimalDemo.java
public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        a = new Cat("加菲", 5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
    }
}
```

# 抽象类

在Java中,一个没有方法体得方法应该定义为抽象方法,而类如果有抽象方法,改类必须定义为抽象类

## 抽象类的特点

- 抽象类和抽象方法必须使用abstract关键字修饰
  - `public abstract class 类名 {}`
  - `public abstract void eat()`

- 抽象类中不一定有抽象方法,有抽象方法的类一定是抽象类
- 抽象类不能实例化
  - 抽象类如何实例化? 参照多态的方式,通过子类对象实例化,这叫抽象类多态
- 抽象类的子类
  - 要么重写抽象类中的所有抽象方法
  - 要么是抽象类

## 抽象类的成员特点

- 成员变量:
  - 可以是变量: `private int age = 20`
  - 也可以是常量: `private final String city = "武汉"` 

- 构造方法:
  - 有构造方法,但是不能实例化
  - 构造方法用于子类访问父类数据的初始化

- 成员方法:
  - 可以是抽象方法: 限定子类必须完成某些动作
  - 也可以是非抽象方法: 提高代码的复用性

# 接口

**接口**: 就是一种公共的规范标准,只要符合规范,大家都可以通用

Java中的接口更多的体现在对行为的抽象

## 接口的特点

- 接口用关键字`interface`修饰

  - ```java
    public interface Jumpping {
        public abstract void jump();
    }
    ```

- 类实现接口用implements表示

  - ```java
    public class Cat implements Jumpping{
        @override
        public void jump(){
            System.out.print("猫可以跳高了");
        }
    }
    ```

- 接口不能实例化

  - 如何实现接口实例化? 参照多态的实现方式,通过实现类对象实例化,这叫接口多态

>多态的形式: 具体类多态、抽象类多态、接口多态
>
>多态的前提: 有继承或者实现关系; 有方法重写; 有父(类/接口)引用指向(子/实现)类对象

- 接口的实现类:
  - 要么重写接口中的所有抽象方法
  - 要么是抽象类

## 接口的成员特点

- 成员变量:
  - 只能是常量
  - 默认修饰符: `public static final`

- 构造方法
  - 接口没有构造方法,因为接口主要是对行为进行抽象的,是没有具体存在
  - 一个类如果没有父类,默认继承自Object类
- 成员方法
  - 只能是抽象方法
  - 默认修饰符: `public abstract`

## 类和接口的关系

- 类和类的关系
  - 继承关系, 只能单继承,但是可以多层继承
- 类和接口的关系
  - 实现关系,可以单实现,也可以多实现,还可以在继承一个类的同时实现多个接口
  - `public class InterImpl extends Object implements Inter1, Inter2, Inter3`

- 接口和接口的关系
  - 继承关系, 可以单继承,也可以多继承
  - `public interface Inter2 extends Inter1, Inter3`

## 抽象类和接口的区别

| -            | 抽象类                                        | 接口                      |
| ------------ | --------------------------------------------- | ------------------------- |
| 成员区别     | 既有变量也有常量; 既有抽象方法,也有非抽象方法 | 只要常量(final)和抽象方法 |
| 设计理念区别 | 对类抽象,包括属性和行为                       | 对行为抽象,主要是行为     |

【小栗子】: 门和警报

需求: 门: 有open()和close()两个动作,下面使用抽象类和接口来定义这个抽象概念.有的门具备报警功能,有的门不具备.因此可如下设计.

```java
public interface Alarm{
    void alarm():
}

public abstract class Door{
    public abstract void open();
    public abstract void close();
}
public class AlaramDoor extends Door implements Alarm {
    @override
    public void open(){
        // ...
    }
    @override
    public void close(){
        // ...
    }
    @override
    public void alarm(){
        // ...
    }
}
```

在这里,我们再次强调抽象类是对事物的抽象,而接口是对行为的抽象.

# 形参和返回值

## 抽象类名作为形参和返回值

- 方法的形参是抽象类型,其实需要的是该抽象类的子类对象
- 方法的返回值是抽象类名,其实返回的是该抽象类的子类对象

## 接口名作为形参和返回值

- 方法的形参是接口名,其实需要的是该接口的实现类对象

- 方法的返回值是接口名,其实返回的是该接口的实现类对象

```java
// Jummping.java
public interface Jumpping {
    void jump();  // public abstract void jump();
}

// Cat.java
public class Cat implements Jumpping {
    @Override
    public void jump() {
        System.out.println("猫跳高高");
    }
}

// JumppingOperator.java
public class JummpingOperator{
    public void sueJumpping(Jumpping j){
        j.jump();
    }
    
    public Jummping getJumpping(){
        Jumpping j = new Cat();
        return j;
    }
}

// JumppingDemo.java
public class JumppingDemo{
    public static void main(String[] args){
        // 创建操作对象,并调用方法
        JumppingOperator jo = new JumppingOperator();
        Jumpping j = new Cat();
        jo.useJumpping(j);
        System.out.println("--------");
        
        Jumpping j2 = jo.getJumpping();
        j2.jump();
    }
}
```

# 内部类

内部类: 就是在一个类中定义一个类

```java
public class Outer{
    public class Inner{
        
    }
}
```

内部类与外部类的交互

```java
public class Outer {
    private int num = 10;
    public class Inner {
        public void show() {
            // 内部类可以直接访问外部类的私有变量
            System.out.println(num);
        }
    }
    
    // 外部类使用内部类时,需要先new一个内部类实例
    public void method(){
        Inner i = new Inner();
        i.show();
    }
}
```

## 成员内部类

*成员内部类*: 在类中定义的类

```java
public class Outer {
    private int num = 10;

    public class Inner {
        public void show() {
            System.out.println(num);
        }
    }
}
```

- 访问如下:

```java
public class InnerDemo {
    public static void main(String[] args) {
        // 创建内部类对象,并调用方法
        Outer.Inner i = new Outer().new Inner();
        i.show();
    }
}

/*
	格式: 外部类名.内部类名 对象名 = 外部类对象.内部类对象;
*/
```

**一般来说,我们创建内部类,就是不希望该类直接被引用**

可以参照类的形式,为内部类添加一个访问方法

```java
// Outer.java
public class Outer{
    private int num = 10;
    
    private class Inner{
        public void show(){
            System.out.println(num);
        }
    }
    
    public void innerShow() {
        Inner i = new Inner();
        i.show();
    }
}

// InnerDemo.java
public class InnerDemo{
    public static void main(String[] args){
        Outer o = new Outer();
        o.innerShow();
    }
}
```



## 局部内部类

写在外部类的方法里面

```java
// Outer.java
public class Outer{
    private int num = 10;
    
    public void method(){
        class Inner{
            public void show(){
                System.out.println(num);
            }
        }
    }
}
```

局部内部类的调用,需要在外部类的方法中创建这个局部内部类的实例,然后间接调用局部内部类的方法

```java
// Outer.java
public class Outer{
    private int num = 10;
    
    public void method(){
        Class Inner{
            public void show(){
                System.out.println(num);
            }
        }
        
        Inner i = new Inner();
        i.show();
    }
}

// InnerDemo.java
public class InnerDemo{
    public static void main(String[] args){
        Outer o = new Outer();
        o.method();
    }
}
```

## 匿名内部类

```java
new Inter(){
    public void show(){
    	// ...
    }
}
```

本质: 是一个继承了该类或者实现了该接口的子类匿名对象

上面提及继承类或者接口,那么首先得有一个接口

```java
// Inter.java
public interface Inter{
    void show();
}

// Outer.java
// 在Outer类中实现匿名内部类
public class Outer{
    public void method(){
        Inter i = new Inter(){
            @Override
            public void show(){
                System.out.println("匿名内部类");
            }
        };
        i.show();	// 调用重写后的show方法
        i.show();
    }
}

// 测试类: OuterDemo.java
public class OuterDemo{
    public static void main(String[] args){
        Outer o = new Outer();
        o.method();
    }
}
```

### 【小栗子】

```java
// Jumpping.java
public interface Jumpping{
    void jump();
}

// JunmppingOperator.java
public class JumppingOperator{
    public void method(Jumping j){
        j.jump();
    }
}
```

以上有一个接口`Jumping`以及一个接口操作类`JumppingOperator`, 接口中定义的方法是抽象的.因此调用需要使用匿名内部类来实现

```java
// JumppingDemo.java
public class JumppingDemo{
    public static void main(String[] args){
        JumppingOperator jo = new JumppingOperator();
        jo.method(new Jumpping(){
            @Override
            public void jump(){
                System.out.println("猫可以跳高高了");
            }
        })
    }
}
```

# 常用API

## Math

**方法重载**: 方法名相同,方法接收的参数不同
**static**: 修饰的类,可以直接使用类名进行调用

```java
abs(double a);
abs(float a);
abs(int a);
abs(long a);
```

| 方法名                                       | 说明                                          |
| -------------------------------------------- | --------------------------------------------- |
| public static abs(int a)                     | 返回参数的绝对值                              |
| public static double ceil(double a)          | 返回大于或等于                                |
| public static double floor(double a)         | 返回小于或等于参数的最大double值,等于一个整数 |
| public static int round(float a)             | 按照四舍五入返回最接近参数的int               |
| public static int max(int a, int b)          | 返回两个int值中的较大值                       |
| public static int min(int a, int b)          | 返回两个int值中的较小值                       |
| public static double pow(double a, double b) | 返回a的b次幂                                  |
| public static double random()                | 返回值为random的正值,[0.0, 1.0)               |













## System

## Object

## Arrays

## 基本类型包装类

## 日期类





