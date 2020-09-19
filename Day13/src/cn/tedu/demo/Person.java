package cn.tedu.demo;

public class Person extends SuperClass{
	//ÊôĞÔ
	String name;
	private int age;
	//¹¹ÔìÆ÷
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
		System.out.println("³Ô·¹");
	}
	public void sleep() {
		System.out.println("Ë¯¾õ");
	}

}
