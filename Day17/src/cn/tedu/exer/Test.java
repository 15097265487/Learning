package cn.tedu.exer;

public class Test{
	public static void main(String[] args) {
		A a = new B();
		a.m1();
		a.m2();
		//a.m3();
	}
}

abstract  class A {
	
	abstract void m1();
	public void m2() {
		System.out.println("A���ж����m2����");
	}
	private void m3() {
		System.out.println("private");
	}
}
class B extends A{
	void m1() {
		System.out.println("B���ж����m1����");
	}
	private void m3() {
		System.out.println("private");
	}
}
