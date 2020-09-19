package cn.tedu.demo;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "TOM";
		p1.age =18;
		p1.sex =1;
		
		p1.study();//studuing
		p1.showAge();//18
		int newAge = p1.addAge(2);
		System.out.println(newAge);
		System.out.println(p1.age);
		//非static    新建一个/改变一个对其他的没有影响
		Person p2 = new Person();
		System.out.println(p2.age);//0
		p2.addAge(10);
		p2.showAge();//10

	}

}
