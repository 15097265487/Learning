package cn.tedu;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		/*
		 * �������
		 * ���������
		 *    + - * / ++ --
		 * ��ϵ�����
		 *    > < = >= <= == !=
		 * �߼������
		 *    & | ^���߼����
		 *    && || !������ȼ٣��Ǽټ��棩
		 *    & && (��·�߼�)һ�ټ���
		 *    | || (��·�߼�)һ�ټ���
		 * ��ֵ�����
		 *    += -= *= /= %= =
		 *    a+=19.8  //a=(int)+(19.8)
		 *               ����ı��������������           
		 * ��Ԫ�����
		 *               �������ʽ�����ʽ1�����ʽ2    //��double��
		 *               ���ʽ����Ҫһ��
		 *    4>2?'a':12  //'a'
		 *    4>2?'a':-12  //97
		 * �ַ������ӷ�
		 *    +
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����������������������Կո�������Իس���������");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		scanner.close();
		System.out.println("�����ֵΪ��a = " + a + ",  b = " + b + ", c = " + c);
		if(a > b){
			if ( b > c) {
				System.out.println("����С��������Ϊ��" + c + "," + b + "," + a);
				System.out.println("���Ӵ�С����Ϊ��" + a + "," + b + "," + c);
			}else if( c > a){
				System.out.println("����С��������Ϊ��" + b + ","  + a + "," + c);
				System.out.println("���Ӵ�С����Ϊ��" + c + "," + a + "," + b);
			}else{
				System.out.println("����С��������Ϊ��" + b + "," + c + ","  + a);
				System.out.println("���Ӵ�С����Ϊ��" + a + "," + c + "," + b);
			}
		}else{
			if(c < a){
                System.out.println("����С��������Ϊ��" + c + "," + a + "," + b);
                System.out.println("���Ӵ�С����Ϊ��" + b + "," + a + "," + c);
            }else if(c > b){
                System.out.println("����С��������Ϊ��" + a + "," + b + "," + c);
                System.out.println("���Ӵ�С����Ϊ��" + c + "," + b + "," + a);
            }else{
                System.out.println("����С��������Ϊ��" + a + "," + c + "," + b);
                System.out.println("���Ӵ�С����Ϊ��" + b + "," + c + "," + a);
            }
		}
	}

}
