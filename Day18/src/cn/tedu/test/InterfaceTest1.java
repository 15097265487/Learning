package cn.tedu.test;

public class InterfaceTest1 {
	public static void main(String[] args){
        method(new Student());//��������
        //������һ��������Ķ���:p
        Person p=new Person() {
            @Override
            public void eat() {
                System.out.println("�Զ���");
            }
        };
		 //���������������������
        method1(new Person() {
            @Override
            public void eat() {
                System.out.println("�ԺóԵĶ���");
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
    //���󷽷�
     public abstract void eat();

     public void walk(){
        System.out.println("��·");
    }
}
class Student extends Person{
    public void eat(){
    }
}
