package cn.tedu.demo1;
/*
单例模式之饿汉式
    饿汉式：
        坏处:对象加载时间过长
        好处：默认线程是安全的
    懒汉式：
        好处：延迟对象的创建
        目前的写法的坏处是不安全的（多线程时做修改）
单例模式的饿汉式实现

 */

public class SingletonTest1 {
    public static void main(String[] args) {
        Order o1 = Order.getInstance();
        Order o2 = Order.getInstance();
        System.out.println(o1==o2);

    }
}
class Order{
    //1.私有的构造器
    private Order(){

    }
    //2.  声明静态的类的对象
    private static Order instance = new Order();

    //3.提供公共的静态的方法方法，返回当前类的对象
    public static Order getInstance(){
        return instance;
    }
}
