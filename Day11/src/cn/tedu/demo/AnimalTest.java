package cn.tedu.demo;

public class AnimalTest {

	public static void main(String[] args) {
		//������Ķ���ʵ������
		//instance
		
		
		Animal an = new Animal();
		an.info();//null 0 0
		an.setLegs(4);
		an.info();//С��  1 4
		System.out.println(an.getLegs());
		an.setLegs(-1);
		//an.info();
		an.setLegs(4);
		an.setName("С��");
		an.setAge(5);
		an.info();
		System.out.println(an.getName());
		System.out.println(an.getAge());
		System.out.println(an.getLegs());
		Animal an1 = new Animal("С��",18,2);
		an1.info();
	}

}
