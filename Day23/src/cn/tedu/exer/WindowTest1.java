package cn.tedu.exer;
/*
 *	 模拟火车站买票：
 * 		三个窗口：1-100
 * 		存在线程安全
 */

public class WindowTest1 {
	public static void main(String[] args) {
		MTh t = new MTh();
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

class MTh implements Runnable {
	private static int ticket = 100;

	@Override
	public void run() {
		while (true) {
			if (ticket > 0) {
				System.out.println(Thread.currentThread().getName() + ",买票:" + ticket);
				ticket--;
			} else {
				break;
			}
		}
	}
}
