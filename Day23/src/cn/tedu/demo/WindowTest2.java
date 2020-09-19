package cn.tedu.demo;

public class WindowTest2 {
	public static void main(String[] args) {
		MyThread t = new MyThread();
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

class MyThread implements Runnable {
	private int ticket = 100;

	@Override
	public void run() {
		//Object obj = new Object();有多个obj产生对象
		while (true) {
			//方式二：this当前对象，唯一的对象
			synchronized (this) {
				if (ticket > 0) {
					System.out.println(Thread.currentThread().getName() + ",买票:" + ticket);
					ticket--;
				} else {
					break;
				}
			}
		}
	}
}
