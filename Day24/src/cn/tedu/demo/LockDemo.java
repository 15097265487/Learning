package cn.tedu.demo;

import java.util.concurrent.locks.ReentrantLock;

/*
 * 	����̰߳�ȫ��������
 * 		
 * 
 * 		synchronized��lock����
 * 		��ͬ�㣺���߶��ܽ���̰߳�ȫ����
 * 		��ͬ�㣺synchronized����ִ������Ժ������ͷ���Դ
 * 			 Lock��Ҫ�ֶ�������ͬ����Lock()������ͬ��Ҳ��Ҫ�ֶ�ʵ�֣�unlock()��
 *      synchronized�д�������ͷ���
 *        Lockֻ�д������
 *	ʹ��˳��
 * 	Lock--->ͬ�������--->ͬ������
 */

public class LockDemo {
	public static void main(String[] args) {
		Window w = new Window();
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);
		Thread t3 = new Thread(w);
		
		t1.setName("����1��");
		t2.setName("����2��");
		t3.setName("����3��");
		 
		t1.start();
		t2.start();
		t3.start();
	}
}
class Window implements Runnable{
	private int ticket = 100;
	//1.lock���͵Ķ���
	private final ReentrantLock lock = new ReentrantLock();
	@Override
	public void run() {
		while (true) {
			try {
				//2.�������ķ��� lock()
				lock.lock();
				if(ticket>0) {
					System.out.println(Thread.currentThread().getName()+"��Ʊ:"+ticket);
					ticket--;
				}else {
					break;
				}
			}finally {
				//3.���ý����ķ���   unlock()
				lock.unlock();
			}
		}	
	}
	
}