package cn.tedu.demo;

public class ValueTransferTest3 {
	/*
	 * 如果方法的参数是引用数据类型，此时实参赋给形参的是，存储数据的地址值
	 */

	public static void main(String[] args) {
		Date d = new Date();
		d.m=10;
		d.n=80;
		System.out.println("m="+d.m+",n="+d.n);
		
		//交换两个数的值
//		int temp = d.m;
//		d.m=d.n;
//		d.n=temp;
		//对应方式一
		ValueTransferTest3 v = new ValueTransferTest3();
		v.swap(d);
		System.out.println("m="+d.m+",n="+d.n);
		//对应方式二
		d.swap();
		System.out.println("m="+d.m+",n="+d.n);
		
		//方式二错误演示
		Date d0 = new Date();//新建空间
		d0.swap();
		System.out.println("m="+d0.m+",n="+d0.n);

	}
	//方式一
	public void swap(Date d) {
		int temp = d.m;
		d.m=d.n;
		d.n=temp;
	}
}
class Date{
	int m ;
	int n ;
	//方式二
	public void swap() {
		int temp =m;
		m=n;
		n=temp;
	}
	
	
}