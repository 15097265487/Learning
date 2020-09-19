package cn.tedu.exer;
/*
 *	 ģ���վ��Ʊ��
 * 		�������ڣ�1-100
 * 		�����̰߳�ȫ
 */

public class WindowTest1 {
	public static void main(String[] args) {
		MTh t = new MTh();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);

		t1.setName("����һ");
		t2.setName("���ڶ�");
		t3.setName("������");

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
				System.out.println(Thread.currentThread().getName() + ",��Ʊ:" + ticket);
				ticket--;
			} else {
				break;
			}
		}
	}
}
