package cn.tedu.exer;

public class Circle {
	private double radius;//圆的半径

	
	public Circle() {
		radius=1;//this可省了
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	//圆的面积
	public double findArea() {
		System.out.println("父");
		return Math.PI*radius*radius;
	}
	public void show() {
		//
		this.findArea();//子类对象调用该方法时，此时执行的方法体中是子类重写的方法，不会执行父类的方法
	}
	

}
