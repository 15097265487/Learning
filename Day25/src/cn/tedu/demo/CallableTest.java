package cn.tedu.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 *	�����̵߳ĵ����ַ�����ʵ��Callable�ӿ�
		
		1.����һ��ʵ����ʵ��Callable
		2.ʵ��call()�����߳���Ҫִ�еĴ���������call()������
		3.����Callable�ӿ�ʵ����Ķ���
		4.����FutureTask��Ķ��󣬲���Callable�ӿ�ʵ����Ķ�����Ϊ�������ݵ�
		        FutureTask�Ĺ�������
			FutureTask<V> implements RunnableFuture<V>
			RunnableFuture<V> extends Runnable, Future<V>
		5.   ����Thread��Ķ��󣬲���FutureTask��Ķ�����Ϊ�������ݸ�Thread��������
		        new Thread(FutureTask    ft)
		6.��ѡ����ȡCallable��call()�ķ���ֵ
			Object futureTask.get()
 *
 */

public class CallableTest {
	public static void main(String[] args) {
		//3.����Callable�ӿ�ʵ����Ķ���
		
		
		NumThread n = new NumThread();
		//4.����FutureTask��Ķ��󣬲���Callable�ӿ�ʵ����Ķ�����Ϊ�������ݵ�
		FutureTask f = new FutureTask(n);
		//5.����Thread��Ķ��󣬲���FutureTask��Ķ�����Ϊ�������ݸ�Thread��������
		new Thread(f).start();
		//6.��ѡ����ȡCallable��call()�ķ���ֵ
		try {
			Object su = f.get();
			System.out.println("�ܺͣ�"+su);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
//1.����һ��ʵ����ʵ��Callable
class NumThread implements Callable{
//2.ʵ��call()�����߳���Ҫִ�еĴ���������call()������
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