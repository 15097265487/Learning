package cn.tedu.exer;

public class Cylinder extends Circle{
	private double length;//Բ���ĸ�
	//������
	public Cylinder() {
		length=1;//��ʼֵ����
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
	//Բ�������
	public double findVolume() {
		return super.findArea()*length;
	}
	//Բ���ı����
	public double findArea() {
		System.out.println("��");
		return 2*super.findArea()+this.length*(2*Math.PI*this.getRadius());
	}
	@Override
	public void show() {
		System.out.println("123");
	}
	
	
	
	

}