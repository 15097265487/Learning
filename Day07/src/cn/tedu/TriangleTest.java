package cn.tedu;

import java.util.Scanner;

public class TriangleTest {

	public static void main(String[] args) {
		System.out.print("请输入层数：");
		Scanner sc = new Scanner(System.in);
		int layer;
		while((layer = sc.nextInt()) !=0) {
			int a[][] = new int[layer][layer];
			//让每一行的第一个数字为1
			for (int i = 0; i < layer; i++) {
				a[i][0] = 1;
			}
			//将第一行的其它数字变为0
			for (int i = 0; i < layer - 1; i++) {
				a[0][i + 1] = 0;
			}
			//计算除第一个数字外的其他的数字
			for (int i = 1; i < layer; i++) {
				for (int j = 1; j <= i; j++) {
					a[i][j] = a[i - 1][j] + a[i - 1][j - 1];
				}
			}
			//打印图样
			for (int i = 0; i < layer; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(" " + a[i][j]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
