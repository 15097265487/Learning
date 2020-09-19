package cn.tedu.demo1;

public class Student extends Person{
	int id;//学号

	public Student() {
	}
	public Student(int id) {
		this.id = id;
	}
	public void study() {
		System.out.println("学习");
	}
	//对父类中的eat（）进行了重写、覆盖
	public void eat() {
		System.out.println("学生应该多吃有营养的食物");
	}
	public void walk1(int distance) {
		System.out.println("杠着有");
	}
	public void show() {
		System.out.println("我是一个学生");
	}

	
	

}
