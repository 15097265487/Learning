package cn.tedu.exer;

public class Cricle {
	public static void main(String[] args) {
		Cir c = new Cir(4);//实例化对象
		c.toString();
		System.out.println(c.toString());
	}
}
class Cir{
	private double radius;
	//创建构造器
	public Cir(int n) {
		radius=n;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
//	public double area() {//int类型自动转换为double，设置返回值，返回面积
//		return Math.PI*radius*radius;
//	}

	public String toString() {
		return "求圆的面积： [半径=" + radius + "\t面积="+Math.PI*radius*radius+"]";
	}
}

