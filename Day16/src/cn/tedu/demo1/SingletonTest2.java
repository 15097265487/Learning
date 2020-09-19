package cn.tedu.demo1;
/*
单例模式的懒汉式实现
 */

public class SingletonTest2 {
    public static void main(String[] args) {
    Bank b1 = Bank.getInstance();
    Bank b2 = Bank.getInstance();
    System.out.println(b1==b2);
    System.out.println(b1);
    System.out.println(b2);
    }
}
class Bank{
    //1.私有化类的构造器
    private Bank(){

    }
    //2.声明当前类的对象，没有初始化
    //4.此对象必须声明是static
    private static Bank instance = null;
    //3.声明公共的方法，返回当前类的对象
    public static Bank getInstance(){
        if (instance==null) {
            instance = new Bank();
        }
        return instance;
    }
}