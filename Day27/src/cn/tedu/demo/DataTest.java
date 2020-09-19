package cn.tedu.demo;

import java.util.Date;

import org.junit.Test;

public class DataTest {
	/*
	 *  java.util.Date
	 *  java.sql.Date
	 *  
	 * 	1.��������ʹ��
	 * 		��new Date()  ����һ�����ص�ǰʱ���Date����
	 * 		��new Date(L) ����ָ������ֵ��Date����
	 * 	2.����������ʹ��
	 * 		��toString(),��ʾFri Aug 21 11:50:48 CST 2020
	 * 		��getTime()����ȡ��ǰDate�����Ӧ�ĺ���ֵ��ʱ�����
	 * 	3.java.sql.Date
	 * 		��ʵ���� new Date(long millis)
	 * 		��java.sql.Date��java.util.Date����ת��
	 * 			java.util.Date  d = new java.util.Date()
	 * 			java.sql.Date  dt = new java.sql.Date(d.getTime())
	 */
	@Test
	public void test2() {
		Date d1 = new Date();//util
		Date d3 = new Date(1597981836163L);
		//Date d3 = new Date(0,0,0);
		
		java.sql.Date d2 = new java.sql.Date(1L);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d3.getDate());
		System.out.println(d3.toString());
		
		//ת�����һ:��Dateת����sql.Date����
		Date d4 = new java.sql.Date(1234L);
		java.sql.Date d5 = (java.sql.Date) d4;
		
		Date d = new Date();
		//d5 = (java.sql.Date) d;//java.lang.ClassCastException
		System.out.println(d);
		System.out.println(d5);
		
		//�����
		Date date = new Date();
		d5 = new java.sql.Date (date.getTime());
		System.out.println(date);
		System.out.println(d5);
		date = d5;
		System.out.println(date);
		
		
	}
	@Test
	public void test1() {
		//1970��1��1��0ʱ0��0��֮���Ժ���Ϊ��λ��ʱ���-------��ʱ���
		//�˷������ڼ���ʱ���
		System.out.println(System.currentTimeMillis());
	}
}
