package cn.tedu;

public class VarDemo {

	public static void main(String[] args) {
		/*1.jdk��jre��jvm
		 * 2.javac  h.java --->.class�ֽ����ļ�
		 *   java h
		 * 
		 * 
		 * 
		 *
		 *��ʶ���������Լ����������ֵĵط�
		 *��ʶ����������
		 *   1.���֡���ĸ���»��ߡ�$
		 *   2.���������ֿ�ͷ
		 *   3.���Ĳ�����ʹ��
		 *   4.����ʹ�ñ�����
		 *   5.����֪��
		 *   6.�ϸ����ִ�Сд
		 *��ͬ��ʶ������������
		 * 	 1.���� Сд
		 *   2.�������ͷ��������շ�������xxxxYyyyZzzz
		 *   3.��ӿڣ���˹��������XxxYyyZzz
		 *   4.������������ĸ����д����ͬ����֮����_
		 *  
		 *����   ����+��ʼ��
		 *���ͣ� 
		 *   1.������������1 2 4 8
		 *   2.λ�Ǽ��������С�ĵ�λ 1byte = 8λ
		 *   3.���Σ�byte short int long
		 *           1     2    4   8
		 *   4.�����ͣ�  float double
		 *            4      8
		 *   5.�����ͣ�boolean
		 *            1
		 *   6.�ַ��ͣ�char
		 *           2
		 *������������
		 *  
		 *8.��������֮���ת��
		 */
		
		
		int a = 12;
		int b;
		System.out.println();
		b = 13;
		b = 10;
		byte c = 12;
		//С��ֱ����Ĭ��������double
		double d = 1.2;
		//����ֱ����Ĭ��������int
		long l = 12L;
		
		boolean bo = true;
		//ÿһ���ַ�����Ӧһ��int��
		char ch = 122;//0-65535
		System.out.println(ch);
//		ch = '��';
//		int i = ch;//char-->int
//		ch = '��';
//		int x = ch;
//		System.out.println(i);
//		System.out.println(x);
		/*
		 * ��������С����
		 *  byte short int long float double 
		 * �������͵�ת��
		 * �Զ���������ת����
		 *   С-->��
		 * ǿ������ת��
		 *   ��-->С
		 *   ��ʽ����Ҫת�����������ͣ�����
		 * �����������
		 *  1.����ֱ�Ӱ�����ֱ�������Ƹ�byte short char
		 *  	���ǲ��ܳ�����Χ��
		 *  2.�ڲ�������ʱ����תΪint������
		 */
		byte b1 = 12;//int --> byte
		byte b2 = 127;
		byte b3 = -128;//-128~127
		short s1 = 12;
		short s2 = 100;//-32768~32767
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		char ch1 = 50;
		b3 = (byte)(b2+b1);//int-->byte
		System.out.println(b3);
		b3 = (byte)(s1+s2);
		System.out.println(b3);
		
		byte z=5;
		short s=3;
		short e = (byte)(z+s);
		System.out.println(e);
		
		char ch2 = '2';//50+50
		System.out.println(ch2+ch2);
		
		char ch4 = '3';//50+51
		System.out.println(ch2+ch4);
		
		char ch5 = '4';//51+52
		System.out.println(ch4+ch5);
		
		
		
		
	}

}
