package cn.tedu;

import java.util.Scanner;

public class Test1 {
	/*
	 * �Ӽ��̶���������嶨�����������ж϶���������͸����ĸ���������Ϊ0ʱ��������
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int positive=0;//��������������������ֵΪ0
		int negative=0;//����
		while(true) {
			System.out.println("��������һ��������");
			int num = sc.nextInt();
			if(num>0) {//�ж��Ƿ�����
				positive++;//�ǵĻ�+1����������ִ��
			}else if(num<0) {//�ж��Ƿ�Ϊ����
				negative++;
			}else {
				break;//��������
			}
		}
		System.out.println("���������ĸ�����"+positive);
		System.out.println("���븺���ĸ�����"+positive);
	}
}
