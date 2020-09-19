package cn.tedu.test;

public class Test01 extends Test{
	private double id;

	
	public Test01() {
	}

	public Test01(double id) {
		this.id = id;
	}
	public double area() {
		return super.area()*id;
	}
	
	

}
