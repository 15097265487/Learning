package cn.tedu.demo1;

import org.junit.Test;

public class StringTest {
	/**
	 * 	总结：
	 * 		1.常量与常量的拼接在常量池中，且常量池中不会存在相同内容的常量。
	 * 		2.只要有一个是变量，结果就在堆中。
	 * 		3.intern(),返回的实在常量池中的地址
	 */  
	@Test
	public void test3() {
		String s1 = "hello";
		String s2 = "world";
		String s3 = "helloworld";
		String s4 = s1+"world";//相当于new了一个对象
		String s5 = "hello"+s2;
		String s6 = "hello"+"world";
		System.out.println("-------");
		System.out.println(s3==s4);//f
		System.out.println(s3==s5);//f
		System.out.println(s3==s6);//t
		System.out.println(s4==s5);//f
		
		String s = s4.intern();//返回的常量池中的地址
		System.out.println(s==s6);
		
	}
	/*
	 * String实例化
	 * 		方式一：通过字面两定义的方式
	 * 		方式二：new+构造器 方式
	 * 	String s3 = new String("javaEE");在内中创建了几个对象
	 * 	两个：一个是在堆空间中new出来的，一个是在char[]常量池中的数据："javaEE"
	 * 	区别：
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
	 * String 字符串，使用"  "引起来
	 * 		①String 声明为final 不可继承的
	 * 		②String 实现了Serializeable：表示字符串支持序列化
	 * 				Comparable<String>:String不可以比较大小
	 * 				CharSequence
	 * 		③private   final   char   value[]
	 * 			String内部定义char[]，用来存储字符串数据
	 * 		④String表示不可变序列，即不可变性
	 * 			a)当对字符串重新赋值时，需要重新指定内存区域赋值，不能使用原来的value进行赋值
	 * 			b)当对现有字符串进行连接操作时，需要重新指定内存区域赋值，不能使用原来的value进行赋值
	 * 			c)当调用字符串中的replace()方法时，需要重新指定内存区域赋值，不能使用原来的value进行赋值
	 * 				（replace()用指定字符替换原来的字符）
	 * 		⑤字符创常量池中不会存储内容相同的字符串
	 * 		
	 */
	@Test
	public void test1() {
		String s1 = "abc";
		String s2 = "abc";
		s1 = "123";
		System.out.println(s1==s2);//地址值 true
		System.out.println(s1);//123
		System.out.println(s2);//abc
		System.out.println(s1==s2);//false
		
		s1 +="de";
		System.out.println(s1);//拼接123de
		
		String s3 = s2.replace('c', 'a');
		System.out.println("s2---"+s2);
		System.out.println(s3);
		System.out.println(s2==s3);
		
		String s4 = new String("aba");
		System.out.println(s4);
		System.out.println(s3==s4);
	}

}
