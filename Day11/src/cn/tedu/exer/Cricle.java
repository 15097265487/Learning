package cn.tedu.exer;

public class Cricle {
	public static void main(String[] args) {
		Cir c = new Cir(4);//ʵ��������
		c.toString();
		System.out.println(c.toString());
	}
}
class Cir{
	private double radius;
	//����������
	public Cir(int n) {
		radius=n;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
//	public double area() {//int�����Զ�ת��Ϊdouble�����÷���ֵ���������
//		return Math.PI*radius*radius;
//	}

	public String toString() {
		return "��Բ������� [�뾶=" + radius + "\t���="+Math.PI*radius*radius+"]";
	}
}

