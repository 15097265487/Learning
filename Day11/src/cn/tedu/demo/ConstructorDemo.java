package cn.tedu.demo;

public class ConstructorDemo {
	/*
	 * ��ĳ�Ա֮���췽�������췽����
	 * Constructor
	 * һ�������������
	 * 	1����������
	 * 	2����ʼ��������Ϣ
	 * ������ʽ
	 * 	��������������һ��
	 * 	Ȩ�����η�      ����(�����б�){
	 * 			}
	 * ����ʹ��
	 * 	1�����û�ж�����Ĺ������Ļ���ϵͳĬ���ṩһ���޲ҵĹ�����
	 * 	2������Ѿ���������Ĺ����������ṩĬ�ϵ��޲ι�����
	 * 	3��һ�����ж����˶�����������˴˹�������
	 * 	4��һ������������һ��
	 * 
	 */

	public static void main(String[] args) {
		//��������ʱ    new+������
		Dog d = new Dog();
		//d.eat();
		d.info();
		Dog d2 = new Dog("С��");
		d2.info();
		Dog d3 = new Dog("С��",2);
		d3.info();
		Dog d4 = new Dog(2);
		d4.info();
	}
}
class Dog{
	//����
	String name;
	int age;
	public Dog(){
		name= "С��";
		age=10;
		System.out.println("Dog()......");
	}
	public Dog(String n) {
		System.out.println("Dog(String)......");
		name = n;
	}
	public Dog(String s,int i) {
		name = s;
		age = i;
	}
	public Dog(int i) {
		age = i;
	}
	
	//����
	public void eat() {
		System.out.println("��");
	}
	public void play() {
		System.out.println("��");
	}
	public void info() {
		System.out.println("name="+name+",\tage="+age);
	}
	
}














