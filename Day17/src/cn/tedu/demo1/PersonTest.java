package cn.tedu.demo1;

import java.lang.reflect.Method;

/*
 * 抽象类的匿名类
 */

public class PersonTest {
	public static void main(String[] args) {
		Person p = new worker();
		//worker w = p;向下转型
		method(p);
		//创建了一个非匿名子类的非匿名对象
		worker w = new worker();
		method(w);
		//创建、非匿名子类的匿名对象
		method(new worker()); 
		//创建了一个匿名的子类对象p1
		Person p1 = new Person() {
			@Override
			public void eat() {
				System.out.println("吃东西");
			}
		};
		p1.name = "张三";
		p1.show();
		p1.eat();
		//创建匿名字类的匿名对象
		method(new Person() {
			@Override
			public void eat() {
			}
		});
		
			
		
	}
	public static void method(worker w) {
		System.out.println("1");
	}
	public static void method(Person p) {
		System.out.println("2");
	}

}
abstract class Person{
	String name;

	public Person() {
		super();
	}
	public Person(String name) {
		super();
		this.name = name;
	}
	public abstract void eat();
	public void show() {
		System.out.println("人");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
}
class worker extends Person{

	@Override
	public void eat() {
		System.out.println("吃米饭+肉");
		
	}
	
}