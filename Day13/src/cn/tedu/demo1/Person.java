package cn.tedu.demo1;//方法的重写

public class Person {
	String name;
	int age;
	
	//构造方法
	public Person() {
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//
	public void eat() {
		
	}
	public void sleep() {
		
	}
	public void walk(int distance) {
		System.out.println("走了距离是"+distance+"公里");
		eat();//子类已经重写过
		show();
	}
	private void show() {
		System.out.println("我是一个人");
	}
	
	
	

}
