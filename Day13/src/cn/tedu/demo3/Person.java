package cn.tedu.demo3;

public class Person {
	//属性
	String name;
	int id=62400000;//身份证
	int age;
	
	//构造方法
	public Person() {
		System.out.println("Person()...........");
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(name).......");
	}
	public void eat() {
		System.out.println("吃");
	}
	public void sleep() {
		System.out.println("睡觉");
	}
	
	
	

}
