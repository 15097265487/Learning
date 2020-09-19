package cn.tedu.test;

public class InterfaceTest1 {
	public static void main(String[] args){
        method(new Student());//匿名对象
        //创建了一个匿名类的对象:p
        Person p=new Person() {
            @Override
            public void eat() {
                System.out.println("吃东西");
            }
        };
		 //创建匿名子类的匿名对象
        method1(new Person() {
            @Override
            public void eat() {
                System.out.println("吃好吃的东西");
            }
        });
        p.eat();
        p.walk();
    }

    public static void method(Student s){

    }

    public static void method1(Person p){
        p.eat();
        p.walk();
    }
}
abstract class Person{
    String name;
    int age;
    public Person(){
    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    //抽象方法
     public abstract void eat();

     public void walk(){
        System.out.println("走路");
    }
}
class Student extends Person{
    public void eat(){
    }
}
