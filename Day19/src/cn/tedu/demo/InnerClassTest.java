package cn.tedu.demo;
/*
 * ��ĳ�Ա֮�壺�ڲ���
 * 	1.java������һ����A��������һ����B���ڲ�
 * 		��AΪ�ڲ���   BΪ�ⲿ��
 * 	2.�ڲ�����ࣺ
 * 		��Ա�ڲ��ࣨ��̬ �Ǿ�̬�� vs
 * 		�ֲ��ڲ��ࣨ�����ڡ�������ڡ��������ڣ� 
 * 	3.��Ա�ڲ��ࣺ
 * 		һ���棺��Ϊ�ⲿ��ĳ�Ա
 * 			>�����ⲿ��Ľṹ
 * 			>���Ա�static����
 * 			>���Ա����ַ���Ȩ�����η�����
 * 		��һ���棺��Ϊһ����
 * 			>������Զ������ԣ���������������
 * 			>���Ա�final���Σ����ܱ��̳�
 * 			>���Ա�abstract����
 * 	4.���ʵ������Ա�ڲ���Ķ���
 * 	  	InnerClassTest.Cat c2 = new InnerClassTest.Cat();//������
 * 	  	InnerClassTest w = new InnerClassTest();//�ⲿ�ڵĶ���
 *    	InnerClassTest.Dog d = w.new Dog();
 * 	     ����ڳ�Ա�ڲ��������ֵ����ⲿ��Ľṹ
 * 	  	this.name   �ڲ�������
 * 	  	InnerClassTest.this.name  �ⲿ������
 * 	     �����оֲ��ڲ����ʹ��
 */

import cn.tedu.demo.InnerClassTest.Dog;

public class InnerClassTest {
	public static void main(String[] args) {
		//������̬��Ա�ڲ����ʵ��
		Cat c  = new Cat();
	
		
	}
	String name = "���";
	int age;
	static int id;
	public void eat() {
		System.out.println("�Է�");
	}
	public static void sleep() {
		System.out.println("˯��");
	}
	//�Ǿ�̬��Ա�ڲ���
	class Dog{
		String name = "С��";
		int age;
		//static int id;������̬������Ҫ�������ó�static��
		public void show() {
			//name = " ";//�Ǿ�̬����
			eat();
			sleep();
			id = 1;
		}
		public Dog() {//����
		}
		public void display(String name) {
			System.out.println(name);//���������β��β�
			System.out.println(this.name);//�ڲ���
			
			System.out.println(InnerClassTest.this.name);//�ⲿ����
			
		}
	}
	//��̬��Ա�ڲ���
	static class Cat{//public private ����  final ȱʡ  protected������
		String name;
		int age;
		int id;
		//�Ǿ�̬����
			public void info() {
				//name = " ";��̬����������þ�̬������
				id = 12;
				//eat();��̬�����Ե��÷Ǿ�̬
				sleep();
				System.out.println("è");
			}
			
			{}//�����
			static {}//��̬�����
			public void display(String name) {
				System.out.println(name);//���������β��β�
				System.out.println(this.name);//�ڲ���
				
				System.out.println(InnerClassTest.id);//�ⲿ����
				
			}
	}
	
	//�ֲ��ڲ���
	public void m() {
		class AA{
			
		}
	}
	//������ڲ���
	{
		class AA{
			
		}
	}
	//�������ڲ���
	public InnerClassTest() {
		class BB{
			
		}
	}
}
