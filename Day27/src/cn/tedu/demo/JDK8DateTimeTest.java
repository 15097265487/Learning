package cn.tedu.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.junit.Test;

/*
 * jdk8��ʱ��api
 * LocaDate
 * LocaTime
 * LocaDateTime
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
		System.out.println(localdatetime);
		
	}
}
