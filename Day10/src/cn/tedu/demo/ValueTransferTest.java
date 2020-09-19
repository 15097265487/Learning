package cn.tedu.demo;

public class ValueTransferTest {
	/*
	 * 基本数据类型
	 * 引用数据类型
	 * 
	 * 如果变量是基本数据类型:此时赋值的是变量所保存数据的值
	 * 如果变量是引用数据类型：此时赋值的是变量所保存的数据的地址值
	 */

	public static void main(String[] args) {
		System.out.println("基本数据类型变量");
		int m = 10;
		int n = 12;
		System.out.println("m="+m+",n+"+n);
		n=89;
		System.out.println("m="+m+",n="+n);
		
		Order o1 = new Order();
		//o1=100;错误
		o1.id=1001;
		Order o2=o1;//赋值后，o1和o2的地址相同，都指向了堆空间中的同一个对象实体
		System.out.println("o1.id="+o1.id+",o2.id="+o2.id);
		o2.id =101;
		System.out.println("o1.id="+o1.id+",o2.id="+o2.id);
		

	}

}
class Order{
	int id;//0
	
}
