package cn.tedu.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 *	创建线程的第三种方法：实现Callable接口
		
		1.创建一个实现类实现Callable
		2.实现call()，将线程需要执行的代码声明在call()方法中
		3.创建Callable接口实现类的对象
		4.创建FutureTask类的对象，并将Callable接口实现类的对象作为参数传递到
		        FutureTask的构造器中
			FutureTask<V> implements RunnableFuture<V>
			RunnableFuture<V> extends Runnable, Future<V>
		5.   创建Thread类的对象，并将FutureTask类的对象作为参数传递给Thread构造其中
		        new Thread(FutureTask    ft)
		6.可选。获取Callable中call()的返回值
			Object futureTask.get()
 *
 */

public class CallableTest {
	public static void main(String[] args) {
		//3.创建Callable接口实现类的对象
		
		
		NumThread n = new NumThread();
		//4.创建FutureTask类的对象，并将Callable接口实现类的对象作为参数传递到
		FutureTask f = new FutureTask(n);
		//5.创建Thread类的对象，并将FutureTask类的对象作为参数传递给Thread构造其中
		new Thread(f).start();
		//6.可选。获取Callable中call()的返回值
		try {
			Object su = f.get();
			System.out.println("总和："+su);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
//1.创建一个实现类实现Callable
class NumThread implements Callable{
//2.实现call()，将线程需要执行的代码声明在call()方法中
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