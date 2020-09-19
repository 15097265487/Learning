package cn.tedu.demo;

import cn.tedu.demo.InnerClassTest.Dog;

//import cn.tedu.demo.InnerClassTest.Cat;

public class Test {

	public static void main(String[] args) {
		//1.创建静态成员内部类的实例
		//Cat c = new Cat();//导包
		//InnerClassTest.Cat c1 = new Cat();导包
		InnerClassTest.Cat c2 = new InnerClassTest.Cat();//不导包
		
		//2.创建非静态成员内部类的实例,Dog
		//Dog d = new Dog();//错误的
		//InnerClassTest.Dog d1 = new Dog();//错误的
		//InnerClassTest.Dog d2 = new InnerClassTest.Dog();//错误的
		
		InnerClassTest w = new InnerClassTest();//外部内的对象
		InnerClassTest.Dog d = w.new Dog();
		Dog d1 = w.new Dog();
		
		//错误的
		//c2.eat();不可以访问
		//c2.sleep();
		//d.eat();
		//d.sleep();
		//正确的
		c2.info();
		d.show();
		d1.display("哈哈");

	}

}
