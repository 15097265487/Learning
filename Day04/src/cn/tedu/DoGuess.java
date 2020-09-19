package cn.tedu;

import java.util.Scanner;

public class DoGuess {

	public static void main(String[] args) {
		//获取随机数1-100
		int value = (int)(Math.random()*100+1);
		//获取键盘输入
		Scanner sc = new Scanner(System.in);
		int count=0;
		do {
			System.out.println("请输入一个两位数：");
			int num = sc.nextInt();
			//输入数字与随机数进行比较
			if(num<value) {
				System.out.println("猜小了");
				count++;
				//输入数字与随机数进行比较
			}else if(num > value) {
				System.out.println("猜大了");
				count++;
			}else {
				System.out.println("恭喜你猜对了");
				//停止程序
				count++;
				
				break;
			}
			
		} while (true);
		System.out.println("你总共猜的次数:"+count);
	}
}

