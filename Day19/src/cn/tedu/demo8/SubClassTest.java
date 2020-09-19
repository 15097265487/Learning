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
		// 3.如果实现类实现了多个接口，而这个接口中定义了同名同参的方法，那么实现类没有重写此方法的情况下，报错----->接口冲突
		//   那么需要实现类重写这个方法
		s.m3();
		// 4.类优先原则：如果实现类实现了多个接口，且这个接口中有同名同参的默认方法，继承父类中也有和接口中一样的方法，
		//   那么子类在没有重写此方法的情况下，默认调用的是父类中的同名同参的方法
		s.m4();
		s.test();
		

	}

}

class SubClass extends SuperClass implements InterfaceTest, InterfaceTest1 {
	@Override
	public void m3() {
		// InterfaceTest1.super.m3();
		System.out.println("SubClass:m3()");
	}
	/*
	 * (non-Javadoc)
	 * @see cn.tedu.demo8.InterfaceTest#m2()
	 * 5.子类中去调用父类，接口中被重写的方法
	 */

	@Override
	public void m2() {
		System.out.println("SubClass:m2()");
	}
	public void test() {
		m3();//调用的是自己的重写的方法
		m4();
		super.m4();//调用父类的m4方法    super
		//调用接口中的默认方法
		InterfaceTest.super.m3();
		InterfaceTest.super.m2();
	}
}