package cn.tedu.demo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;
/*
 * try-catch-finally
 * 	1.finally��ѡ��
 * 	2.finally�������Ĵ����һ����ִ��
 * 		��ʹtry��catch��return��Ҳ����ִ��finally��try��catch�г����쳣��Ҳ��ִ��finally
 * 	3.�����ݿ����ӣ�����������������̣�scorket����Դ���ͷţ��رղ���������Ҫ����finally��
 * 	
 * 	final��finally��finalize������
 * 	final�����������α������������࣬�����εı�����ֵ���ܱ��ı䣬�����εķ������ܱ���д�������ε��಻�ܱ��̳У�����abstract�Ƿ����
	finallyͨ������try��catch���ĺ��湹������ִ�д���飬�����ζ�ų��������������л��Ƿ����쳣������Ĵ���ֻҪJVM���رն���ִ�У����Խ��ͷ��ⲿ��Դ�Ĵ���д��finally����
	finalize��Object��ķ�����Java������ʹ��finalize()������������������������ڴ��������ȥ֮ǰ����Ҫ������������������������������������ٶ���ʱ���õģ�ͨ����дfinalize()������������ϵͳ��Դ����ִ������������
 * 
 * 	
 */



public class FinallyTest {
	
	@Test
	public void test3() {
		FileInputStream fis = null;
		try {
			File file = new File("hello.txt");
		    fis = new FileInputStream(file);
			int data = fis.read();
			while(data != -1) {
				System.out.println((char)data);
				data = fis.read();
			}
			
		} catch (FileNotFoundException e) {
 			e.printStackTrace();
 			//System.out.println("�ļ��Ҳ���");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(fis!=null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	@Test
	public void test2() {
		int m = m();
		System.out.println(m);
	}
	public int m() {
		try {
			//int a[] = new int[0];
			int a[] = null;
			System.out.println(a.length);
			return 1;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
			return 2;
		}catch(NullPointerException e){
			e.printStackTrace();
			return 3;
		}finally {
			System.out.println("ִ��");
			return 4;
		}
		//return 0;
	}
	
	
	@Test
	public void test1() {
		try {
			int a=10;
			int b=0;
			System.out.println(a/b);
			System.out.println("-----TRY-----");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());//  / by zero
			int[] a = new int[0];
			System.out.println(a[0]);
		}finally {
			System.out.println("finally");
		}
		System.out.println("over");
	}
}
