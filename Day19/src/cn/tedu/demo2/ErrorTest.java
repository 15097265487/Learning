package cn.tedu.demo2;

public class ErrorTest {
	public static void main(String[] args) {
		//1.ջ�����java.lang.StackOverflowError
		//main(args);
		//2.�������java.lang.OutOfMemoryError
		Integer[] arr = new Integer[1024*1024*1024];
	}

}
