package cn.tedu.demo;

import cn.tedu.demo.InnerClassTest.Dog;

//import cn.tedu.demo.InnerClassTest.Cat;

public class Test {

	public static void main(String[] args) {
		//1.������̬��Ա�ڲ����ʵ��
		//Cat c = new Cat();//����
		//InnerClassTest.Cat c1 = new Cat();����
		InnerClassTest.Cat c2 = new InnerClassTest.Cat();//������
		
		//2.�����Ǿ�̬��Ա�ڲ����ʵ��,Dog
		//Dog d = new Dog();//�����
		//InnerClassTest.Dog d1 = new Dog();//�����
		//InnerClassTest.Dog d2 = new InnerClassTest.Dog();//�����
		
		InnerClassTest w = new InnerClassTest();//�ⲿ�ڵĶ���
		InnerClassTest.Dog d = w.new Dog();
		Dog d1 = w.new Dog();
		
		//�����
		//c2.eat();�����Է���
		//c2.sleep();
		//d.eat();
		//d.sleep();
		//��ȷ��
		c2.info();
		d.show();
		d1.display("����");

	}

}
