package cn.tedu.demo;
import java.util.Random;

//�����⣺��̬�Ǳ���ʱ��Ϊ��������ʱ��Ϊ��           ��̬��ֻҪ�ȵ��������õ���һ�̣������������Ż�ȷ�������õľ��巽�������Ϊ����󶨡���̬��
//֤�����£�                                                                       �����ض��ԣ��ڷ�������֮ǰ���������Ѿ�ȷ���������õķ��������Ϊ��󶨣���̬��
class Animal  {
 
	protected void eat() {
		System.out.println("animal eat food");
	}
}

class Cat  extends Animal  {
	protected void eat() {
		System.out.println("cat eat fish");
	}
}

class Dog  extends Animal  {
	public void eat() {
		System.out.println("Dog eat bone");
	}
}

class Sheep  extends Animal  {
	public void eat() {
		System.out.println("Sheep eat grass");
	}
}

public class InterviewTest {

	public static Animal  getInstance(int key) {
		switch (key) {
		case 0:
			return new Cat ();
		case 1:
			return new Dog ();
		default:
			return new Sheep ();
		}
	}

	public static void main(String[] args) {
		int key = new Random().nextInt(3);

		System.out.println(key);

		Animal  animal = getInstance(key);
		
		animal.eat();
		 
	}
}
