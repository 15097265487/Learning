package cn.tedu;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		//���������
		int value = (int)(Math.random()*100+1);
		//�������
		int count=0;
		//whileѭ��
		while (true) {//�������ʽ
		//��������
		Scanner sc = new Scanner(System.in);
		System.out.println("������1-100֮���һ�����֣�");
		int num = sc.nextInt();
				if(num < value) {
					System.out.println("��С��");
					count++;
				}else if(num > value) {
					System.out.println("�´���");
					count++;
				}else {
					System.out.println("��ϲ��¶���");
					count++;
					//ֹͣ����
					break;
				}  
			}
		System.out.println("���ܹ��µĴ���:"+count);
		}
}
