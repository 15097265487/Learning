package cn.tedu.demo;
import java.util.Random;

//面试题：多态是编译时行为还是运行时行为？           多态，只要等到方法调用的那一刻，解释运行器才会确定做调用的具体方法，这成为“晚绑定”动态绑定
//证明如下：                                                                       对重载而言，在方法调用之前，编译器已经确定了所调用的方法，这称为早绑定，静态绑定
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
