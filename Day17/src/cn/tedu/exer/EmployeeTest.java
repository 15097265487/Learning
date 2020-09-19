package cn.tedu.exer;

public class EmployeeTest {
	public static void main(String[] args) {
		CommonEmployee c = new CommonEmployee();
		c.work();
		String s1 = c.toString();
		System.out.println(s1);
		Manager m1 = new Manager("уехЩ",10001,10000,1000.0);
		m1.work();
		String s = m1.toString();
		System.out.println(s);
		Employee m2 = new CommonEmployee();
		m2.work();
		
		
	}

}
