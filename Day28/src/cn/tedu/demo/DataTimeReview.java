package cn.tedu.demo;

/*
 * System.currentTimeMillis() 1970.1.1 0:0:0
 *   һ��JDK8ǰ
 * 	1.Date
 * 		java.util.Date 
 * 			java.sql.Date
 * 		1)ʵ����
 * 			new Date(),new Date(1234566L)
 * 			new java.sql,Date(1L)
 * 		2)���÷���
 * 			toString()
 * 			getTime()
 *  	ע����ƫ����:year+1900��
 *  2.Calendar ������
 *  	�´�0��ʼ �������ǵ�һ��
 *  	1)ʵ����
 *  		new GregorianCalendar()
 *  		Calender.getInstance()
 *  	2)���÷���
 *  		get(xxx),	calendar.get(Calendar.DAY_OF_MONTH);
 *  		set(x,x),�ɱ���,calendar.set(Calendar.DAY_OF_MONTH, 10);
 *  		add(x,x),	calendar.add(Calendar.DAY_OF_MONTH, -20);
 *  		Calendar-->Date,calendar.getTime();	
 *  		Date-->Calendar,calendar.setTime(date);
 *  SimpleDateFormat	
 *  	1)ʵ���� 
 *  		new SimpleDateFormat();
 *  		new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
 *  	2)���÷���
 *  		��ʽ����Date����-->�ַ���
 *  			String simpleDateFormat.format(date)
 *  		�������ַ���-->Date
 *  			Date simpleDateFormat.parse("xx")
 *  				ParseException
 *  ����jdk8��ʱ��api
 *  1.LocalDate LocalTime LocalDateTime	
 *   1)now() ��ȡ��ǰ������ ʱ�� ����+ʱ��
 *   	LocalDate date = LocalDate.now()
 *   	LocalTime time = LocalTime.now()
 *   	LocalDateTime dateTime = LocalDateTime.now()	
 *   2)of(),����ָ���� �� �� �� ʱ �� �룬û��ƫ����
 *   	LocalDateTime LocalDateTime.of(2020, 1, 31, 8, 48);
 *   3)getXxxx() ��ȡ
 *   	int localDateTime.getDayOfMonth()	
 *   	Month localDateTime.getMonth()
 *   	int localDateTime.getMonthValue()
 *   	DayOfWeek localDateTime.getDayOfWeek()
 *   	...
 *   4)withXxxx() ���� (���ֲ��ɱ���)	
 *   	LocalDateTime localDateTime.withDayOfMonth(10)
 *  
 */
public class DataTimeReview {

}
