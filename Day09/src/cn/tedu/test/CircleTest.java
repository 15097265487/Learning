package cn.tedu.test;

public class CircleTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.pi=3.14;
		c.radius=5;
		//c.area();
		//��Ӧ��ʽһ
		double area1 = c.getArea();
		System.out.println(area1);
		//��Ӧ��ʽ��
		c.getArea2();
		//��Ӧ��ʽ��------>����
		double area3 = c.getArea3(10);
		System.out.println(area3);

	}

}
