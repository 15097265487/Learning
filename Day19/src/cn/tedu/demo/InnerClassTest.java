package cn.tedu.demo;
/*
 * 类的成员之五：内部类
 * 	1.java中允许将一个类A定义在另一个类B的内部
 * 		则A为内部类   B为外部类
 * 	2.内部类分类：
 * 		成员内部类（静态 非静态） vs
 * 		局部内部类（方法内、代码块内、构造器内） 
 * 	3.成员内部类：
 * 		一方面：作为外部类的成员
 * 			>调用外部类的结构
 * 			>可以被static修饰
 * 			>可以被四种访问权限修饰符修饰
 * 		另一方面：作为一个类
 * 			>类里可以定义属性，方法、构造器等
 * 			>可以被final修饰，不能被继承
 * 			>可以被abstract修饰
 * 	4.如何实例化成员内部类的对象
 * 	  	InnerClassTest.Cat c2 = new InnerClassTest.Cat();//不导包
 * 	  	InnerClassTest w = new InnerClassTest();//外部内的对象
 *    	InnerClassTest.Dog d = w.new Dog();
 * 	     如何在成员内部类中区分调用外部类的结构
 * 	  	this.name   内部类属性
 * 	  	InnerClassTest.this.name  外部类属性
 * 	     开发中局部内部类的使用
 */

import cn.tedu.demo.InnerClassTest.Dog;

public class InnerClassTest {
	public static void main(String[] args) {
		//创建静态成员内部类的实例
		Cat c  = new Cat();
	
		
	}
	String name = "大黄";
	int age;
	static int id;
	public void eat() {
		System.out.println("吃饭");
	}
	public static void sleep() {
		System.out.println("睡觉");
	}
	//非静态成员内部类
	class Dog{
		String name = "小黄";
		int age;
		//static int id;声明静态属性需要把类设置成static的
		public void show() {
			//name = " ";//非静态属性
			eat();
			sleep();
			id = 1;
		}
		public Dog() {//构造
		}
		public void display(String name) {
			System.out.println(name);//传进来的形参形参
			System.out.println(this.name);//内部类
			
			System.out.println(InnerClassTest.this.name);//外部属性
			
		}
	}
	//静态成员内部类
	static class Cat{//public private 抽象  final 缺省  protected都可以
		String name;
		int age;
		int id;
		//非静态方法
			public void info() {
				//name = " ";静态的类里面调用静态的属性
				id = 12;
				//eat();静态不可以调用非静态
				sleep();
				System.out.println("猫");
			}
			
			{}//代码块
			static {}//静态代码块
			public void display(String name) {
				System.out.println(name);//传进来的形参形参
				System.out.println(this.name);//内部类
				
				System.out.println(InnerClassTest.id);//外部属性
				
			}
	}
	
	//局部内部类
	public void m() {
		class AA{
			
		}
	}
	//代码块内部类
	{
		class AA{
			
		}
	}
	//构造器内部类
	public InnerClassTest() {
		class BB{
			
		}
	}
}
