package cn.tedu.demo3;

public class Student extends Person{
	int grade;//�꼶
	int id = 181;//ѧ��

	public Student() {
		super();//���ø�����޲ι���
	}
	public Student(int grade) {
		
	}
	public Student(String name, int age, int grade) {
		this.age=age;
		this.name=name;
		this.grade = grade;
	}
	@Override
	public void eat() {
		System.out.println("ѧ������Է�");
	}
	public void study() {
		System.out.println("ѧϰ!!!");
		this.eat();
		super.eat();
		this.sleep();
		super.sleep();
	}
	public void info() {
		System.out.println("name="+name+",age="+age);
		System.out.println("id"+super.id);
		System.out.println("id"+this.id);
	}
	

}
