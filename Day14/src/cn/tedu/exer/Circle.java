package cn.tedu.exer;

public class Circle {
	private double radius;//Բ�İ뾶

	
	public Circle() {
		radius=1;//this��ʡ��
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
	//Բ�����
	public double findArea() {
		System.out.println("��");
		return Math.PI*radius*radius;
	}
	public void show() {
		//
		this.findArea();//���������ø÷���ʱ����ʱִ�еķ���������������д�ķ���������ִ�и���ķ���
	}
	

}
