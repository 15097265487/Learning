package cn.tedu.demo;

public class Student extends Person{
	//name age est() sleep()
	int id;//ѧ��
	 
	public Student() {
		
	}
	public Student(String name,int id,int age) {
		this.name=name;
		this.id = id;
		//this.age=age;
		setAge(age);
	}
	public void study() {
		System.out.println("ѧϰ");
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + getAge() + "]";
	}
	
	
}
