package cn.tedu.demo1;
/*
    类的成员之四：代码块
        1.代码块的作用：用来初始化类和对象
        2.分类：静态代码块 非静态代码块
        3.只能使用static修饰

        4.静态代码块
            ①内部可以写输出语句，随性和类的加载而执行
            ②如果一个类中定义了多个静态代码块，顺序执行
            ③静态代码块先于非静态代码块执行
            ④静态代码块中，只能调用静态的属性、方法
        5.非静态代码块
            ①内部可以写输出语句，随着对象的创建而执行（new）
            ②如果一个类中定义了多个非静态代码块，顺序执行
            ③非静态代码块中，即能调用静态的属性、方法还可以调用非静态的属性、方法
 */

import java.util.function.DoubleToIntFunction;

public class BlockTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
    }
}
class Person{
    String name;
    int age;
    static String des = "我是一个人";

    public Person() {
        super();
    }
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    //非static代码块
    {
        System.out.println("block 1");
        //调用非静态结构
        name = "";
        toString();
        //调用静态结构
        des = "";
        show();//前面的省略是Person------->Person.show();
    }
    {
        System.out.println("block 11");
    }

    //静态代码块
    static {
        System.out.println("block 2");
        //不可以调用非静态结构


    }
    static {
        System.out.println("block 22");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public static void show(){
        System.out.println("我是人  √");
    }

}
