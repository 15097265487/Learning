package cn.tedu.demo1;

import org.junit.Test;

public class StringTest {
	/**
	 * 	�ܽ᣺
	 * 		1.�����볣����ƴ���ڳ������У��ҳ������в��������ͬ���ݵĳ�����
	 * 		2.ֻҪ��һ���Ǳ�����������ڶ��С�
	 * 		3.intern(),���ص�ʵ�ڳ������еĵ�ַ
	 */  
	@Test
	public void test3() {
		String s1 = "hello";
		String s2 = "world";
		String s3 = "helloworld";
		String s4 = s1+"world";//�൱��new��һ������
		String s5 = "hello"+s2;
		String s6 = "hello"+"world";
		System.out.println("-------");
		System.out.println(s3==s4);//f
		System.out.println(s3==s5);//f
		System.out.println(s3==s6);//t
		System.out.println(s4==s5);//f
		
		String s = s4.intern();//���صĳ������еĵ�ַ
		System.out.println(s==s6);
		
	}
	/*
	 * Stringʵ����
	 * 		��ʽһ��ͨ������������ķ�ʽ
	 * 		��ʽ����new+������ ��ʽ
	 * 	String s3 = new String("javaEE");�����д����˼�������
	 * 	������һ�����ڶѿռ���new�����ģ�һ������char[]�������е����ݣ�"javaEE"
	 * 	����
	 * 
	 */
	@Test
	public void test2() {
		String s1 = "javaEE";
		String s2 = "javaEE";
		String s3 = new String("javaEE");
		String s4 = new String("javaEE");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));//t
		
		Person p1 = new Person("Tom",12);
		Person p2 = new Person("Tom",12);
		System.out.println(p1.name.equals(p2));
		System.out.println(p1.name==p2.name);
		
		Person p3 = new Person("Tom",12);
		System.out.println(p1==p2);
		System.out.println(p1.name==p3.name);
		
	}
	
	/**
	 * String �ַ�����ʹ��"  "������
	 * 		��String ����Ϊfinal ���ɼ̳е�
	 * 		��String ʵ����Serializeable����ʾ�ַ���֧�����л�
	 * 				Comparable<String>:String�����ԱȽϴ�С
	 * 				CharSequence
	 * 		��private   final   char   value[]
	 * 			String�ڲ�����char[]�������洢�ַ�������
	 * 		��String��ʾ���ɱ����У������ɱ���
	 * 			a)�����ַ������¸�ֵʱ����Ҫ����ָ���ڴ�����ֵ������ʹ��ԭ����value���и�ֵ
	 * 			b)���������ַ����������Ӳ���ʱ����Ҫ����ָ���ڴ�����ֵ������ʹ��ԭ����value���и�ֵ
	 * 			c)�������ַ����е�replace()����ʱ����Ҫ����ָ���ڴ�����ֵ������ʹ��ԭ����value���и�ֵ
	 * 				��replace()��ָ���ַ��滻ԭ�����ַ���
	 * 		���ַ����������в���洢������ͬ���ַ���
	 * 		
	 */
	@Test
	public void test1() {
		String s1 = "abc";
		String s2 = "abc";
		s1 = "123";
		System.out.println(s1==s2);//��ֵַ true
		System.out.println(s1);//123
		System.out.println(s2);//abc
		System.out.println(s1==s2);//false
		
		s1 +="de";
		System.out.println(s1);//ƴ��123de
		
		String s3 = s2.replace('c', 'a');
		System.out.println("s2---"+s2);
		System.out.println(s3);
		System.out.println(s2==s3);
		
		String s4 = new String("aba");
		System.out.println(s4);
		System.out.println(s3==s4);
	}

}
