package cn.tedu.demo;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;
/**
 * ���������ʾ
 * 	System 
 * 		currentTimeMillis()
 * 			�÷����������Ƿ��ص�ǰ�ļ����ʱ�䣬ʱ��ı���ʽΪ��ǰ�����ʱ
			���GMTʱ��(��������ʱ��)1970��1��1��0ʱ0��0������ĺ�������
 * 		exit(0/��0)----����/�쳣�˳�����
 * 		gc()
 * 			�÷���������������ϵͳ�����������ա�����ϵͳ�Ƿ����̻��գ���
			ȡ����ϵͳ�����������㷨��ʵ���Լ�ϵͳִ��ʱ�������
		System.getProperty("key");
			�÷����������ǻ��ϵͳ��������Ϊkey�����Զ�Ӧ��ֵ��
 * 	Math
 * 	BigXxxx��
 *		java.math����BigInteger���Ա�ʾ���ɱ�����⾫�ȵ�����
 */

public class OtherClassTest {
	@Test
	public void test1() {
		String javaVersion = System.getProperty("java.version");
		System.out.println("java��version:" + javaVersion);
		
		String javaHome = System.getProperty("java.home");
		System.out.println("java��home:" + javaHome);
		
		String osName = System.getProperty("os.name");
		System.out.println("os��name:" + osName);
		
		String osVersion = System.getProperty("os.version");
		System.out.println("os��version:" + osVersion);
		
		String userName = System.getProperty("user.name");
		System.out.println("user��name:" + userName);
		
		String userHome = System.getProperty("user.home");
		System.out.println("user��home:" + userHome);
		
		String userDir = System.getProperty("user.dir");
		System.out.println("user��dir:" + userDir);
	}
	@Test
	public void test() {
		BigInteger bi = new BigInteger("52434343434343434343434343434343434343434315413");
		System.out.println(bi);
		BigDecimal bd = new BigDecimal("123");
		System.out.println(bd);
				
	}

}
