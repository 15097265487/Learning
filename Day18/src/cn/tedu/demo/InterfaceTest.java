package cn.tedu.demo;
/**
 * 接口的使用：
 * 	1.接口使用interface来定义
 * 	2.java中，接口和类是两个并列的结构
 * 	3.如何定义接口，定义接口中的成员
 * 		interface 接口名{}
 * 		3.1 jdk7之前，只能定义全局的常量和抽象的方法
 * 		>全局常量：public static final的默认有
 * 				但是书写的时候可以不写
 * 		>抽象方法：public abstract的，不写默认也是有的,              接口中的方法都只抽象的
 * 		
 * 		jdk8：还可以定义静态方法、默认方法
 * 	4.接口中是不可以定义构造器的！意味着接口不可以被实例化
 * 	5.java中接口通过让类实现（implements）的方式去使用。
 * 		如果实现类覆盖了接口中所有的抽象方法，则此实现类可以实例化。
 * 		如果实现类没有覆盖了接口中所有的抽象方法，则此实现类仍为抽象类。
 * 	6.java类可以实现多个接口（弥补了java单继承的局限性）。class A extends B implements C,D,E{}
 * 	7.接口与接口之间可以继承，而且还可以多继承的
 * 
 * 	8.接口的使用体现了多态性，
 * 	9.接口实际上还可以看做是一种规范，
 */

public class InterfaceTest {
	public static void main(String[] args) {
		Plane p = new Plane();
		System.out.println(p.b);
		System.out.println(Flyable.b);//
		System.out.println(Plane.a3);
		System.out.println(Bullet.a4);
		p.fly();
		
		Flyable f = new Bullet();
		
		
		
		
		
		
	}

}
interface Flyable{
	//全局静态常量
	public static final int a = 0;
	public static int a1 = 1;
	public final int a2 = 2;
	public  int a3 = 3;
	int a4 = 4;
	int b = 6;
	//抽象方法
	public abstract void fly();
	public void f();
	void stop();
	//构造器，接口中不能有构造器
	//public Flyable() {}
}
interface Attackable{
	void Attack();//抽象方法
}
class Plane implements Flyable{

	@Override
	public void fly() {
		System.out.println("飞机");
	}
	@Override
	public void f() {
		System.out.println("");
	}
	@Override
	public void stop() {
		System.out.println("驾驶员减速");
	}
}
class Bullet implements Flyable,Attackable{

	@Override
	public void Attack() {
	}
	@Override
	public void fly() {
	}
	@Override
	public void f() {
	}
	@Override
	public void stop() {
		
	}
	
}
/************************************************/
//第一种设置成抽象类abstract
class A extends Object implements D{

	@Override
	public void method1() {}
	@Override
	public void method3() {}
	
//	//第二种
//	@Override
//	public void method1() {
//	}
//	@Override
//	public void method2() {
//	}
//	@Override
//	public void method3() {
//	}


	
}
interface B{
	void method1();
}
interface C{
	void method3();
}
interface D extends B,C{//接口可以多继承
	void method3();
}
