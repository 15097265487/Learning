package cn.tedu.demo;

public class ConstructorDemo {
	/*
	 * 类的成员之构造方法（构造方法）
	 * Constructor
	 * 一、构造起的作用
	 * 	1、创建对象
	 * 	2、初始化对象信息
	 * 二、格式
	 * 	构造器名与类名一致
	 * 	权限修饰符      类名(参数列表){
	 * 			}
	 * 三、使用
	 * 	1、如果没有定义类的构造器的话，系统默认提供一个无惨的构造器
	 * 	2、如果已经定义了类的构造器，则不提供默认的无参构造器
	 * 	3、一个类中定义了多个构造器，彼此构成重载
	 * 	4、一个类中至少有一个
	 * 
	 */

	public static void main(String[] args) {
		//创建对象时    new+构造器
		Dog d = new Dog();
		//d.eat();
		d.info();
		Dog d2 = new Dog("小黄");
		d2.info();
		Dog d3 = new Dog("小黄",2);
		d3.info();
		Dog d4 = new Dog(2);
		d4.info();
	}
}
class Dog{
	//属性
	String name;
	int age;
	public Dog(){
		name= "小花";
		age=10;
		System.out.println("Dog()......");
	}
	public Dog(String n) {
		System.out.println("Dog(String)......");
		name = n;
	}
	public Dog(String s,int i) {
		name = s;
		age = i;
	}
	public Dog(int i) {
		age = i;
	}
	
	//方法
	public void eat() {
		System.out.println("吃");
	}
	public void play() {
		System.out.println("玩");
	}
	public void info() {
		System.out.println("name="+name+",\tage="+age);
	}
	
}














