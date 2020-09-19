package cn.tedu.demo;
/**
 * 
 * @author UID-ECD
 *	面向对象之二：继承性
 *	一、继承性的好处：
 *		①减省代码的冗余，提高代码的复用性
 *		②减少代码的扩展
 *		③为了多态的使用，提供了前提
 *	二、继承的格式
 *		首先有子类
 *		class A extends B{
 *
 *		}
 *		A:是子类/派生类 subclass
 *		B:是父类 超类 基类  super class
 *	三、继承性的体现
 *		1.一旦子类A继承父类B之后，就获取了父类的所有属性和方法，特别的，父类中声明为private的属性和方法，子类继承父类以后
 *		任然认为获取了父类中私有的结构。只是受到封装性的影响，使得子类不能直接调用父类
 *		2.一旦子类A继承父类B之后，还可以声明自己特有的属性和方法，实现功能拓展
 *	四、继承性的规定：
 *		1.一个类可以被多个子类继承（一个父亲可以有多个儿子）
 *		2.单继承：一个类只能有一个父类（一个儿子只能有一个父亲）
 *		3.子父类是一个相对的概念
 *		4.子类直接继承的父类称为：直接父类、间接继承的父类称为：间接父类
 *		5.子类继承父类后，则可以获取了直接父类及间接父类中声明的方法和属性
 *		6.如果一个类没有继承任何类，那么它的父类为Object，所有的类（除了Object类）直接继承或间接继承Object类                               java.lang.Object
 *		所有的类都具备Object类声明的功能
 *
 */

public class ExtendsTest {

	public static void main(String[] args) {
		Person p = new Person();
		//p.age=10;age为私有的private，只有在本类中使用，外界不能使用
		p.name="张三";
		p.setAge(40);
		p.eat();
		p.breath();
		System.out.println("--------------------");
		//引用型变量简称  引用
		Student s = new Student();
		s.name="张san";
		s.setAge(10);
		s.id=1;
		System.out.println(s.toString());
		s.breath();//breath()间接父类的行为

	}

}
