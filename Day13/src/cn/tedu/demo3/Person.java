package cn.tedu.demo3;

public class Person {
	//����
	String name;
	int id=62400000;//���֤
	int age;
	
	//���췽��
	public Person() {
		System.out.println("Person()...........");
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(name).......");
	}
	public void eat() {
		System.out.println("��");
	}
	public void sleep() {
		System.out.println("˯��");
	}
	
	
	

}
