package cn.tedu;

import java.util.Scanner;

public class CharDeno {
	/*
	 * 转换a,b,c,d,e
	 * 使用switch把小写的char类型转换成大写
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入字母：");
		String str = sc.next();
		char c = str.charAt(0);
		switch(c) {
		case 'a':
			System.out.println("A");
			break;
		case 'b':
			System.out.println("B");
			break;
		case 'c':
			System.out.println("C");
			break;
		case 'd':
			System.out.println("D");
			break;
		case 'e':
			System.out.println("E");
			break;
			default:
				System.out.println("other");
		}

		//System.out.println("over");

	}

}
