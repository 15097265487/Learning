package cn.tedu.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
 * 	�쳣����ĵڶ��ַ�ʽ��throws+�쳣����
 * 		1.throws+�쳣����   д�ڷ����������������������档���ܻ��׳��쳣
 * 			һ��������ִ�е�ʱ�򣬳����쳣���Ի����쳣��λ������һ���쳣�Ķ��󣬴˶�������throws����쳣���ͣ��ͻ��׳���
 * 			�쳣����Ĵ���Ͳ���ִ�У�
 * 		2.throws�ķ�ʽֻ�ǽ��쳣�׸��˷����ĵ����ߣ���û�����潫�쳣�����
 * 			try-catch-finally�����ؽ��쳣�������
 * 		3.���������ѡ��try-catch-finally������throws�᣿
 * 			3.1ִ�з���m3()ʱ���Ⱥ�����������������⼸�������Ĺ�ϵ�ǵݽ���ϵִ�еġ���ʱ�������⼸������ʹ��throws��ʽ���д���
 * 			3.2��ִ�еķ���m3()���Կ���try-catch-finally�������д���
 * 		4.������д�����׳����쳣�����ڸ����׳����쳣��������෽��δ�׳��쳣�������෽�������׳��쳣��������ķ��������쳣���֣������ʹ��try-catch-finally��ʽ����
 * 
 * 
 */	

public class ThrowsTest {

	
	public static void main(String[] args) {
		try {
			m2();
		} catch (IOException e) {
			System.out.println("123");
			//e.printStackTrace();
		}
		m3();
	}
	public static void m2() throws IOException {
		m1();
	}
	public static void m3() {
		try {
			m2();
		} catch (IOException e) {
			System.out.println("0");
		}
	}
	public static void m1() throws FileNotFoundException,IOException{
		File file = new File("hello.text");
		FileInputStream fis = new FileInputStream(file);
		int data = fis.read();
		while(data != -1) {
			System.out.println((char)data);
			data = fis.read();
		}
		fis.close();
	}

}
