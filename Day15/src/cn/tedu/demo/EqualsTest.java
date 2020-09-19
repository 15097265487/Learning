package cn.tedu.demo;

import java.util.Date;

/*
 * 面试题;            ==与equals()的区别
 * ==：运算符
 * 		1. 可以使用在基本数据类型变量之间和引用数据类型变量
 * 		2.如果比较的是基本数据类型，比较的是两个变量保存的数据是否相等。
 * 		3.如果比较的是引用数据类型，比较的是两个对象的地址值是否相同（即两个引用是否指向同一个对象实体）。
 * equals():方法
 * 		1.只是用于引用数据类型
 * 		2.Object类中equals()的定义
 * 			public boolean equals(Objest obj){
 * 				return (this==obj);
 * 			}
 * 		3.像String Date File包装类等都重写了equals()，重写以后，比较的不是两个引用的地址是否相同，比较的是两个对象的“实体内容”是否相同。
 * 
 * 
 */

public class EqualsTest {

	public static void main(String[] args) {
		int i=10;
		int j=10;
		double d=10;
		System.out.println(j==i);
		System.out.println(i==d);
		
		boolean b=true;
		//System.out.println(b==i);布尔类型和其他类型不能做比较的
		
		char c=10;
		i=1;
		c='1';
		System.out.println(i==c);
		
		//引用数据类型
		System.out.println("-----------");
		Date date1 = new Date(12);
		Date date2 = new Date(12);
		System.out.println(date1==date2);
		//
		Customer c1 = new Customer("张三",12);
		Customer c2 = new Customer("张三",12);
		System.out.println(c1==c2);
		Object obj = new Object();
		System.out.println(c2==obj);
		
		System.out.println("-----------");
		System.out.println(c1.equals(c2));
		System.out.println(date1.equals(date2));
		String s1 = new String("123");
		String s2 = new String("123");
		System.out.println(s1==s2);//比较地址
		System.out.println(s1.equals(s2));//保存的数据
		
		String s3="123";
		String s4="123";
		System.out.println(s3==s4);//true
		
		
		
		
		
		
		
		
		

	}

}
