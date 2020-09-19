package cn.tedu.test;

public class CircleTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.pi=3.14;
		c.radius=5;
		//c.area();
		//对应方式一
		double area1 = c.getArea();
		System.out.println(area1);
		//对应方式二
		c.getArea2();
		//对应方式三------>错误
		double area3 = c.getArea3(10);
		System.out.println(area3);

	}

}
