package cn.tedu.exer;

public class Circle extends GeometricObject{
	private double radius;

	public Circle() {
		super();
		radius=1.0;
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
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
	//面积
	public double findArea() {
		return Math.PI*radius*radius;
	}
	//重写equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}
	//重写toString
	@Override
	public String toString() {
		return "半径 [radius=" + radius + "]";
	}
	
	
	

}
