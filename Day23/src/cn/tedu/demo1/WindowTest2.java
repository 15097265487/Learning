package cn.tedu.demo1;

public class WindowTest2 {
	public static void main(String[] args) {
		Window2 t = new Window2();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);

		t1.setName("����һ");
		t2.setName("���ڶ�");
		t3.setName("������");

		t1.start();//
		t2.start();
		t3.start();
	}
}

class Window2 implements Runnable {
	private static int ticket = 100;

	@Override
	public void run() {
		while (ticket > 0) {
			show();
		}
	}

	public synchronized void show() {
		if (ticket > 0) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ",��Ʊ:" + ticket);
			ticket--;
		}
	}
}
