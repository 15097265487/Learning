package cn.tedu.test;

public class Circle {
	double pi = Math.PI;//
	double radius;//�뾶
	//����һ
	public double getArea() {
		double area = Math.PI*radius*radius;
		return area;
	}
	//������
	public void getArea2() {
		double area = Math.PI*radius*radius;
		System.out.println(area);;
	}
	//������------>����
	public double getArea3(double r) {
		return Math.PI*r*r;
	}

	/*public void area() {
		System.out.println("Բ�������"+pi*radius*radius);
		System.out.println("Բ���ܳ���"+2*pi*radius);
	}*/
}
