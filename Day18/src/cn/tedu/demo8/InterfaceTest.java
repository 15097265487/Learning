package cn.tedu.demo8;
/*
 * jdk8�������Զ��徲̬������Ĭ�Ϸ���
 */

public interface InterfaceTest {
	//void m();//public abstract
	//��̬����
	public static void m1() {
		System.out.println("�ӿ��еľ�̬����");
	}
	//Ĭ�Ϸ���
	default void m2() {//public
		System.out.println("�ӿ��е�Ĭ�Ϸ���");
	}
	//void m4();
}
interface InterfaceTest1{
	default void m3() {
		System.out.println("test1��m3");
	}
	public default void m4() {
		System.out.println("SuperClass:m4()");
	}
}
