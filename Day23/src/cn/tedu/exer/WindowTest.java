package cn.tedu.exer;
/*
 *	 模拟火车站买票：
 * 		三个窗口：1-100
 * 		存在线程安全
 */

public class WindowTest {
	public static void main(String[] args) {
		MThread t = new MThread();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);

		t1.setName("窗口一");
		t2.setName("窗口二");
		t3.setName("窗口三");

		t1.start();
		t2.start();
		t3.start();
	}
}

class MThread implements Runnable {
	private static int ticket = 100;

	@Override
	public void run() {
		while (ticket > 0) {
			sale();
		}
	}
	private synchronized void sale() {//内置锁（synchronized）
		                                 /*内置锁也叫互斥锁，可以保证线程的原子性，当线程进入方法时，会自动获得一个锁，
		                                                                                               一旦锁被获得，其他线程必须等待获得锁的线程执行完代码释放锁，会降低程序的执行效率
		                                  */
		if (ticket > 0) {
			System.out.println(Thread.currentThread().getName() + ",买票:" + ticket);
			ticket--;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
