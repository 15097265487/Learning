package cn.tedu.demo2;

public class ErrorTest {
	public static void main(String[] args) {
		//1.Õ»Òç³ö£ºjava.lang.StackOverflowError
		//main(args);
		//2.¶ÑÒç³ö£ºjava.lang.OutOfMemoryError
		Integer[] arr = new Integer[1024*1024*1024];
	}

}
