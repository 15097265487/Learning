package cn.tedu.demo;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;
/**
 * 其他类的演示
 * 	System 
 * 		currentTimeMillis()
 * 			该方法的作用是返回当前的计算机时间，时间的表达格式为当前计算机时
			间和GMT时间(格林威治时间)1970年1月1号0时0分0秒所差的毫秒数。
 * 		exit(0/非0)----正常/异常退出程序
 * 		gc()
 * 			该方法的作用是请求系统进行垃圾回收。至于系统是否立刻回收，则
			取决于系统中垃圾回收算法的实现以及系统执行时的情况。
		System.getProperty("key");
			该方法的作用是获得系统中属性名为key的属性对应的值。
 * 	Math
 * 	BigXxxx、
 *		java.math包的BigInteger可以表示不可变的任意精度的整数
 */

public class OtherClassTest {
	@Test
	public void test1() {
		String javaVersion = System.getProperty("java.version");
		System.out.println("java的version:" + javaVersion);
		
		String javaHome = System.getProperty("java.home");
		System.out.println("java的home:" + javaHome);
		
		String osName = System.getProperty("os.name");
		System.out.println("os的name:" + osName);
		
		String osVersion = System.getProperty("os.version");
		System.out.println("os的version:" + osVersion);
		
		String userName = System.getProperty("user.name");
		System.out.println("user的name:" + userName);
		
		String userHome = System.getProperty("user.home");
		System.out.println("user的home:" + userHome);
		
		String userDir = System.getProperty("user.dir");
		System.out.println("user的dir:" + userDir);
	}
	@Test
	public void test() {
		BigInteger bi = new BigInteger("52434343434343434343434343434343434343434315413");
		System.out.println(bi);
		BigDecimal bd = new BigDecimal("123");
		System.out.println(bd);
				
	}

}
