package cn.tedu;

import java.util.Scanner;

public class DailyExam05 {

	public static void main(String[] args) {
		/*
		 * 打印	******
            *****
            ****	
            ***	
            **
            *
		 */
		for(int i=1;i<7;i++) {
			for(int j=1;j<=7-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<6;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int a=1;a<=2*i-1;a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * 1000以内的所有完数，一个数恰好等于它的因子之和.....
		 * 因子：除去这个数本身的其他约数
		 */
		
		for(int i=1;i<1000;i++) {
			int sum=0;
			//i%j==0 j<i
			for(int j=1;j<i;j++) {
				if(i%j==0) {//是他的约数
					sum+=j;//因子之和
					
				}
			}
			if(i==sum) {//完数
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		int score = 0,result=0,add=0;

		//随机数加法运算器
		/*
		 * 出题
		 * 答题
		 * 判题
		 * for
		 * 	循环变量：题号
		 * 			初始化：1
		 * 			条件：i<11
		 * 			迭代条件（循环变量的改变）：i++
		 * 			循环体：
		 * 				出题
		 * 				答题
		 * 				判题
		 */
		for(int i=1;i<11;i++) {
			//加法
			int a = (int)(Math.random()*101);
			int b = (int)(Math.random()*101);
			
			System.out.println("("+i+")"+":"+a+"+"+b+"="+"?");
			int input = sc.nextInt();
			result = a+b;
			if(input==-1) {
				System.out.println("欢迎下次答题");
				break;
			}else if(result==input) {
				System.out.println("恭喜答对！");
				score+=10;
				add++;
			}else if(result!=input) {
				System.out.println("答案错误！");
			}else {
				break;
			}
		}
		System.out.println("答对："+add);
		System.out.println("分数："+score);
	}
}
