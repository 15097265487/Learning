package cn.tedu.demo1;

public class Student extends Person{
	int id;//ѧ��

	public Student() {
	}
	public Student(int id) {
		this.id = id;
	}
	public void study() {
		System.out.println("ѧϰ");
	}
	//�Ը����е�eat������������д������
	public void eat() {
		System.out.println("ѧ��Ӧ�ö����Ӫ����ʳ��");
	}
	public void walk1(int distance) {
		System.out.println("������");
	}
	public void show() {
		System.out.println("����һ��ѧ��");
	}

	
	

}
