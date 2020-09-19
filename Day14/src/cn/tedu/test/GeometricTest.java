package cn.tedu.test;

public class GeometricTest {

	public static void main(String[] args) {
		GeometricTest t = new GeometricTest();
		Circle c1 = new Circle(2.3,"red",2.0);
		Circle c2 = new Circle(2.3,"red",2.0);
		
		//������ε����
		MyRectangle m1 = new MyRectangle(2.0,3.1,"blue",2.1);
		double d = m1.findArea();
		System.out.println("���ε������"+d);
		
		//ʹ�÷��������Բ�����
		t.displayGeometricObject(c1);
		
		boolean b1 = t.equalsArea(c1, c2);
		boolean b2 = t.equalsArea(c1, m1);
		System.out.println();
		System.out.println(b1);
		System.out.println(b2);
 	}
	//�ж�������������Ƿ����
	public boolean equalsArea(GeometriceObjest o1,GeometriceObjest o2) {
		return o1.findArea()==o2.findArea();
	}
	//��ʾ��������
	public void displayGeometricObject(GeometriceObjest o) {
		System.out.println("Բ�����Ϊ��"+o.findArea());
	}
}

