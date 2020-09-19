package practice;

import java.util.Scanner;
public class Add {
	public static void main(String[] args) {
		//获取键盘输入
		Scanner sc = new Scanner(System.in);
		//定义分数变量
		int score=0;
		//定义次数变量
		int sum=0;
		for(int i=1;i<=10;i++) {//循环10次跳出循环
			//获取2个随机数1-100之内的
			int num1 = (int)(Math.random()*100);
			int num2 = (int)(Math.random()*100);
			//打印两个数相加的式子
			System.out.println(i+":"+num1+"+"+num2+"="+"?");
			int result=num1+num2;
			System.out.println("输入答案：");
			int n = sc.nextInt();
			if(n==result) {//判断输入结果和两个随机数之和是否相等
				System.out.println("答案正确！");
				score+=10;//回答正确分数+10
				sum++;//正确次数
			}else if(n!=result) {
				System.out.println("答案错误！");
				continue;
			}else {
				break;//结束循环
			}
		}
		System.out.println("答对了："+sum+"道题");
		System.out.println("总分："+score);	
	}
}
