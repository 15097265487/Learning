package cn.tedu;

import java.util.Scanner;

public class Num {

	public static void main(String[] args) {
		//��ȡ��������
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ�����֣�");
		int m = sc.nextInt();
		System.out.println("����һ�����֣�");
		int n = sc.nextInt();
		//��Ŀ������бȽ��������ִ�С
		int max = (m>n)?m:n;
		int min = (m<n)?n:m;
		System.out.println("-----------");
		//��ȡ���Լ��
		for(int i=min;min>=1;i--) {//����
			if(m%i==0&&n%i==0) {//ȡ��
				System.out.println("���Լ��"+i);
				break;//break�󲻿�д����
			}
		}
		//��ȡ��С������
		for(int i=max;max<=m*n;i++) {//����
			if(i%m==0&&i%n==0) {
				System.out.println("��С������"+i);
				break;
			}
		}

	}

}
