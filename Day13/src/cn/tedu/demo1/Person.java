package cn.tedu.demo1;//��������д

public class Person {
	String name;
	int age;
	
	//���췽��
	public Person() {
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//
	public void eat() {
		
	}
	public void sleep() {
		
	}
	public void walk(int distance) {
		System.out.println("���˾�����"+distance+"����");
		eat();//�����Ѿ���д��
		show();
	}
	private void show() {
		System.out.println("����һ����");
	}
	
	
	

}
