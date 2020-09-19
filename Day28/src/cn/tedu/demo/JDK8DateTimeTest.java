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
 * jdk8��ʱ��api
 *   1.LocalDate LocalTime LocalDateTime
 *   	���ǵ�ʵ���ǲ��ɱ�Ķ��󣬷ֱ��ʾʹ�� ISO-8601(������)����ϵͳ�����ڡ�ʱ�䡢���ں�ʱ�䡣
 *   	1)now() ��̬���������ݵ�ǰʱ�䴴������/ָ��ʱ���Ķ���
 *   		LocalDate date = LocalDate.now() ����
 *   		LocalTime time = LocalTime.now() ʱ��
 *   		LocalDateTime dateTime = LocalDateTime.now() ����ʱ��	
 *   	2)of(),��̬����������ָ������/ʱ�䴴������
 *   		����ָ���� �� �� �� ʱ �� �룬û��ƫ����
 *   		LocalDateTime LocalDateTime.of(2020, 1, 31, 8, 48);
 *   	3)getXxxx() ��ȡ
 *   		int localDateTime.getDayOfMonth()	
 *   		Month localDateTime.getMonth()
 *   		int localDateTime.getMonthValue()
 *   		DayOfWeek localDateTime.getDayOfWeek()
 *   		...
 *  	 4)withXxxx() ���� (���ֲ��ɱ���)	
 *  		���·�����������������·ݡ�����޸�Ϊָ����ֵ�������µĶ���
 *   		LocalDateTime localDateTime.withDayOfMonth(10)
 *   	 5)plusXxxx() ����
 *   		��ǰ������Ӽ��졢���ܡ������¡����ꡢ��Сʱ
 *   		LocalDateTime ldt1 = localDateTime.plusMonths(5);
 *   	 6)minusXxxx ����
 *   		�ӵ�ǰ�����ȥ���¡����ܡ����졢���ꡢ��Сʱ
 *   		LocalDateTime ldt2 = localDateTime.minusMonths(4);
 *   2.Instant:
 *   	ʱ�����ϵ�һ��˲ʱ�㡣 ����ܱ�������¼Ӧ�ó����е��¼�ʱ���
 *   	1)now() 
 *   		��̬����������Ĭ��UTCʱ����Instant��Ķ���
 *   	2)atOffset(ZoneOffsetoffset)
 *   		��ϼ�ʱ��ƫ��������һ��OffsetDateTime
 *   		OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));
 *   	3)ofEpochMilli(longepochMilli)
 *   		��̬������������1970-01-0100:00:00�����ϼ���ָ��������֮���Instant��Ķ���
 *   		Instant instant = Instant.ofEpochMilli(10L);
 *   	4)toEpochMilli()
 *   		����1970-01-0100:00:00����ǰʱ��ĺ���������Ϊʱ���
 *   		long millis = now.toEpochMilli();
 *   3.DateTimeFormatter
 *   	��ʽ�� �������� ʱ�䣬������SimpleDateFormat
 *   	1)
 *   	2)
 *   	3)
 *   
 */

public class JDK8DateTimeTest {
	@Test
	public void test1() {
		//now()��ȡ��ǰ������ ��ʱ�� �����ڼ�ʱ��
		LocalDate localdate = LocalDate.now();
		LocalTime localtime = LocalTime.now();
		LocalDateTime localdatetime = LocalDateTime.now();
		
		System.out.println(localdate);
		System.out.println(localtime);
		System.out.println(localdatetime);
		//of()����ָ����������ʱ���룬û��ƫ����
		//���ܳ��ֵ��쳣java.time.DateTimeException
		LocalDateTime t1 = LocalDateTime.of(2020, 8, 30, 16, 59);
		System.out.println(t1);
		//getXxx() ��ȡ
		System.out.println(localdatetime.getDayOfMonth());//21
		System.out.println(localdatetime.getDayOfYear());//234
		System.out.println(localdatetime.getHour());//17
		System.out.println(localdatetime.getMonthValue());//8
		System.out.println(localdatetime.getDayOfWeek());//FRIDAY
		System.out.println(localdatetime.getMonth());//AUGUST
		
		//withXxx()  ����-->�����˲��ɱ���
		LocalDateTime ds = localdatetime.withDayOfMonth(10);
		System.out.println(ds);
		System.out.println(localdatetime);
		System.out.println("**********************");
		LocalDateTime hour = localdatetime.withHour(18);
		System.out.println(hour);
		
		
		//pulsXxx(),minusMinutes()���ɱ���
		LocalDateTime ldt1 = localdatetime.plusMinutes(5);
		System.out.println(ldt1);
		LocalDateTime ldt2 = localdatetime.minusMinutes(4);
		System.out.println(ldt2);

		System.out.println("\n"+localdatetime);
		
	}
	/*
	 * Instant:ʱ���ϵ�һ��˲ʱ��,����ܱ�������¼Ӧ�ó����е��¼�ʱ�����
	 * 		������Date
	 */
	@Test
	public void test2() {
		//��ȡ�����������϶�Ӧ��ʱ��
		Instant now = Instant.now();
		System.out.println(now);//2020-08-24T01:54:21.196Z
		
		//���ʱ���ƫ����
		OffsetDateTime atOffset = now.atOffset(ZoneOffset.ofHours(8));
		System.out.println(atOffset);//2020-08-24T09:57:30.897+08:00
		//ofEpochMilli(100L)
		//��̬������������ ��֮���Instant��Ķ��� 1970-01-0100:00:00�����ϼ���ָ��������֮���Instant��Ķ���
		Instant ofEpochMilli = Instant.ofEpochMilli(100L);
		System.out.println(ofEpochMilli);
		//��ȡ��ǰ�ĺ���ֵ-------------�൱��Date�е�getTime()����
		long millis = now.toEpochMilli();
		System.out.println(millis);
	}
	/*
	 * DateTimeFormatter
	 * 	��ʽ��������ʱ������
	 * 	������
	 * 
	 * 	ISO_LOCAL_DATE_TIME;
	 * 	ISO_LOCAL_DATE;
	 * 	ISO_LOCAL_TIME
	 */
	@Test
	public void test3() {
		DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println(dtf);
		//��ʽ��������------>�ַ���String
		LocalDateTime now = LocalDateTime.now();
		String format = dtf.format(now);
		System.out.println(now);
		System.out.println(format);//2020-08-24T10:45:53.285
		//�������ַ���---------->����
		TemporalAccessor parse = dtf.parse("2020-08-24T10:44:32.935");
		System.out.println(parse);//{},ISO resolved to 2020-08-24T10:44:32.935
		
		/*
		 * ��ʽ����ofLocalizedDateTime(FormatStyle.LONG)
		 * FormatStyle.LONG----2020��8��24�� ����11ʱ03��41��
		 * FormatStyle.FULL----2020-08-24T10:52:57.496
		 * FormatStyle.SHORT---2020-08-24T10:54:39.344
		 * FormatStyle.MEDIUM--2020-08-24T10:54:15.677
		 */
		//��ʽ��1��
		DateTimeFormatter dtf1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
		String format2 = dtf1.format(now);
		System.out.println("\n"+format2);
		//������ظ�ʽ��2��
		DateTimeFormatter dtf2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
//		String format3 = dtf2.format(LocalTime.now());
//		System.out.println(format3);
		//�Զ����ʽ��3��
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		String format3 = dtf3.format(LocalDateTime.now());
		System.out.println("\n"+format3);//2020-08-24 11:11:11
		
		//������
		TemporalAccessor parse3 = dtf3.parse("2020-08-24 11:13:49");
		System.out.println(parse3);
	}
}
