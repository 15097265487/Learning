package cn.tedu.demo;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
		//p.setAge(10);
		p.info();
		System.out.print(p.getAge());
		Person p1 = new Person("ะกร๗",18);
		p1.info();
		System.out.println(p1.getAge()+" ,"+p1.getName());


	}

}
