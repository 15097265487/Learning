package cn.tedu.demo;
/*
 * this关键字使用
 * 1.this可以用来修饰、调用属性、方法、构造器
 * 2.this修饰属性 方法
 * 		this理解为：
 * 		当前的对象 或 当前正在创建的对象
 * 	2.1 在类的方法中，通过如下方式调用对象的属性和方法
 * 		this.属性
 * 		this.方法
 * 	 
 * 	......
 * 3.this调用构造器	
 * 		this(参数列表)
 * 		
 */
public class ThisTest {
	public static void main(String[] args) {
		Cort p = new Cort("",1);
		System.out.println("over");
	}
}
class Cort{
	private String name;
	private int age;
	//constructor getter setter toString
	public Cort(String name, int age) {
		this();
		this.name = name;
		this.age = age;
	}
	public Cort() {
		System.out.println("123");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public void eat() {
		System.out.println("吃");
		this.sleep();
	}
	public void sleep() {
		System.out.println("睡");
	}
	
	
}