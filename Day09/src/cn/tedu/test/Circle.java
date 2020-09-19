package cn.tedu.test;

public class Circle {
	double pi = Math.PI;//
	double radius;//半径
	//方法一
	public double getArea() {
		double area = Math.PI*radius*radius;
		return area;
	}
	//方法二
	public void getArea2() {
		double area = Math.PI*radius*radius;
		System.out.println(area);;
	}
	//方法二------>错误
	public double getArea3(double r) {
		return Math.PI*r*r;
	}

	/*public void area() {
		System.out.println("圆的面积："+pi*radius*radius);
		System.out.println("圆的周长："+2*pi*radius);
	}*/
}
