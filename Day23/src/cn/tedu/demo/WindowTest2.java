package cn.tedu.demo;

public class WindowTest2 {
	public static void main(String[] args) {
		MyThread t = new MyThread();
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

class MyThread implements Runnable {
	private int ticket = 100;

	@Override
	public void run() {
		//Object obj = new Object();�ж��obj��������
		while (true) {
			//��ʽ����this��ǰ����Ψһ�Ķ���
			synchronized (this) {
				if (ticket > 0) {
					System.out.println(Thread.currentThread().getName() + ",��Ʊ:" + ticket);
					ticket--;
				} else {
					break;
				}
			}
		}
	}
}
