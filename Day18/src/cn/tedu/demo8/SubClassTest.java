package cn.tedu.demo8;

public class SubClassTest {
	public static void main(String[] args) {
		SubClass s = new SubClass();
		// s.m1;
		// SubClass.m1;
		// 1.接口中定义的静态方法，只能通过接口来调用
		InterfaceTest.m1();
		// 2.通过实现类的对象，可以调用接口中的默认方法，
		// a.如果实现类重写了接口中的默认方法，调用重写后的方法
		s.m2();
		// 3.
		s.m3();
		// 4.类优先原则
		s.m4();

	}

}

class SubClass extends SuperClass implements InterfaceTest, InterfaceTest1 {
	@Override
	public void m3() {
		// InterfaceTest1.super.m3();
		System.out.println("SubClass:m3()");
	}

	@Override
	public void m2() {
		System.out.println("SubClass:m2()");
	}
}