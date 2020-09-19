package cn.tedu.demo1;

import org.junit.Test;
/*
 * 	一、枚举类的使用
 * 	1.理解：类的对象只有有限个，确定的。
 * 	2.当需要定义一组常量时，建议使用枚举类
 * 	3.如果枚举类中只有一个对象，则可以使用单例模式
 * 	二、如何定义枚举
 * 	1.jdk5前，自定义枚举类
 * 	2.jdk5后
 */

public class EnumTest1 {
	@Test
	public void test1() {
		Season1 s = Season1.SUMMER;
		System.out.println(s);
	}

}
//类的对象只有有限个，确定的
//自定义枚举类
class Season1{
	//1.声明Season1对象属性，private、final修饰
	private final String Season1Name;
	private final String Season1Sesc;
	//2.私有化类的构造器，并给对象的属性赋值
	
	private Season1(String Season1Name, String Season1Sesc) {
		this.Season1Name = Season1Name;
		this.Season1Sesc = Season1Sesc;
	}
	//提供当前类的对象：public static final
	public static final Season1 SPRING = new Season1("春", "春暖花开");
	public static final Season1 SUMMER = new Season1("夏", "夏日炎炎");
	public static final Season1 AUTUMN = new Season1("秋", "秋风羞涩");
	public static final Season1 WINTER = new Season1("冬", "白雪皑皑");

	public String getSeason1Name() {
		return Season1Name;
	}
	public String getSeason1Sesc() {
		return Season1Sesc;
	}
	@Override
	public String toString() {
		return "Season1 [Season1Name=" + Season1Name + ", Season1Sesc=" + Season1Sesc + "]";
	}
	
}