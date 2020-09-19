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
 * Calendar(日历)类
 */

public class DateTest1 {
	/*
	 * Calendar(日历)类
	 * 	日历类，他是一个抽象类，封装了所有的日历字段值，通过统一的方法根据传入不同的日历字段可以获取值。
    	1.如何得到一个日历对象呢?
    					 new GregorianCalendar()实例化子类
        	Calendar c = Calendar.getInstance()；//返回的是子类对象
    	2.成员方法
        	public void add(int field,int amount):根据给定的日历字段和对应的时间，来对当前的日历进行操作。
        	public final void set(int year,int month,int date):设置当前日历的年月日
	 */
	@Test
	public void test4() {
		Calendar c = Calendar.getInstance();
		//System.out.println(c.getInstance());
		// 获取年
		int year = c.get(Calendar.YEAR);
		// 获取月
		int month = c.get(Calendar.MONTH);
		// 获取日
		int date = c.get(Calendar.DATE);
		//这个月的第几天
		int days = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("这个月的第"+days+"天");
		//
		int year2 = c.get(+Calendar.DAY_OF_YEAR);
		System.out.println("今天是今年的"+year2+"天");
		//月份从零开始，星期日为一周的第一天
		int week = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("这周的第"+week+"天");
		//set
		c.set(Calendar.DAY_OF_MONTH, 10);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		//add
		c.add(Calendar.DAY_OF_MONTH, 20);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		//日期   日历---》Date
		Date time = c.getTime();
		System.out.println(time);
		//毫秒值，时间戳
		System.out.println(time.getTime());
		//Date----》日历
		Date date1 = new Date();
		c.setTime(date1);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println("--------------");
		System.out.println("今天"+year + "年" + (month + 1) + "月" + date + "日");
	}
	/*
	 * SimpleDateFormat
	 * 	对日期Date类格式化和解析
	 * 	格式化：Date日期------>字符串
	 * 	解析：
	 * 	1.如何对SimpleDateFormat实例化
	 * 	字符串---------->日期
	 * 	parse()解析的意思
	 */
	@Test
	public void test1() throws ParseException {
		//1.
		SimpleDateFormat sdf = new SimpleDateFormat();
		//格式化：日期----->字符串
		Date date = new Date();
		String ds = sdf.format(date);
		System.out.println(date);
		System.out.println(ds);
		//解析：字符串---------->日期
		Date par = sdf.parse("20-8-21 下午2:49");
		System.out.println(par);
		//格式化：Date日期------>字符串
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年.MMMMM.dd GGG hh:mm aaa");
		String fo = sdf1.format(date);
		System.out.println(fo);
		System.out.println("---------");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aa");//自己设置格式
		String fo1 = sdf2.format(date);
		System.out.println(fo1);
		//解析：字符串---------->日期
		par = sdf1.parse("2020年.八月.21 公元 03:19 下午");
		System.out.println(par);
		System.out.println("---------");
		par = sdf2.parse("2020-08-21 03:26:31 下午");
		System.out.println(par);
	}
	/*
	 *  字符串：2020-08-21转换成java.sql.date
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
	 * 	三天晒网，五天打鱼。
	 * 大鱼：总天数%5--1\2\3
	 * 筛网：总天数%5--4\0
	 */
	@Test
	public void test3() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
