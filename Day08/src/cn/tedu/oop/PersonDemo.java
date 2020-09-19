package cn.tedu.oop;

public class PersonDemo {
	/*
	 * 一、设计类 设计类的成员
	 * 	属性   成员变量   field  （ 域，字段）
	 * 	方法 成员方法  method  函数   
	 * 	创建类的对象=类的实例化=实例化类
	 * 二、类和对象的使用（）
	 * 	1、创建类 设计类的成员
	 * 	2、创建类的对象
	 * 	3、通过"对象名.属性"对象名.方法名调用对象的属性方法
	 *三、如果创建一个类的多个对象则每个对象都独立的拥一套类的属性
	 *	意味着：如果修改了一个对象的属性a则不影响另一个对象的属性值a的值
	 */

	public static void main(String[] args) {
		//2、创建类的对象
		Person p1 = new Person();
		//3、调用对象的结构：属性   方法
		//3.1、调用属性“对象名.属性”
		System.out.println(p1.name);
		p1.name="Tom";
		p1.isMale=false;
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.isMale);
		//3.2、调用方法：“方法名”
		p1.eat();
		p1.sleep();
		p1.play("篮球");
		//****************************************
		Person p2 = new Person();
		System.out.println(p2.isMale);//false
		Person p3=p1;
		System.out.println(p3.name);
		
		
		p3.age=10;
		p1.age=16;
		System.out.println(p1.age);
		System.out.println(p3.age);
		
		p2=p1;
		System.out.println(p1.age);
		System.out.println(p1==p2);//地址相同
	}
}
//1、创建类，设计类的成员
class Person{
	//属性  成员变量
	String name;
	int age=1;
	boolean isMale;
	//方法
	public void eat() {
		System.out.println("人可以吃饭");
	}
	public void sleep() {
		System.out.println("人可以睡觉");
	}
	public void play(String project) {
		System.out.println("玩"+project);
	}
}
