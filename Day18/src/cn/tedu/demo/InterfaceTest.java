package cn.tedu.demo;
/**
 * �ӿڵ�ʹ�ã�
 * 	1.�ӿ�ʹ��interface������
 * 	2.java�У��ӿں������������еĽṹ
 * 	3.��ζ���ӿڣ�����ӿ��еĳ�Ա
 * 		interface �ӿ���{}
 * 		3.1 jdk7֮ǰ��ֻ�ܶ���ȫ�ֵĳ����ͳ���ķ���
 * 		>ȫ�ֳ�����public static final��Ĭ����
 * 				������д��ʱ����Բ�д
 * 		>���󷽷���public abstract�ģ���дĬ��Ҳ���е�,              �ӿ��еķ�����ֻ�����
 * 		
 * 		jdk8�������Զ��徲̬������Ĭ�Ϸ���
 * 	4.�ӿ����ǲ����Զ��幹�����ģ���ζ�Žӿڲ����Ա�ʵ����
 * 	5.java�нӿ�ͨ������ʵ�֣�implements���ķ�ʽȥʹ�á�
 * 		���ʵ���า���˽ӿ������еĳ��󷽷������ʵ�������ʵ������
 * 		���ʵ����û�и����˽ӿ������еĳ��󷽷������ʵ������Ϊ�����ࡣ
 * 	6.java�����ʵ�ֶ���ӿڣ��ֲ���java���̳еľ����ԣ���class A extends B implements C,D,E{}
 * 	7.�ӿ���ӿ�֮����Լ̳У����һ����Զ�̳е�
 * 
 * 	8.�ӿڵ�ʹ�������˶�̬�ԣ�
 * 	9.�ӿ�ʵ���ϻ����Կ�����һ�ֹ淶��
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
	//ȫ�־�̬����
	public static final int a = 0;
	public static int a1 = 1;
	public final int a2 = 2;
	public  int a3 = 3;
	int a4 = 4;
	int b = 6;
	//���󷽷�
	public abstract void fly();
	public void f();
	void stop();
	//���������ӿ��в����й�����
	//public Flyable() {}
}
interface Attackable{
	void Attack();//���󷽷�
}
class Plane implements Flyable{

	@Override
	public void fly() {
		System.out.println("�ɻ�");
	}
	@Override
	public void f() {
		System.out.println("");
	}
	@Override
	public void stop() {
		System.out.println("��ʻԱ����");
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
//��һ�����óɳ�����abstract
class A extends Object implements D{

	@Override
	public void method1() {}
	@Override
	public void method3() {}
	
//	//�ڶ���
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
interface D extends B,C{//�ӿڿ��Զ�̳�
	void method3();
}
