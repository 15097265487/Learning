package cn.tedu.demo;
/*
 * 	final:最终的
 * 	1.final可以修饰：类、方法、变量（局部变量和成员变量）
 * 	2.final修饰类：
 * 		不能被其他类继承
 * 		String System StringBuffer
 * 	3.final修饰方法：
 * 		用final修饰的方法不能被重写
 * 		Object中getClass
 * 	4.final修饰变量：（变成常量）
 * 		4.1属性(成员变量)：
 * 			可以赋值的位置有三个：
 * 			显示初始化、代码块、构造器中初始化
 * 			只能用一种进行赋值
 * 		4.2局部变量：
 * 			方法体内、方法的形参
 * 			当修饰方法的形参时，表示此形参是一个常量不可修改
 * 			当我们调用此方时，给这个常量形参，一旦赋值之后不可更改，就只能在次方法中使用，但是不能进行重新赋值
 * 
 * 	static final用来修饰属性：全局变量
 * 			
 */

public class FinalTest {
	final int a;
	//final int a=10;//必须赋值
	final int UP=0;
	final int DOWN;
	final int LEFT;
	final int RIGHT;
	//代码块
	{
		a=10;
		DOWN=1;
	}
	//构造器
	public FinalTest() {
		LEFT = 2;
		RIGHT = 1;
	}
	public FinalTest(int i) {
		LEFT = i;
		RIGHT = i;
	}
//	public void setDown(){
//		RIGHT = 4;
//	}方法中不可以
	
	public void show1() {
		final int NUM; //常量不可修改      必须赋值
		NUM = 1;
//		NUM+=10;
//		NUM++;    不可以进行设置
		System.out.println(NUM);
	}
	public void show2(final int a) {
		//final int a = xxx;
		//a=100;对其进行初始化操作，编译错误
		System.out.println(a);
	}

}
class A{
	public final void A() {
		
	}
}
class B extends A{
//	public void A() {
//		
//	}用final修饰的方法不能被重写
}
final class FinalA extends FinalTest{
	static int a;
	int b;
	public static void A() {
		
	}
	public void B() {
		
	}
}
////class B extends FinalA{}