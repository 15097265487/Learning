package cn.tedu.test;

public class MyRectangle extends GeometriceObjest{
	//����
	private double width;//��
	private double height;//��
	
	//���췽��
	public MyRectangle(double width, double height,String color,double weight) {
		super(color,weight);
		this.width = width;
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	//����������
	public double findArea() {
		return width*height;
	}
	
	

}
