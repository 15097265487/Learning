package cn.tedu;

import java.util.Scanner;

public class TriangleTest {

	public static void main(String[] args) {
		System.out.print("�����������");
		Scanner sc = new Scanner(System.in);
		int layer;
		while((layer = sc.nextInt()) !=0) {
			int a[][] = new int[layer][layer];
			//��ÿһ�еĵ�һ������Ϊ1
			for (int i = 0; i < layer; i++) {
				a[i][0] = 1;
			}
			//����һ�е��������ֱ�Ϊ0
			for (int i = 0; i < layer - 1; i++) {
				a[0][i + 1] = 0;
			}
			//�������һ�������������������
			for (int i = 1; i < layer; i++) {
				for (int j = 1; j <= i; j++) {
					a[i][j] = a[i - 1][j] + a[i - 1][j - 1];
				}
			}
			//��ӡͼ��
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
