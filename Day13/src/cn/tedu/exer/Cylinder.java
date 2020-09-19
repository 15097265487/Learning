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
		return findArea()*length;
	}
	
	
	
	

}
