package cn.tedu.exer;
/*
 *	 ģ���վ��Ʊ��
 * 		�������ڣ�1-100
 * 		�����̰߳�ȫ
 */

public class WindowTest {
	public static void main(String[] args) {
		MThread t = new MThread();
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

class MThread implements Runnable {
	private static int ticket = 100;

	@Override
	public void run() {
		while (ticket > 0) {
			sale();
		}
	}
	private synchronized void sale() {//��������synchronized��
		                                 /*������Ҳ�л����������Ա�֤�̵߳�ԭ���ԣ����߳̽��뷽��ʱ�����Զ����һ������
		                                                                                               һ��������ã������̱߳���ȴ���������߳�ִ��������ͷ������ή�ͳ����ִ��Ч��
		                                  */
		if (ticket > 0) {
			System.out.println(Thread.currentThread().getName() + ",��Ʊ:" + ticket);
			ticket--;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
