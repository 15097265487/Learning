package cn.tedu.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
 * 	异常处理的第二种方式：throws+异常类型
 * 		1.throws+异常类型   写在方法的声明处，方法名后面。可能或抛出异常
 * 			一旦当方法执行的时候，出现异常，仍会在异常的位置生成一个异常的对象，此对象满足throws后的异常类型，就会抛出。
 * 			异常后面的代码就不会执行！
 * 		2.throws的方式只是将异常抛给了方法的调用者，比没有正真将异常处理掉
 * 			try-catch-finally真正地将异常处理掉了
 * 		3.开发中如何选择try-catch-finally，还是throws尼？
 * 			3.1执行方法m3()时，先后调用了其他方法，这几个方法的关系是递进关系执行的。此时建议另外几个方法使用throws方式进行处理
 * 			3.2而执行的方法m3()可以考虑try-catch-finally方法进行处理
 * 		4.子类重写方法抛出的异常不大于父类抛出的异常，如果父类方法未抛出异常，则子类方法不能抛出异常，若子类的方法中有异常出现，则必须使用try-catch-finally方式处理
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
