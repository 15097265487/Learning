package cn.tedu;

import java.util.Scanner;

public class Test1 {
	/*
	 * 从键盘读入格数不清定的整数，并判断读入的正数和负数的个数，输入为0时结束程序
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int positive=0;//定义正数个数变量，赋值为0
		int negative=0;//负数
		while(true) {
			System.out.println("键盘输入一个整数：");
			int num = sc.nextInt();
			if(num>0) {//判断是否正数
				positive++;//是的话+1，不是往下执行
			}else if(num<0) {//判断是否为负数
				negative++;
			}else {
				break;//结束程序
			}
		}
		System.out.println("输入正数的个数："+positive);
		System.out.println("输入负数的个数："+positive);
	}
}
