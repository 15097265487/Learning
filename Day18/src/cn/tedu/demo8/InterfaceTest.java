package cn.tedu.demo8;
/*
 * jdk8：还可以定义静态方法、默认方法
 */

public interface InterfaceTest {
	//void m();//public abstract
	//静态方法
	public static void m1() {
		System.out.println("接口中的静态方法");
	}
	//默认方法
	default void m2() {//public
		System.out.println("接口中的默认方法");
	}
	//void m4();
}
interface InterfaceTest1{
	default void m3() {
		System.out.println("test1：m3");
	}
	public default void m4() {
		System.out.println("SuperClass:m4()");
	}
}
