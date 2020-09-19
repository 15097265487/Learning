package cn.tedu.demo1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 	创建线程的第三种方式：实现Callable接口
 *
 *
 */

public class CallableTest {
	public static void main(String[] args) {
		//3.创建当前实现类的对象
		
		
		NumThread n = new NumThread();
		//4.
		FutureTask f = new FutureTask(n);
		//5.
		new Thread(f).start();
		//6.
		try {
			Object su = f.get();
			System.out.println("总和："+su);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
//1.
class NumThread implements Callable{
//2.
	@Override
	public Object call() throws Exception {
		int sum = 0;
		for(int i=1;i<101;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
//		System.out.println(sum);
		return sum;
	}
	
}