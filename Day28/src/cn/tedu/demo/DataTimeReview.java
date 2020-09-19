package cn.tedu.demo;

/*
 * System.currentTimeMillis() 1970.1.1 0:0:0
 *   一、JDK8前
 * 	1.Date
 * 		java.util.Date 
 * 			java.sql.Date
 * 		1)实例化
 * 			new Date(),new Date(1234566L)
 * 			new java.sql,Date(1L)
 * 		2)常用方法
 * 			toString()
 * 			getTime()
 *  	注：有偏移量:year+1900，
 *  2.Calendar 抽象类
 *  	月从0开始 星期日是第一天
 *  	1)实例化
 *  		new GregorianCalendar()
 *  		Calender.getInstance()
 *  	2)常用方法
 *  		get(xxx),	calendar.get(Calendar.DAY_OF_MONTH);
 *  		set(x,x),可变性,calendar.set(Calendar.DAY_OF_MONTH, 10);
 *  		add(x,x),	calendar.add(Calendar.DAY_OF_MONTH, -20);
 *  		Calendar-->Date,calendar.getTime();	
 *  		Date-->Calendar,calendar.setTime(date);
 *  SimpleDateFormat	
 *  	1)实例化 
 *  		new SimpleDateFormat();
 *  		new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
 *  	2)常用方法
 *  		格式化：Date日期-->字符串
 *  			String simpleDateFormat.format(date)
 *  		解析：字符串-->Date
 *  			Date simpleDateFormat.parse("xx")
 *  				ParseException
 *  二、jdk8的时间api
 *  1.LocalDate LocalTime LocalDateTime	
 *   1)now() 获取当前的日期 时间 日期+时间
 *   	LocalDate date = LocalDate.now()
 *   	LocalTime time = LocalTime.now()
 *   	LocalDateTime dateTime = LocalDateTime.now()	
 *   2)of(),设置指定的 年 月 日 时 分 秒，没有偏移量
 *   	LocalDateTime LocalDateTime.of(2020, 1, 31, 8, 48);
 *   3)getXxxx() 获取
 *   	int localDateTime.getDayOfMonth()	
 *   	Month localDateTime.getMonth()
 *   	int localDateTime.getMonthValue()
 *   	DayOfWeek localDateTime.getDayOfWeek()
 *   	...
 *   4)withXxxx() 设置 (体现不可变性)	
 *   	LocalDateTime localDateTime.withDayOfMonth(10)
 *  
 */
public class DataTimeReview {

}
