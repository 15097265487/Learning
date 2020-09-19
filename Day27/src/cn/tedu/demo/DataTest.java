package cn.tedu.demo;

import java.util.Date;

import org.junit.Test;

public class DataTest {
	/*
	 *  java.util.Date
	 *  java.sql.Date
	 *  
	 * 	1.构造器的使用
	 * 		①new Date()  创建一个返回当前时间的Date对象，
	 * 		②new Date(L) 创建指定毫秒值的Date对象
	 * 	2.两个方法的使用
	 * 		①toString(),显示Fri Aug 21 11:50:48 CST 2020
	 * 		②getTime()，获取当前Date对象对应的毫秒值（时间戳）
	 * 	3.java.sql.Date
	 * 		①实例化 new Date(long millis)
	 * 		②java.sql.Date与java.util.Date互相转换
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
		
		//转换情况一:将Date转换成sql.Date类型
		Date d4 = new java.sql.Date(1234L);
		java.sql.Date d5 = (java.sql.Date) d4;
		
		Date d = new Date();
		//d5 = (java.sql.Date) d;//java.lang.ClassCastException
		System.out.println(d);
		System.out.println(d5);
		
		//情况二
		Date date = new Date();
		d5 = new java.sql.Date (date.getTime());
		System.out.println(date);
		System.out.println(d5);
		date = d5;
		System.out.println(date);
		
		
	}
	@Test
	public void test1() {
		//1970年1月1日0时0分0秒之间以毫秒为单位的时间差-------》时间戳
		//此方法适于计算时间差
		System.out.println(System.currentTimeMillis());
	}
}
