package cn.tedu.demo1;

import javax.sound.midi.Synthesizer;

import org.junit.Test;
/*
 * 包装类： Wrapper
 * 	java提供了八种基本数据类型对应的包装类，使得基本数据类型的变量具备了类的特征
 * 
 * 	基本数据类型     包装类      String三者之间的转换
 */

public class JunitTest {
	@Test
	public void test1() {
		//基本----》包装类，调用了包装类的构造器
		int num=10;
		Integer in1=new Integer(num);
		Integer in2=new Integer("123");
		
		System.out.println(in1);
		System.out.println(in2.toString());
		
		Integer in3=new Integer("123");//异常
		System.out.println(in3.toString());
		
		Float f = new Float("12");
		Float f1 = new Float("12.0F");
		System.out.println(f);
		
		Boolean b = new Boolean(true);
		Boolean b1 = new Boolean("true132");
		System.out.println(b1);
		System.out.println("------------------");
	}
	@Test
	public void test2() {
		//包装类------》基本
		//调用包装类的对象调用.xxxvalue()
		Integer in1 = new Integer(129);
		int i = in1.intValue();
		byte b = in1.byteValue();
		System.out.println(b);
	}
	/*
	 * JDK5.0新特性   自动装箱  自动拆箱
	 */
	public void test3() {
		//自动装箱：基本--------------》包装
		int num = 200;
		Integer in1 = num;
		boolean b = true;
		Boolean bo1=b;
		//自动拆箱：包装--------------》基本
		System.out.println(in1);
		//in1.intValue();
		int i=in1;
	}
	@Test
	public void test4() {
		//基本‘包装----------------------》String类型
		//调用String中valueOf(Xxx xxx);
		int num = 10;
		String s=num+"";
		s=String.valueOf(num);
		
		Double d = new Double(66.66);
		s = String.valueOf(d);
		System.out.println(s);
	}
	@Test
	public void test5() {
		//字符串---->基本、包装
		//调用包装类的parseXxx(String str);
		String str = "1";
		int i = Integer.parseInt(str);
		System.out.println(i);
		
		str = "true1234";
		boolean b = Boolean.parseBoolean(str);
		System.out.println(b);
	}
	

}
 