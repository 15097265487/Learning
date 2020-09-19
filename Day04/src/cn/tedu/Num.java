package cn.tedu;

import java.util.Scanner;

public class Num {

	public static void main(String[] args) {
		//获取键盘输入
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个数字：");
		int m = sc.nextInt();
		System.out.println("输入一个数字：");
		int n = sc.nextInt();
		//三目运算进行比较两个数字大小
		int max = (m>n)?m:n;
		int min = (m<n)?n:m;
		System.out.println("-----------");
		//获取最大公约数
		for(int i=min;min>=1;i--) {//遍历
			if(m%i==0&&n%i==0) {//取余
				System.out.println("最大公约数"+i);
				break;//break后不可写代码
			}
		}
		//获取最小公倍数
		for(int i=max;max<=m*n;i++) {//遍历
			if(i%m==0&&i%n==0) {
				System.out.println("最小公倍数"+i);
				break;
			}
		}

	}

}
