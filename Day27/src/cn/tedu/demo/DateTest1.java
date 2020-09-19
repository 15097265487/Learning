package cn.tedu.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.text.html.parser.ParserDelegator;

import org.junit.Test;

/*
 * System
 * Date
 * SimpleDateFormat
 * Calendar(����)��
 */

public class DateTest1 {
	/*
	 * Calendar(����)��
	 * 	�����࣬����һ�������࣬��װ�����е������ֶ�ֵ��ͨ��ͳһ�ķ������ݴ��벻ͬ�������ֶο��Ի�ȡֵ��
    	1.��εõ�һ������������?
    					 new GregorianCalendar()ʵ��������
        	Calendar c = Calendar.getInstance()��//���ص����������
    	2.��Ա����
        	public void add(int field,int amount):���ݸ����������ֶκͶ�Ӧ��ʱ�䣬���Ե�ǰ���������в�����
        	public final void set(int year,int month,int date):���õ�ǰ������������
	 */
	@Test
	public void test4() {
		Calendar c = Calendar.getInstance();
		//System.out.println(c.getInstance());
		// ��ȡ��
		int year = c.get(Calendar.YEAR);
		// ��ȡ��
		int month = c.get(Calendar.MONTH);
		// ��ȡ��
		int date = c.get(Calendar.DATE);
		//����µĵڼ���
		int days = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("����µĵ�"+days+"��");
		//
		int year2 = c.get(+Calendar.DAY_OF_YEAR);
		System.out.println("�����ǽ����"+year2+"��");
		//�·ݴ��㿪ʼ��������Ϊһ�ܵĵ�һ��
		int week = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("���ܵĵ�"+week+"��");
		//set
		c.set(Calendar.DAY_OF_MONTH, 10);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		//add
		c.add(Calendar.DAY_OF_MONTH, 20);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		//����   ����---��Date
		Date time = c.getTime();
		System.out.println(time);
		//����ֵ��ʱ���
		System.out.println(time.getTime());
		//Date----������
		Date date1 = new Date();
		c.setTime(date1);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println("--------------");
		System.out.println("����"+year + "��" + (month + 1) + "��" + date + "��");
	}
	/*
	 * SimpleDateFormat
	 * 	������Date���ʽ���ͽ���
	 * 	��ʽ����Date����------>�ַ���
	 * 	������
	 * 	1.��ζ�SimpleDateFormatʵ����
	 * 	�ַ���---------->����
	 * 	parse()��������˼
	 */
	@Test
	public void test1() throws ParseException {
		//1.
		SimpleDateFormat sdf = new SimpleDateFormat();
		//��ʽ��������----->�ַ���
		Date date = new Date();
		String ds = sdf.format(date);
		System.out.println(date);
		System.out.println(ds);
		//�������ַ���---------->����
		Date par = sdf.parse("20-8-21 ����2:49");
		System.out.println(par);
		//��ʽ����Date����------>�ַ���
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy��.MMMMM.dd GGG hh:mm aaa");
		String fo = sdf1.format(date);
		System.out.println(fo);
		System.out.println("---------");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aa");//�Լ����ø�ʽ
		String fo1 = sdf2.format(date);
		System.out.println(fo1);
		//�������ַ���---------->����
		par = sdf1.parse("2020��.����.21 ��Ԫ 03:19 ����");
		System.out.println(par);
		System.out.println("---------");
		par = sdf2.parse("2020-08-21 03:26:31 ����");
		System.out.println(par);
	}
	/*
	 *  �ַ�����2020-08-21ת����java.sql.date
	 */
	@Test
	public void test2() throws ParseException {
		String str = "2020-08-21";
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
		Date de = s.parse(str);
		java.sql.Date d = new java.sql.Date(de.getTime());
		System.out.println(d);
		System.out.println(de);
	}
	/*
	 * 	����ɹ����������㡣
	 * ���㣺������%5--1\2\3
	 * ɸ����������%5--4\0
	 */
	@Test
	public void test3() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
