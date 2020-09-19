package cn.tedu.exer;

public class CircleTest {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(3.2,new String("white"),1.0);
		Circle c2 = new Circle(2.5,new String("green"),2.0);
		
		System.out.println("ÑÕÉ«µÄÅÐ¶Ï£º"+c1.getColor().equals(c2.getColor()));
		System.out.println("c1:"+ c1.getColor()+"\tc2:"+c2.getColor());
		System.out.println();
		System.out.println("°ë¾¶µÄÅÐ¶Ï£º"+c1.equals(c2));
		System.out.println("c1:"+ c1.getRadius()+"\tc2:"+c2.getRadius());

		System.out.println(c1.toString());

	}
	

}
