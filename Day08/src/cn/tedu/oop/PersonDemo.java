package cn.tedu.oop;

public class PersonDemo {
	/*
	 * һ������� �����ĳ�Ա
	 * 	����   ��Ա����   field  �� ���ֶΣ�
	 * 	���� ��Ա����  method  ����   
	 * 	������Ķ���=���ʵ����=ʵ������
	 * ������Ͷ����ʹ�ã���
	 * 	1�������� �����ĳ�Ա
	 * 	2��������Ķ���
	 * 	3��ͨ��"������.����"������.���������ö�������Է���
	 *�����������һ����Ķ��������ÿ�����󶼶�����ӵһ���������
	 *	��ζ�ţ�����޸���һ�����������a��Ӱ����һ�����������ֵa��ֵ
	 */

	public static void main(String[] args) {
		//2��������Ķ���
		Person p1 = new Person();
		//3�����ö���Ľṹ������   ����
		//3.1���������ԡ�������.���ԡ�
		System.out.println(p1.name);
		p1.name="Tom";
		p1.isMale=false;
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.isMale);
		//3.2�����÷���������������
		p1.eat();
		p1.sleep();
		p1.play("����");
		//****************************************
		Person p2 = new Person();
		System.out.println(p2.isMale);//false
		Person p3=p1;
		System.out.println(p3.name);
		
		
		p3.age=10;
		p1.age=16;
		System.out.println(p1.age);
		System.out.println(p3.age);
		
		p2=p1;
		System.out.println(p1.age);
		System.out.println(p1==p2);//��ַ��ͬ
	}
}
//1�������࣬�����ĳ�Ա
class Person{
	//����  ��Ա����
	String name;
	int age=1;
	boolean isMale;
	//����
	public void eat() {
		System.out.println("�˿��ԳԷ�");
	}
	public void sleep() {
		System.out.println("�˿���˯��");
	}
	public void play(String project) {
		System.out.println("��"+project);
	}
}
