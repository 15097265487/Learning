package cn.tedu.exer;

public class CircleTest {

	public static void main(String[] args) {
		//�������󣬽��뾶��ʼֵ��Ϊ1
		Circle c = new Circle();
		double area = c.findArea();
		System.err.println(area);
		
		//�������󣬽��뾶��ʼֵ��Ϊ1 
		Cylinder c1 = new Cylinder();
		double d = c1.findArea();
		double volume = c1.findVolume();
		System.out.println(d+"\n"+volume);

	}

}
