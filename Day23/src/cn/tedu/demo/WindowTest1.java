package cn.tedu.demo;
/*
 *	 ģ���վ��Ʊ��
 * 		�������ڣ�1-100
 * 		1.���⣺��Ʊ�����г��ֵ���Ʊ����Ʊ------>�̰߳�ȫ����
 * 		2.ԭ��ĳ���̲߳�����Ʊʱ��������δ��ɣ������߳̾Ͳ��������Ҳ������Ʊ
 * 		3.��ν������һ���߳��ڲ�����Ʊʱ�������̲߳��ܲ��������ֱ���̲߳�����ɣ������̲߳ſ��Խ�����
 * 				���������ʹ�̳߳�����������Ҳ���ܸı�
 * 		4.java�У�ͨ��ͬ�����ƣ�������̰߳�ȫ����
 * 
 * 			��ʽһ��ͬ�������
 * 				synchronized(ͬ��������){
 * 					//��Ҫ��ͬ���Ĵ���
 * 				}
 * 				1.˵���������������ݴ��룬��Ϊ��ͬ������飨���ܰ���������ˣ�Ҳ���ܰ����������ˣ�
 * 				2.�������ݣ�����̹߳�ͬ�����Ķ�����ticket
 * 				3.ͬ�����������׳ƣ���
 * 					�κ�һ����Ķ��󣬶����Գ䵱��
 * 					Ҫ�󣺶���̱߳��빲��ͬһ����	
 * 			ע�⣺
 * 				���ڼ̳�Thread�ഴ�����̵߳ķ�ʽ�У�����this�䵱ͬ��������������ʹ�õ�ǰ��䵱ͬ�������� ������.class��
 * 				����ʵ��Runnable�ӿڴ������̵߳ķ�ʽ�У����ǿ��Կ���this�䵱ͬ����������
 * 			��ʽ����ͬ������
 * 				��������������ݵĴ���������������һ�������У����ǲ������˷�������Ϊͬ���ġ�
 * 				��ͬ��������Ȼ�漰ͬ����������ֻ�ǲ���Ҫ��ʾ�ķų���
 * 				�ڷǾ�̬�ķ�����ͬ��������Ϊthis����̬������ͬ��������Ϊ��ǰ�౾��
 * 		5.ͬ���ķ�ʽ��������̵߳İ�ȫ����--------->�ô�
 * 		  ����ͬ������ʱ��ֻ����һ���̲߳��룬�����̵߳ȴ����൱��һ�����̣߳�Ч�ʵ�------->������
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

		t1.start();//
		t2.start();
		t3.start();
	}
}

class MTh extends Thread {
	private static int ticket = 100;
	private static Object obj = new Object();

	@Override
	public void run() {
		while (true) {
			//synchronized (this)�������ڼ̳�����       this����t1��t2��t3
			//synchronized (MTh.class)Ψһ�ģ���ֻ�����һ��
			synchronized (obj) {
				if (ticket > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + ",��Ʊ:" + ticket);
					ticket--;
				} else {
					break;
				}
			}
		}
	}
}
