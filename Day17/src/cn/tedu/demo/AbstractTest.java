package cn.tedu.demo;
/*
 * 	abstract:�ؼ��ֵ�ʹ��
 * 		1.abstract:�����
 * 		2.abstract:�����������εĽṹ���ࡢ����
 * 		3.abstract�����ࣺ������
 * 			�����಻����ʵ����
 * 			��������Ա��̳У�
 * 			������Ҳ���Լ̳�������
 * 			��������һ���й���������������ʵ����ʱ����
 * 			����ʱ�������ṩ��������࣬���������ʵ���������ز���
 * 		4.abstract���η��������󷽷�
 * 			���󷽷�ֻ�з�����������û�з����壨�����ţ�
 * 			���󷽷�һ���ڳ�����
 * 			�������󷽷����࣬һ���ǳ����࣬
 * 			�������������û�г��󷽷�
 * 			��������д�˸��������еĳ��󷽷���������Ϳ��Ա�ʵ����
 * 			������û����д������е����г��󷽷�������Ҳ��һ�������࣬����Ҫabstract����
 * 
 * 	ע�⣺
 * 		abstract�������������ԡ����췽��
 * 		abstract�����������ξ�̬������˽�з�����final����
 * 
 * 
 * 
 * 		��static���εķ��������Ա���д
 * 		 private���εķ���Ҳ�����Ա���д
 * 		 final���εķ���Ҳ�����Ա���д
 * 		 final���ε��಻�ܱ��̳�                       
 * 		 static��private��������������
 * 
 * 		��
 */

public class AbstractTest{
	public static void main(String[] args) {
		//һ��Animal������࣬�Ͳ�����ʵ����
		//Animal a1 = new Animal();
		Creatrue c1 = new Creatrue();
		Dog d1 = new Dog();
		
		//Creatrue c2 = new Animal() {
		Creatrue c2 = new Dog();
		Animal a2 = new Dog();
		System.out.println(a2);
		
		}
	}


class Creatrue{}
abstract class Animal extends Creatrue{
	String name;
	int age;
	
	public Animal() {
		super();
	}
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public abstract void eat();
		//System.out.println("��");
	
	public void show() {
		System.out.println("����");
	}
}
class Dog extends Animal{//���Ա��̳�
	public Dog() {
		
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
}
abstract class Cat extends Animal{
	
}
