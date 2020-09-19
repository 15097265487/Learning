package cn.tedu.demo;
/*
 * 	abstract:关键字的使用
 * 		1.abstract:抽象的
 * 		2.abstract:可以用来修饰的结构。类、方法
 * 		3.abstract修饰类：抽象类
 * 			抽象类不可以实例化
 * 			抽象类可以被继承，
 * 			抽象类也可以继承其他类
 * 			抽象类中一定有构造器，便于子类实例化时调用
 * 			开发时，都会提供抽象的子类，让子类对象实例化完成相关操作
 * 		4.abstract修饰方法：抽象方法
 * 			抽象方法只有方法的声明，没有方法体（大括号）
 * 			抽象方法一定在抽象里
 * 			包含抽象方法的类，一定是抽象类，
 * 			抽象类里面可以没有抽象方法
 * 			若子类重写了父亲中所有的抽象方法，此子类就可以被实例化
 * 			若子类没有重写父类的中的所有抽象方法，此子也是一个抽象类，则需要abstract修饰
 * 
 * 	注意：
 * 		abstract不可以修饰属性、构造方法
 * 		abstract不能用来修饰静态方法、私有方法、final方法
 * 
 * 
 * 
 * 		（static修饰的方法不可以被重写
 * 		 private修饰的方法也不可以被重写
 * 		 final修饰的方法也不可以被重写
 * 		 final修饰的类不能被继承                       
 * 		 static、private不能用来修饰类
 * 
 * 		）
 */

public class AbstractTest{
	public static void main(String[] args) {
		//一旦Animal类抽象类，就不可以实例化
		//Animal a1 = new Animal();
		Creatrue c1 = new Creatrue();
		Dog d1 = new Dog();
		
		//Creatrue c2 = new Animal() {
		Creatrue c2 = new Dog();
		Animal a2 = new Dog();
		System.out.println(a2);
		
		}
	}


class Creatrue{}
abstract class Animal extends Creatrue{
	String name;
	int age;
	
	public Animal() {
		super();
	}
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public abstract void eat();
		//System.out.println("吃");
	
	public void show() {
		System.out.println("动物");
	}
}
class Dog extends Animal{//可以被继承
	public Dog() {
		
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
}
abstract class Cat extends Animal{
	
}
