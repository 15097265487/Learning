package cn.tedu;

import java.util.Scanner;

public class DoGuess {

	public static void main(String[] args) {
		//��ȡ�����1-100
		int value = (int)(Math.random()*100+1);
		//��ȡ��������
		Scanner sc = new Scanner(System.in);
		int count=0;
		do {
			System.out.println("������һ����λ����");
			int num = sc.nextInt();
			//������������������бȽ�
			if(num<value) {
				System.out.println("��С��");
				count++;
				//������������������бȽ�
			}else if(num > value) {
				System.out.println("�´���");
				count++;
			}else {
				System.out.println("��ϲ��¶���");
				//ֹͣ����
				count++;
				
				break;
			}
			
		} while (true);
		System.out.println("���ܹ��µĴ���:"+count);
	}
}

