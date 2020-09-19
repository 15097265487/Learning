package cn.tedu.demo;
/*
static 关键字的使用
    1.static：静态的
    2.static：可以修饰：属性 方法 代码块 内部类
    3.使用static修饰属性：（变量：成员变量  局部变量）属性：是否有static修饰
                            静态属性VS非静态属性
                         非静态（类变量）
                            我们创建多个类变量时，多个对象同时公用同一个静态属性时，会导致其他的对象调用静态属性时得到的是修改后的结果。
                         非静态属性(实例变量)
                  我们创建多个类变量时，每个对象都拥有一套类中的非静态属性，当修改其中一个对象的非静态属性时，对其他的对象没有影响
                  不会修改其他对象的非静态属性值
     3.1.使用说明
        ①静态变量是随着类的加载而加载的，可以通过（类名.静态变量）的方式来调用，
        ②静态变量的加载早于对象的创建
        ③由于类的加载只会加载一次，则静态变量在内存中只会存放一份，存在方法区的静态域中。
                  类变量        实例对象
      类     yes             no
      对象   yes             no
        static不可以修饰局部变量
     3.2.静态属性举例
        System.out,Math.PI
    4.static修饰方法，静态方法
        ①静态方法是随着类的加载而加载，可以通过“类.静态方法”的方式进行调用
        ②            静态方法        非静态方法
              类     yes             no
              对象   yes             yes
        ③方法之间的调用
            静态方法中，只能调用静态的属性和方法。（不可以调用非静态的方法、属性）
            非静态的方法即可以调用静态的方法、属性也可以调用非静态的属性和方法
    5.static
        静态方法中，不可以使用this、super关键字

    6.开发中，如何确定一个属性是static
        属性可以是被对象所共享的，不会随对象的不同而不同
        常量
    6.开发中，如何确定一个方法是static
        操作静态属性时通常设置为static的
        工具类中的方法，习惯上声明为static
            例如：Arrays Math Collections

 */

public class StaticTest {
    public static void main(String[] args) {
        Chinese c1 = new Chinese();
        c1.name="终南山";
        c1.age=85;
        c1.nation = "CHINA";
        Chinese c2 = new Chinese();
        c1.name="终南山";
        c1.age=85;
        c2.nation = "CN";
        System.out.println(c1.nation);//无论改成谁，只执行最后一次的设置
        System.out.println(c2.nation);
        System.out.println("-------------");
        Chinese.nation = "中国";
        System.out.println(c1.nation);
        System.out.println(c2.nation);
        System.out.println("-------------");
        Chinese.show();
        c1.show();
        c2.show();
        System.out.println("-------------");
        //Chinese.eat();编译错误
        //Chinese.age;


    }
}
class Chinese{
    String name;
    int age;
    static String nation;
    public void eat(){
        System.out.println("吃中餐");
        //非静态的方法可以调用静态的方法、属性
        show();
        age=10;
        toString();
    }
    public static void s(){}
    public static void show(){
        System.out.println("中国人");
        s();//静态方法，
        nation=" ";//静态属性，类实例
        //age=1;静态方法中不可以调用非静态的属性
        //eat();静态方法中不可以调用非静态的方法
    }

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}