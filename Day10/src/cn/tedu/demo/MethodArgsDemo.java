package cn.tedu.demo;

public class MethodArgsDemo {
	/*
	 * 可变个数形参的方法，
	 * 	1.JDK5.0新增
	 * 	2.格式：数据类型...变量名
	 * 	3.当调用可变个数形参的方法时，可以传入的参数个数是0到多个
	 * 	4.可变个数形参的方法与本类中的方法名相同，形参不同的方法名
	 * 	5.可变个数形参的方法与奔雷方法名相同，形参类型也相同的数组之间不构成重载
	 * 	6.可变方法形参在方法中只能有一个可变形参
	 * 	7.可变个数形参在方法形参中，可变形参必须声明在末尾
	 * 
	 */

	public static void main(String[] args) {
		MethodArgsDemo me = new MethodArgsDemo();
		me.show("1","2");

	}
	public void show(int i) {
		
	}
	public void show(String s ) {
		System.out.println("Show(string)");
	}
	public void show(String...strs) {
		System.out.println("show(String...strs)");
		for(int i=0;i<strs.length;i++) {
			System.out.println(strs[i]+" ");
		}
		System.out.println();
	}
	//不能与上个方法同时存在
//	public void show(String[] s ) {
//		System.out.println("Show(string)");
//	}


}
