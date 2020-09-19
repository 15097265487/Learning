package cn.tedu.demo;

import java.util.concurrent.locks.ReentrantLock;

/*
 * 	解决线程安全问题三：
 * 		
 * 
 * 		synchronized和lock区别
 * 		相同点：二者都能解决线程安全问题
 * 		不同点：synchronized机制执行完成以后，主动释放资源
 * 			 Lock需要手动的启动同步（Lock()）结束同步也需要手动实现（unlock()）
 *      synchronized有代码块锁和方法
 *        Lock只有代码块锁
 *	使用顺序：
 * 	Lock--->同步代码块--->同步方法
 */

public class LockDemo {
	public static void main(String[] args) {
		Window w = new Window();
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);
		Thread t3 = new Thread(w);
		
		t1.setName("窗口1：");
		t2.setName("窗口2：");
		t3.setName("窗口3：");
		 
		t1.start();
		t2.start();
		t3.start();
	}
}
class Window implements Runnable{
	private int ticket = 100;
	//1.lock类型的对象
	private final ReentrantLock lock = new ReentrantLock();
	@Override
	public void run() {
		while (true) {
			try {
				//2.调用锁的方法 lock()
				lock.lock();
				if(ticket>0) {
					System.out.println(Thread.currentThread().getName()+"售票:"+ticket);
					ticket--;
				}else {
					break;
				}
			}finally {
				//3.调用解锁的方法   unlock()
				lock.unlock();
			}
		}	
	}
	
}