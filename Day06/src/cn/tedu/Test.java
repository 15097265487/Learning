package cn.tedu;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������");
		int nu = sc.nextInt();
		int[] arr = new int[nu];
		System.out.println("����"+nu+"λѧ���ĳɼ���");
		// System.out.println(arr);
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			int num = sc.nextInt();
			arr[i] = num;
			//System.out.print(" " + arr[i]);
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.print("\n���ֵ��" + max);
		System.out.println();
		char leve1 = ' ';
		for (int i = 0; i < arr.length; i++) {
			if (max - arr[i] <= 10) {
				leve1 = 'A';
			} else if (max - arr[i] <= 20) {
				leve1 = 'B';
			} else if (max - arr[i] <= 30) {
				leve1 = 'C';
			} else {
				leve1 = 'D';
			}
			System.out.println("Student " + i + " score is  " + arr[i] + " grade id " + leve1);

		}

	}
}
