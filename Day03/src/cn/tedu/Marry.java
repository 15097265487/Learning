package cn.tedu;

import java.util.Scanner;//导包  ctrl+shift+o

public class Marry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的身高：(cm)");
		int height = sc.nextInt();
		System.out.println("请输入你的财富：(千万)");
		double money  = sc.nextDouble();
		/*System.out.println("帅否：(true/false)");
		boolean f = sc.nextBoolean();
		if(height>=180&&money>1&&f) {//f布尔类型
			System.out.println("我一定嫁给他！！！");
		}else if(height>180 || money>=1 ||f) {
			System.out.println("嫁吧！比上不足，比下有余");
		}else {
			System.out.println("死也不嫁！");
		}*/
		System.out.println("帅否：(是/否)");
		String ishandsome = sc.next();
		if(height>=180&&money>=1&&ishandsome.equals("是")) {//--->"是".equeals(ishandsome)
			System.out.println("我一定嫁给他！！！");
		}else if(height>=180 || money>=1 ||ishandsome.equals("是")) {
			System.out.println("嫁吧！比上不足，比下有余");
		}else {
			System.out.println("死也不嫁！");
		}
	}
}
