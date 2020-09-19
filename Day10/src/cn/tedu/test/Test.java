package cn.tedu.test;

public class Test {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		method(a,b);
		System.out.println("a ="+a);
		System.out.println("b ="+b);
	}
	static void method(int a, int b) {
		System.out.println("a ="+a*10);
		System.out.println("b ="+b*20);
		System.exit(0);//终止当前运行的java虚拟机
	}

}
