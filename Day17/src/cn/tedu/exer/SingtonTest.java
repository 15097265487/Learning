package cn.tedu.exer;
/*
 * 	µ¥ÀýÄ£Ê½
 */

public class SingtonTest {

	public static void main(String[] args) {
		Order o1 = Order.o;
		Order o2 = Order.o;
		Order o3 = Order.o;
		System.out.println(o1);
		System.out.println(o1==o3);

	}

}
class Order{
	private Order() {
		
	}
	public static final Order o = new Order();
}