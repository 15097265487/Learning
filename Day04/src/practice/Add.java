package practice;

import java.util.Scanner;
public class Add {
	public static void main(String[] args) {
		//��ȡ��������
		Scanner sc = new Scanner(System.in);
		//�����������
		int score=0;
		//�����������
		int sum=0;
		for(int i=1;i<=10;i++) {//ѭ��10������ѭ��
			//��ȡ2�������1-100֮�ڵ�
			int num1 = (int)(Math.random()*100);
			int num2 = (int)(Math.random()*100);
			//��ӡ��������ӵ�ʽ��
			System.out.println(i+":"+num1+"+"+num2+"="+"?");
			int result=num1+num2;
			System.out.println("����𰸣�");
			int n = sc.nextInt();
			if(n==result) {//�ж������������������֮���Ƿ����
				System.out.println("����ȷ��");
				score+=10;//�ش���ȷ����+10
				sum++;//��ȷ����
			}else if(n!=result) {
				System.out.println("�𰸴���");
				continue;
			}else {
				break;//����ѭ��
			}
		}
		System.out.println("����ˣ�"+sum+"����");
		System.out.println("�ܷ֣�"+score);	
	}
}
