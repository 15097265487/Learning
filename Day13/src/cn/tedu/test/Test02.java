package cn.tedu.test;

public class Test02 {

	public static void main(String[] args) {
		Test t = new Test(1.2);
		double d = t.area();
		System.out.println(d);
		
		Test01 n = new Test01(3.2);
		double area = n.area();
		System.out.println(area);

	}

}
