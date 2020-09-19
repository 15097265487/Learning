package cn.tedu.demo1;

public class WindowTest1 {
	public static void main(String[] args) {
		Window1 t1 = new Window1();
		Window1 t2 = new Window1();
		Window1 t3 = new Window1();

		t1.setName("窗口一");
		t2.setName("窗口二");
		t3.setName("窗口三");

		t1.start();//
		t2.start();
		t3.start();
	}
}

class Window1 extends Thread {
	private static int ticket = 100;

	@Override
	public void run() {
		while (ticket > 0) {
			show();
		}
	}
	public static synchronized void show() {
		//public synchronized void show()错误，设置伪静态的
		
		if (ticket > 0) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ",买票:" + ticket);
			ticket--;
		}
	}
}