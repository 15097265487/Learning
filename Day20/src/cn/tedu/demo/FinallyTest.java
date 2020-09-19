package cn.tedu.demo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;
/*
 * try-catch-finally
 * 	1.finally可选的
 * 	2.finally中声明的代码就一定会执行
 * 		即使try或catch中return，也会先执行finally，try或catch中出现异常，也会执行finally
 * 	3.向数据库连接，输入输出流，网络编程，scorket等资源的释放，关闭操作，就需要声明finally中
 * 	
 * 	final、finally、finalize的区别
 * 	final可以用于修饰变量，方法，类，被修饰的变量的值不能被改变，被修饰的方法不能被重写，被修饰的类不能被继承，它和abstract是反义词
	finally通常放在try…catch…的后面构造总是执行代码块，这就意味着程序无论正常运行还是发生异常，这里的代码只要JVM不关闭都会执行，可以将释放外部资源的代码写在finally块中
	finalize：Object类的方法，Java中允许使用finalize()方法在垃圾回收器将对象从内存中清除出去之前做必要的清理工作，这个方法是由垃圾回收器在销毁对象时调用的，通过重写finalize()方法可以整理系统资源或者执行其他清理工作
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
 			//System.out.println("文件找不到");
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
			System.out.println("执行");
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
