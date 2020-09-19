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
	public double findArea() {
		return Math.PI*radius*radius;
	}
	

}
