package cn.tedu;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入狗的年龄:");
		int age = sc.nextInt();
		if(age>=0&&age<=2) {
			System.out.println("相当于人的年龄的："+age);
		}else if(age>2){
			System.out.println("相当于人的年龄的"+(2*10.5+(age-2)*4)+"岁");
		}else {
			System.out.println("这只狗还没出生");
		}
		
	}

}
