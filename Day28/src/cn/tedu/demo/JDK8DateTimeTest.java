package cn.tedu.demo;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

import org.junit.Test;

/*
 * jdk8的时间api
 *   1.LocalDate LocalTime LocalDateTime
 *   	它们的实例是不可变的对象，分别表示使用 ISO-8601(即公历)日历系统的日期、时间、日期和时间。
 *   	1)now() 静态方法，根据当前时间创建对象/指定时区的对象
 *   		LocalDate date = LocalDate.now() 日期
 *   		LocalTime time = LocalTime.now() 时间
 *   		LocalDateTime dateTime = LocalDateTime.now() 日期时间	
 *   	2)of(),静态方法，根据指定日期/时间创建对象
 *   		设置指定的 年 月 日 时 分 秒，没有偏移量
 *   		LocalDateTime LocalDateTime.of(2020, 1, 31, 8, 48);
 *   	3)getXxxx() 获取
 *   		int localDateTime.getDayOfMonth()	
 *   		Month localDateTime.getMonth()
 *   		int localDateTime.getMonthValue()
 *   		DayOfWeek localDateTime.getDayOfWeek()
 *   		...
 *  	 4)withXxxx() 设置 (体现不可变性)	
 *  		将月份天数、年份天数、月份、年份修改为指定的值并返回新的对象
 *   		LocalDateTime localDateTime.withDayOfMonth(10)
 *   	 5)plusXxxx() 增加
 *   		向当前对象添加几天、几周、几个月、几年、几小时
 *   		LocalDateTime ldt1 = localDateTime.plusMonths(5);
 *   	 6)minusXxxx 减少
 *   		从当前对象减去几月、几周、几天、几年、几小时
 *   		LocalDateTime ldt2 = localDateTime.minusMonths(4);
 *   2.Instant:
 *   	时间线上的一个瞬时点。 这可能被用来记录应用程序中的事件时间戳
 *   	1)now() 
 *   		静态方法，返回默认UTC时区的Instant类的对象
 *   	2)atOffset(ZoneOffsetoffset)
 *   		结合即时的偏移来创建一个OffsetDateTime
 *   		OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));
 *   	3)ofEpochMilli(longepochMilli)
 *   		静态方法，返回在1970-01-0100:00:00基础上加上指定毫秒数之后的Instant类的对象
 *   		Instant instant = Instant.ofEpochMilli(10L);
 *   	4)toEpochMilli()
 *   		返回1970-01-0100:00:00到当前时间的毫秒数，即为时间戳
 *   		long millis = now.toEpochMilli();
 *   3.DateTimeFormatter
 *   	格式化 解析日期 时间，类似于SimpleDateFormat
 *   	1)
 *   	2)
 *   	3)
 *   
 */

public class JDK8DateTimeTest {
	@Test
	public void test1() {
		//now()获取当前的日期 、时间 、日期加时间
		LocalDate localdate = LocalDate.now();
		LocalTime localtime = LocalTime.now();
		LocalDateTime localdatetime = LocalDateTime.now();
		
		System.out.println(localdate);
		System.out.println(localtime);
		System.out.println(localdatetime);
		//of()设置指定的年月日时分秒，没有偏移量
		//可能出现的异常java.time.DateTimeException
		LocalDateTime t1 = LocalDateTime.of(2020, 8, 30, 16, 59);
		System.out.println(t1);
		//getXxx() 获取
		System.out.println(localdatetime.getDayOfMonth());//21
		System.out.println(localdatetime.getDayOfYear());//234
		System.out.println(localdatetime.getHour());//17
		System.out.println(localdatetime.getMonthValue());//8
		System.out.println(localdatetime.getDayOfWeek());//FRIDAY
		System.out.println(localdatetime.getMonth());//AUGUST
		
		//withXxx()  设置-->体现了不可变性
		LocalDateTime ds = localdatetime.withDayOfMonth(10);
		System.out.println(ds);
		System.out.println(localdatetime);
		System.out.println("**********************");
		LocalDateTime hour = localdatetime.withHour(18);
		System.out.println(hour);
		
		
		//pulsXxx(),minusMinutes()不可变性
		LocalDateTime ldt1 = localdatetime.plusMinutes(5);
		System.out.println(ldt1);
		LocalDateTime ldt2 = localdatetime.minusMinutes(4);
		System.out.println(ldt2);

		System.out.println("\n"+localdatetime);
		
	}
	/*
	 * Instant:时间上的一个瞬时点,这可能被用来记录应用程序中的事件时间戳。
	 * 		类似于Date
	 */
	@Test
	public void test2() {
		//获取本初子午线上对应的时间
		Instant now = Instant.now();
		System.out.println(now);//2020-08-24T01:54:21.196Z
		
		//添加时间的偏移量
		OffsetDateTime atOffset = now.atOffset(ZoneOffset.ofHours(8));
		System.out.println(atOffset);//2020-08-24T09:57:30.897+08:00
		//ofEpochMilli(100L)
		//静态方法，返回在 数之后的Instant类的对象 1970-01-0100:00:00基础上加上指定毫秒数之后的Instant类的对象
		Instant ofEpochMilli = Instant.ofEpochMilli(100L);
		System.out.println(ofEpochMilli);
		//获取当前的毫秒值-------------相当于Date中的getTime()方法
		long millis = now.toEpochMilli();
		System.out.println(millis);
	}
	/*
	 * DateTimeFormatter
	 * 	格式化：解析时间日期
	 * 	解析：
	 * 
	 * 	ISO_LOCAL_DATE_TIME;
	 * 	ISO_LOCAL_DATE;
	 * 	ISO_LOCAL_TIME
	 */
	@Test
	public void test3() {
		DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println(dtf);
		//格式化：日期------>字符串String
		LocalDateTime now = LocalDateTime.now();
		String format = dtf.format(now);
		System.out.println(now);
		System.out.println(format);//2020-08-24T10:45:53.285
		//解析：字符串---------->日期
		TemporalAccessor parse = dtf.parse("2020-08-24T10:44:32.935");
		System.out.println(parse);//{},ISO resolved to 2020-08-24T10:44:32.935
		
		/*
		 * 方式二：ofLocalizedDateTime(FormatStyle.LONG)
		 * FormatStyle.LONG----2020年8月24日 上午11时03分41秒
		 * FormatStyle.FULL----2020-08-24T10:52:57.496
		 * FormatStyle.SHORT---2020-08-24T10:54:39.344
		 * FormatStyle.MEDIUM--2020-08-24T10:54:15.677
		 */
		//格式化1：
		DateTimeFormatter dtf1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
		String format2 = dtf1.format(now);
		System.out.println("\n"+format2);
		//本地相关格式化2：
		DateTimeFormatter dtf2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
//		String format3 = dtf2.format(LocalTime.now());
//		System.out.println(format3);
		//自定义格式化3：
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		String format3 = dtf3.format(LocalDateTime.now());
		System.out.println("\n"+format3);//2020-08-24 11:11:11
		
		//解析：
		TemporalAccessor parse3 = dtf3.parse("2020-08-24 11:13:49");
		System.out.println(parse3);
	}
}
