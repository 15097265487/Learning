package cn.tedu.demo1;

import java.lang.reflect.Method;

/*
 * �������������
 */

public class PersonTest {
	public static void main(String[] args) {
		Person p = new worker();
		//worker w = p;����ת��
		method(p);
		//������һ������������ķ���������
		worker w = new worker();
		method(w);
		//�������������������������
		method(new worker()); 
		//������һ���������������p1
		Person p1 = new Person() {
			@Override
			public void eat() {
				System.out.println("�Զ���");
			}
		};
		p1.name = "����";
		p1.show();
		p1.eat();
		//���������������������
		method(new Person() {
			@Override
			public void eat() {
			}
		});
		
			
		
	}
	public static void method(worker w) {
		System.out.println("1");
	}
	public static void method(Person p) {
		System.out.println("2");
	}

}
abstract class Person{
	String name;

	public Person() {
		super();
	}
	public Person(String name) {
		super();
		this.name = name;
	}
	public abstract void eat();
	public void show() {
		System.out.println("��");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
}
class worker extends Person{

	@Override
	public void eat() {
		System.out.println("���׷�+��");
		
	}
	
}