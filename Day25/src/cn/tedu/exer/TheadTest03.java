package cn.tedu.exer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class TheadTest03 {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(5);
		//System.out.println(es.getClass());
		
		//ThreadPoolExecutor s = (ThreadPoolExecutor) es;
		//匿名类实现
		es.execute(new My3());
		//关闭
		es.shutdown();
	}
}
class My3 implements Runnable{

	@Override
	public void run() {
		int sum=0;
		for(int i=0;i<50;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
}