package cn.tedu.demo;

public class ValueTransferTest2 {
	/*
	 * 方法之间的形参的传递机制：值传递
	 * 	形参：方法定义时，声明在小括号里面（）的参数
	 * 	实参：方法调用时，实际传递给形参的数据
	 * 	值传递机制：
	 * 		如果方法的参数是基本数据类型，此时实参赋给形参的是，实参真实的数据值，
	 * 		如果方法的参数是引用数据类型，此时实参赋给形参的是，存储数据的地址值
	 */

	public static void main(String[] args) {
		int m = 10;
		int n = 100;
		System.out.println("m="+m+",n="+n);
		ValueTransferTest2 v = new ValueTransferTest2();
		v.swap(m, n);
		
		System.out.println("m="+m+",n="+n);

	}
	public void swap(int m,int n) {
		int temp = m;
		m = n;
		n=temp;
	}

}
