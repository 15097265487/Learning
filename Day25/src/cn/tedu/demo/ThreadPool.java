package cn.tedu.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 	�����̵߳ķ�ʽ�ģ��̳߳�

 * 	�ٴ���ʵ��Runnable�ӿڵ���
	��ʵ��run()���������߳���Ҫִ�еĴ�����������������С�
	�۴���ָ���߳��������̳߳�
		�磺ExecutorService service = Executors.newFixedThreadPool(10);
	��ִ��ָ�����̲߳�������Ҫ�ṩʵ��Runnable�ӿڻ�Callable�ӿڵ�ʵ����
		�磺service.execute(new NumThread1());
	�ݹر��̳߳�
		�磺service.shutdown()
 * 
 * 		�ô���
 * 			�����Ӧ���ٶȣ����ٴ����̵߳�ʱ�䣩
 * 			������Դ���ģ��ظ������̳߳��е��̣߳�����Ҫÿ�δ�����
 * 			�����̵߳Ĺ���
 * 
 * 			corePoolSize:���ĳصĴ�С
 * 			maxmumPoolSize:����߳���
 * 			KeepAliveTime:�߳�û������ʱ��ౣ�ֶ೤ʱ����ֹͣ
 * 
 * 
 * 
 * 
 * 	�������̵߳ķ�ʽ�м��֣�      4�֣�����
 * 
 * 
 * @author UID-ECD
 *
 */
public class ThreadPool {
	public static void main(String[] args) {
		//1.����ָ���߳��������̳߳�
		ExecutorService service = Executors.newFixedThreadPool(10);
		System.out.println(service.getClass());
		//����ת��
		ThreadPoolExecutor s = (ThreadPoolExecutor) service;
		s.setCorePoolSize(15);
		s.setMaximumPoolSize(9);//���� java.lang.IllegalArgumentException
		//s.setKeepAliveTime(time, unit);
		
		
		//2.ִ��ָ�����̲߳�������Ҫ�ṩʵ��Runnable�ӿڻ�Callable�ӿڵ�ʵ����
		service.execute(new NumThread1());
		//service.submit(Callable task);
		
		//3.�ر��̳߳�
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