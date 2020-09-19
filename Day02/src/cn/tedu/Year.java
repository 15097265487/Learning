package cn.tedu;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份:");
		int year = sc.nextInt();
		//
		boolean flag = year%4==0 && year%100!=0 || year%400==0;
		//
		String str = flag ? year+"年是润年":year+"年不是闰年";
		System.out.println(str);
		
	}

}
