package cn.tedu.test;

public class Circle extends GeometriceObjest{
	//����
	private double radius;//�뾶

	//���췽��
	public Circle(double radius,String color,double weight) {
		super(color,weight);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	//����Բ�����
	public double findArea() {
		return Math.PI*radius*radius;
	}
	
	

}
