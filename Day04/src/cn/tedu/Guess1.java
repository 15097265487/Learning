package cn.tedu;

import java.util.Scanner;

public class Guess1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���");
		int guess = sc.nextInt();
		int num = (int)(Math.random()*100+1);
		int count=0;
		for(guess=1;guess!=num;guess=sc.nextInt()) {
			if(guess>num) {
				System.out.println("��������");
				count++;
			}else if(guess<num) {
				System.out.println("С������");
				count++;
			}
		}
		System.out.println("��ϲ�������");
		count++;
		System.out.println("���ܹ��µĴ���:"+count);
	}

}
