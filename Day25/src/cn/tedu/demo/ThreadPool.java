package cn.tedu.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 	创建线程的方式四：线程池

 * 	①创建实现Runnable接口的类
	②实现run()方法，将线程需要执行的代码声明在这个方法中。
	③创建指定线程数量的线程池
		如：ExecutorService service = Executors.newFixedThreadPool(10);
	④执行指定的线程操作，需要提供实现Runnable接口或Callable接口的实现类
		如：service.execute(new NumThread1());
	⑤关闭线程池
		如：service.shutdown()
 * 
 * 		好处：
 * 			提高响应的速度（减少创建线程的时间）
 * 			降低资源消耗（重复利用线程池中的线程，不需要每次创建）
 * 			便于线程的管理
 * 
 * 			corePoolSize:核心池的大小
 * 			maxmumPoolSize:最大线程数
 * 			KeepAliveTime:线程没有任务时最多保持多长时间后会停止
 * 
 * 
 * 
 * 
 * 	创建多线程的方式有几种？      4种！！！
 * 
 * 
 * @author UID-ECD
 *
 */
public class ThreadPool {
	public static void main(String[] args) {
		//1.创建指定线程数量的线程池
		ExecutorService service = Executors.newFixedThreadPool(10);
		System.out.println(service.getClass());
		//向下转型
		ThreadPoolExecutor s = (ThreadPoolExecutor) service;
		s.setCorePoolSize(15);
		s.setMaximumPoolSize(9);//错误： java.lang.IllegalArgumentException
		//s.setKeepAliveTime(time, unit);
		
		
		//2.执行指定的线程操作，需要提供实现Runnable接口或Callable接口的实现类
		service.execute(new NumThread1());
		//service.submit(Callable task);
		
		//3.关闭线程池
		service.shutdown();
	}
}
class NumThread1 implements Runnable{
	
	@Override
	public void run() {
		for(int i=1;i<101;i++) {
			if(i%2==0) {
				try {
					Thread.sleep(100);
					System.out.println(Thread.currentThread().getName()+":"+i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}