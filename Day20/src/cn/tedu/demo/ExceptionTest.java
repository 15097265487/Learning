package cn.tedu.demo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

/*
 * java.lang.Throwable
 * 		|--->java.long.Error:һ�㲻��д����Դ���������
 * 		|--->java.lang.Exception�����Խ����쳣����
 * 			|---����ʱ�쳣(�ܼ�)
 * 				|---IOException
 * 					|---FileNotFoundException
 * 				|---ClassNotFoundException
 * 			|---����ʱ�쳣(unchecked��RuntimeException)���ܼ�
 * 				|---NullPointerException
 * 				|---ArrayIndexOutOfBoundsException
 * 				|---ClassCastException
 * 				|---NumberFormatException
 * 				|---InputMismatchException
 */
public class ExceptionTest {
	@Test
	public void test7() {
//		File file = new File("hello.text");
//		FileInputStream fis = new FileInputStream(file);
//		int data = fis.read();
//		while(data != -1) {
//			System.out.println((char)data);
//			data = fis.read();
		
	}
	public void test6() {
		System.out.println(10/0);
	}
	public void test5() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println();
	}
	@Test
	public void test4() {
		String str = "122";
		int num = Integer.parseInt(str);
	}
	@Test
	public void test3() {
		Object o = new Date();
		String s = (String) o;
	}
	@Test
	public void test1() {
//		int[] a=new int[1];
//		System.out.println(a[12]);
		String str = "123";
		str = null;
		System.out.println(str.charAt(0));
	}
	
}
