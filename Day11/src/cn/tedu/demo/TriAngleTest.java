package cn.tedu.demo;

public class TriAngleTest {

	public static void main(String[] args) {
		TriAngle t = new TriAngle(20,10);
		//System.out.println(t.getArea());
		t.toString();
		System.out.println(t.toString());
		
		TriAngle t1 =new TriAngle();
		t1.setBase(10);
		t1.setHeight(12);
		double area = t1.Area();
		System.out.println(area);
		

	}

}
