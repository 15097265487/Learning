package cn.tedu;

import java.util.Scanner;

public class DailyExam05 {

	public static void main(String[] args) {
		/*
		 * ��ӡ	******
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
		 * 1000���ڵ�����������һ����ǡ�õ�����������֮��.....
		 * ���ӣ���ȥ��������������Լ��
		 */
		
		for(int i=1;i<1000;i++) {
			int sum=0;
			//i%j==0 j<i
			for(int j=1;j<i;j++) {
				if(i%j==0) {//������Լ��
					sum+=j;//����֮��
					
				}
			}
			if(i==sum) {//����
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		int score = 0,result=0,add=0;

		//������ӷ�������
		/*
		 * ����
		 * ����
		 * ����
		 * for
		 * 	ѭ�����������
		 * 			��ʼ����1
		 * 			������i<11
		 * 			����������ѭ�������ĸı䣩��i++
		 * 			ѭ���壺
		 * 				����
		 * 				����
		 * 				����
		 */
		for(int i=1;i<11;i++) {
			//�ӷ�
			int a = (int)(Math.random()*101);
			int b = (int)(Math.random()*101);
			
			System.out.println("("+i+")"+":"+a+"+"+b+"="+"?");
			int input = sc.nextInt();
			result = a+b;
			if(input==-1) {
				System.out.println("��ӭ�´δ���");
				break;
			}else if(result==input) {
				System.out.println("��ϲ��ԣ�");
				score+=10;
				add++;
			}else if(result!=input) {
				System.out.println("�𰸴���");
			}else {
				break;
			}
		}
		System.out.println("��ԣ�"+add);
		System.out.println("������"+score);
	}
}
