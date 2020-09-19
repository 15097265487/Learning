package cn.tedu.demo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverrideTest {
	public static void main(String[] args) {
		SubClass s = new SubClass();
		try {
			s.method();
			s.m();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e){
			
		}
	}
}
class SuperClass{
	public void m() throws IOException {
		method();//当子类对象调用m()方法时，方法体中执行的是子类重写的method()
	}
	public void method() throws IOException{
		System.out.println("123");
	}
}
class SubClass extends SuperClass{
	public void method() throws FileNotFoundException{
		System.out.println("abc");
	}
}