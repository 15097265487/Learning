package cn.tedu.test;

import java.util.Scanner;

public class Guessing {
	
	/*
	 * ϵͳ�������5���ַ������û����в²Ⲣ��¼�û�ÿ�β¶Ե��ַ������¶�����λ�� ���磺ABCDE���û��²⣺afqwe ��¶��ַ���Ϊ3�����¶�λ����Ϊ1��
	 * Ҫ��
	 *  ��ϵͳ��������ַ�Ҫ�� ��Ϊ��д A-Z �Ҳ����ظ� 
	 *  �ڵ÷ֹ���Ҫ�� �ܷ�500��(һ���ַ�100��) ÿ�´�һ�ο�10��
	 * 	�۵��û�����EXITʱ�˳����� 
	 * 	��������Ҫ�� ��������ܵ÷� �´��ܴ���
	 * 
	 * 1��������ݽṹ������Ӧ��δ洢��
	 * 		���5���ַ�--- cahr[] chs��
	 * 		�û��²�Ľ��--char[] input��
	 * 		�²���------int[] result
	 * 		����---------int score
	 * 		�´����------int count
	 * 2����Ƴ���ṹ��������
	 * 		�������5���ַ��ķ���
	 * 		����������û��²��ַ��Ƚϵķ���
	 * 		������������ɵ���main(){}
	 * 3�����������е���
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Guessing g = new Guessing();
		char[] chs = g.genrerate();
		//System.out.println(g.grerate());
		//g.genrerate();
		int score=500,count=0;
		while(true) {//��ѭ��
			System.out.println("�뿪ʼ�£���");
			String str = sc.next();
			str = str.toUpperCase();//ת��Ϊ��д
			if("EXIT".equals(str)){
				System.out.println("��ӭ�ٴ���ս��");
				break;
			}
			char[] input = str.toCharArray();
			//chs[] input[]�Ƚ�
			int[] result  = g.check(chs,input);
			if(result[1]==chs.length) {//��ȫ��
				System.out.println("��ϲ��¶���");
				System.out.println("һ���´���"+count+"��");
				System.out.println("�ܵ÷֣�"+score+"��");
				break;
			}else {//����
				count++;
				score-=10;
				System.out.println("�ַ��Ե���"+result[0]+",λ�öԵĸ���Ϊ"+result[1]);
				
			}
		}

	}
	/**
	 * ��������ַ���	
	 */
	public char[] genrerate() {
		char[] chs = new char[5];
		//A-Z����ַ���ȡֵ
		char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J','K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V','W', 'X', 'Y', 'Z'};
		boolean[] flags = new boolean[letters.length];
		for(int i=0;i<chs.length;i++) {
			int index;
			//�ж��Ƿ�index������
			do {//��������±�
				index = (int) (Math.random()*26);
			} while (flags[index]==true);
			chs[i] = letters[index];
			flags[index]=true;
		}
		return chs;
	}
	public int[] check(char[] chs,char[] input) {
		//result[0]�ַ���   result[1]λ�ö�
		int[] result = new int[2];
		for(int i=0;i<chs.length;i++) {//��������ַ�����
			for(int j=0;j<input.length;j++) {//
				if(chs[i]==input[j]) {//�ַ���
					result[0]++;//����1
					if(j==j) {//λ�ö�+1
						result[1]++;
					}
					break;
				}
			}
		}
		return result;//����ֵ
	}

}
