package cn.tedu.demo;

public class Person {
	private String name;
	private int age;
	//构造器
	public Person(){
		//age=18;
	}
	public Person(String n,int m) {
		name = n;
		age = m;
	}
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void setAge(int a) {
		if(a>=0 && a<=130) {
			age=a;
		}else {
			System.out.println("数据不合法");
		}
	}
	public int getAge() {
		return age;
	}
	
	
	public void info() {
		System.out.println("name="+name+"\tage="+age);
	}
	

}
