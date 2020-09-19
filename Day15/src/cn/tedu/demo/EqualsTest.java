package cn.tedu.demo;

import java.util.Date;

/*
 * ������;            ==��equals()������
 * ==�������
 * 		1. ����ʹ���ڻ����������ͱ���֮��������������ͱ���
 * 		2.����Ƚϵ��ǻ����������ͣ��Ƚϵ���������������������Ƿ���ȡ�
 * 		3.����Ƚϵ��������������ͣ��Ƚϵ�����������ĵ�ֵַ�Ƿ���ͬ�������������Ƿ�ָ��ͬһ������ʵ�壩��
 * equals():����
 * 		1.ֻ������������������
 * 		2.Object����equals()�Ķ���
 * 			public boolean equals(Objest obj){
 * 				return (this==obj);
 * 			}
 * 		3.��String Date File��װ��ȶ���д��equals()����д�Ժ󣬱ȽϵĲ����������õĵ�ַ�Ƿ���ͬ���Ƚϵ�����������ġ�ʵ�����ݡ��Ƿ���ͬ��
 * 
 * 
 */

public class EqualsTest {

	public static void main(String[] args) {
		int i=10;
		int j=10;
		double d=10;
		System.out.println(j==i);
		System.out.println(i==d);
		
		boolean b=true;
		//System.out.println(b==i);�������ͺ��������Ͳ������Ƚϵ�
		
		char c=10;
		i=1;
		c='1';
		System.out.println(i==c);
		
		//������������
		System.out.println("-----------");
		Date date1 = new Date(12);
		Date date2 = new Date(12);
		System.out.println(date1==date2);
		//
		Customer c1 = new Customer("����",12);
		Customer c2 = new Customer("����",12);
		System.out.println(c1==c2);
		Object obj = new Object();
		System.out.println(c2==obj);
		
		System.out.println("-----------");
		System.out.println(c1.equals(c2));
		System.out.println(date1.equals(date2));
		String s1 = new String("123");
		String s2 = new String("123");
		System.out.println(s1==s2);//�Ƚϵ�ַ
		System.out.println(s1.equals(s2));//���������
		
		String s3="123";
		String s4="123";
		System.out.println(s3==s4);//true
		
		
		
		
		
		
		
		
		

	}

}
