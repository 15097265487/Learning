package cn.tedu;

import java.util.Scanner;

public class score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入分数:");
		int num = sc.nextInt();
		if(num==100) {
			System.out.println("BMW");
		}else if(num<=99&&num>80) {
			System.out.println("iphone xs max");
		}else if(num<80&&num>=60) {
			System.out.println("iPad");
		}else {
			System.out.println("啥也没有");
		}
	}
}
