package cn.tedu.demo;
/*
 * 	final:���յ�
 * 	1.final�������Σ��ࡢ�������������ֲ������ͳ�Ա������
 * 	2.final�����ࣺ
 * 		���ܱ�������̳�
 * 		String System StringBuffer
 * 	3.final���η�����
 * 		��final���εķ������ܱ���д
 * 		Object��getClass
 * 	4.final���α���������ɳ�����
 * 		4.1����(��Ա����)��
 * 			���Ը�ֵ��λ����������
 * 			��ʾ��ʼ��������顢�������г�ʼ��
 * 			ֻ����һ�ֽ��и�ֵ
 * 		4.2�ֲ�������
 * 			�������ڡ��������β�
 * 			�����η������β�ʱ����ʾ���β���һ�����������޸�
 * 			�����ǵ��ô˷�ʱ������������βΣ�һ����ֵ֮�󲻿ɸ��ģ���ֻ���ڴη�����ʹ�ã����ǲ��ܽ������¸�ֵ
 * 
 * 	static final�����������ԣ�ȫ�ֱ���
 * 			
 */

public class FinalTest {
	final int a;
	//final int a=10;//���븳ֵ
	final int UP=0;
	final int DOWN;
	final int LEFT;
	final int RIGHT;
	//�����
	{
		a=10;
		DOWN=1;
	}
	//������
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
//	}�����в�����
	
	public void show1() {
		final int NUM; //���������޸�      ���븳ֵ
		NUM = 1;
//		NUM+=10;
//		NUM++;    �����Խ�������
		System.out.println(NUM);
	}
	public void show2(final int a) {
		//final int a = xxx;
		//a=100;������г�ʼ���������������
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
//	}��final���εķ������ܱ���д
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