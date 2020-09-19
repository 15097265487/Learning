package cn.tedu.test;

public class MyRectangle extends GeometriceObjest{
	//属性
	private double width;//宽
	private double height;//长
	
	//构造方法
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
	//计算矩形面积
	public double findArea() {
		return width*height;
	}
	
	

}
