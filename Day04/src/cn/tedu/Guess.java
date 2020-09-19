package cn.tedu;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		//产生随机数
		int value = (int)(Math.random()*100+1);
		//定义次数
		int count=0;
		//while循环
		while (true) {//布尔表达式
		//键盘输入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入1-100之间的一个数字：");
		int num = sc.nextInt();
				if(num < value) {
					System.out.println("猜小了");
					count++;
				}else if(num > value) {
					System.out.println("猜大了");
					count++;
				}else {
					System.out.println("恭喜你猜对了");
					count++;
					//停止程序
					break;
				}  
			}
		System.out.println("你总共猜的次数:"+count);
		}
}
