package cn.tedu;

import java.util.Scanner;

public class Guess1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("你猜");
		int guess = sc.nextInt();
		int num = (int)(Math.random()*100+1);
		int count=0;
		for(guess=1;guess!=num;guess=sc.nextInt()) {
			if(guess>num) {
				System.out.println("大了朋友");
				count++;
			}else if(guess<num) {
				System.out.println("小了朋友");
				count++;
			}
		}
		System.out.println("恭喜你猜中了");
		count++;
		System.out.println("你总共猜的次数:"+count);
	}

}
