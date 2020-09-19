package cn.tedu.exer;

import java.awt.image.RasterFormatException;

public class ComparableCircle extends Circle implements CompareObject{
	public  ComparableCircle(double radius) {//调用父类的
		super(radius);
	}

	@Override
		public int compareTo(Object o) {
			if (o instanceof Circle) {// 如果不进行预判出现ClassCastException
				if (this.getRadius() == ((Circle) o).getRadius()) {
					return 0;
				} else if (this.getRadius() < ((Circle) o).getRadius()) {
					return -1;
				} else{
					return 1;
				}
					//System.out.println("传入的数据部匹配");
			}
			throw new RuntimeException("传入的数据部匹配");
			//return 2;
 
		}
		
	}
	

