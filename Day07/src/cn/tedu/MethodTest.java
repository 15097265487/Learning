package cn.tedu;

import java.util.Scanner;

public class MethodTest {

	public static void main(String[] args) {
		/*
		 * ϵͳ�������5���ַ������û����в²Ⲣ��¼�û�ÿ�β¶Ե��ַ������¶�����λ�� ���磺ABCDE���û��²⣺afqwe ��¶��ַ���Ϊ3�����¶�λ����Ϊ1��
		 * Ҫ��
		 *  ��ϵͳ��������ַ�Ҫ�� ��Ϊ��д A-Z �Ҳ����ظ� 
		 *  �ڵ÷ֹ���Ҫ�� �ܷ�500��(һ���ַ�100��) ÿ�´�һ�ο�10��
		 * 	�۵��û�����EXITʱ�˳����� 
		 * 	��������Ҫ�� ��������ܵ÷� �´��ܴ���
		 */
		// ��ȡ��������
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ�µ�5����ĸ��");
		int n=sc.nextInt();
		int count = 0;
		char[] ch = letter(n);
		//System.out.println(ch);�������������ַ�
		while(true) {
			/*String s = sc.next().trim().toUpperCase();
			char[] input = s.toCharArray(); */
			String s = sc.next();
			char[] guess = convert(s);
			//�Ƚ�����Ͳ���
			int[] num = input(ch, guess);
			int score = 500-count*10;
			if(s.equals("EXIT")) {
				System.out.println("�˳�");
				break;
			}
			if(score<=0) {
				score=0;
			}
			if(num[1]==ch.length) {
				System.out.println("��ϲ�㣡�¶��ˣ���ĵ÷��ǣ�"+score);
				break;
			}else {
				count++;
				System.out.println("��¶�"+num[0]+"���ַ�������"+num[1]+"���ַ���λ����ȷ���ܴ���="+count);
				break;
			}
		}
	}
	//������Ĳ���
	public static char[] letter(int n){
	// ����5λ�����д��ĸ���ж��ַ��Ƿ��ظ�
		char[] c = new char[5];
		for (int i = 0; i < c.length; i++) {
			c[i] = (char) ('A' + Math.random() * 26);
		// i ��λ�ú� i ǰ��ÿһ��λ���ж�һ����û���ظ�
			for (int j = 0; j < i; j++) {
				if (c[i] == c[j]) {
					i--;// �ó�����ԭ��λ���ظ�������ĸ
					break;
					}
				}
			}
			return c;
		}
	//�Ƚ�������ַ��Ͳ������ַ��Ƿ�һ��
	public static int[] input(char[] ran,char[] guess) {
		int[] num = new int[2];
		for(int i=0;i<ran.length;i++) {
			for(int j=0;j<guess.length;j++) {
				if(ran[i]==guess[j]) {
					num[0]++;//��ĸ����ˣ���ĸ��ȷ����1
					if(i==j) {
						num[1]++;//˵��λ�ö��ˣ�λ������1
					}
					break;
				}
			}
		}
		return num;
	}
	public static char[] convert(String str) {
        char[] numb = new char[5];
        // ���ַ����и��ÿ���ַ�
        for (int i = 0; i < numb.length; i++) {
            numb[i] = str.charAt(i);
        }
        return numb;
    }
}