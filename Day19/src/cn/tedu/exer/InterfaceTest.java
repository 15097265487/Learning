package cn.tedu.exer;

public class InterfaceTest {

	public static void main(String[] args) {
		ComparableCircle co1 = new ComparableCircle(9.4);
		ComparableCircle co2 = new ComparableCircle(12.0);
		int a = co1.compareTo(co2);
		System.out.println(a);
//		switch(a) {
//		case 0:
//			System.out.println("���");
//			break;
//		case 1:
//			System.out.println("����");
//			break;
//		case -1:
//			System.out.println("С��");
//			break;
//		}
		a = co1.compareTo("");
		System.out.println(a);

	}

}
