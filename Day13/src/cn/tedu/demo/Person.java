package cn.tedu.demo;

public class Person extends SuperClass{
	//����
	String name;
	private int age;
	//������
	public Person() {
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void eat() {
		System.out.println("�Է�");
	}
	public void sleep() {
		System.out.println("˯��");
	}

}
