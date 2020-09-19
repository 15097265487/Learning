package cn.tedu.demo;

public class AnimalTest {

	public static void main(String[] args) {
		//创建类的对象，实例化类
		//instance
		
		
		Animal an = new Animal();
		an.info();//null 0 0
		an.setLegs(4);
		an.info();//小花  1 4
		System.out.println(an.getLegs());
		an.setLegs(-1);
		//an.info();
		an.setLegs(4);
		an.setName("小花");
		an.setAge(5);
		an.info();
		System.out.println(an.getName());
		System.out.println(an.getAge());
		System.out.println(an.getLegs());
		Animal an1 = new Animal("小胡",18,2);
		an1.info();
	}

}
