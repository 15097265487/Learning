package cn.tedu.demo3;

public class Student extends Person{
	int grade;//年级
	int id = 181;//学号

	public Student() {
		super();//调用父类的无参构造
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
		System.out.println("学生：多吃饭");
	}
	public void study() {
		System.out.println("学习!!!");
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
