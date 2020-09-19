package cn.tedu.exer;

public class Cylinder extends Circle{
	private double length;//圆柱的高
	//构造器
	public Cylinder() {
		length=1;//初始值声明
	}
	public Cylinder(double length) {
		this.length = length;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	//圆柱的体积
	public double findVolume() {
		return super.findArea()*length;
	}
	//圆柱的表面积
	public double findArea() {
		System.out.println("子");
		return 2*super.findArea()+this.length*(2*Math.PI*this.getRadius());
	}
	@Override
	public void show() {
		System.out.println("123");
	}
	
	
	
	

}
