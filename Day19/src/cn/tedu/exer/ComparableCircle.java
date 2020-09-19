package cn.tedu.exer;

import java.awt.image.RasterFormatException;

public class ComparableCircle extends Circle implements CompareObject{
	public  ComparableCircle(double radius) {//���ø����
		super(radius);
	}

	@Override
		public int compareTo(Object o) {
			if (o instanceof Circle) {// ���������Ԥ�г���ClassCastException
				if (this.getRadius() == ((Circle) o).getRadius()) {
					return 0;
				} else if (this.getRadius() < ((Circle) o).getRadius()) {
					return -1;
				} else{
					return 1;
				}
					//System.out.println("��������ݲ�ƥ��");
			}
			throw new RuntimeException("��������ݲ�ƥ��");
			//return 2;
 
		}
		
	}
	

