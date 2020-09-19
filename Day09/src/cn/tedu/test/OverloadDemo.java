package cn.tedu.test;

public class OverloadDemo {
	/*
	 * 方法的重载
	 * 概念：在同一个类中，方法名相同，参数列表不同
	 *特点：与返回值类型无关，访问权限无关，形参名无关
	 */

	public static void main(String[] args) {
		OverloadDemo ov = new OverloadDemo();
		String str = ov.getsum();
		System.out.println(str);
		ov.getsum(0, 0.0);//自动匹配
	}
	//加法运算
	public void getsum(int a,int b) {
		System.out.println("1");
	}
	public void getsum(double a,double b) {
		System.out.println(2);
	}
	public void getsum(String s,int i) {
		System.out.println("3");
	}
	public void getsum(int i,String s) {
		System.out.println("4");
	}
	public String getsum(String s) {
		return "5";
	}
	public String getsum() {
		return "6";
	}
//以下错误
//	public int getsum(int i,int j) {
//		return;
//	}
//	public void getsum(int i,int j) {
//		
//	}
//	private void getsum(int i,int j) {
//		
//	}

}
