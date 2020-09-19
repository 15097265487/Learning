package cn.tedu.demo1;
/*
 * 	�߳�ͨ�ţ�
 * 		ʹ�������̴߳�ӡ1-100���߳�1���߳�2�����ӡ
 * 		�������ݣ�num---->�̰߳�ȫ
 * 
 * 	1.�漰3�ַ���
 * 		wait()һ��ִ�е��˷�������ǰ�߳̾ͻ��������״̬��
 * 		notify()һ��ִ�е��˷������ͻỽ�ѱ�wait()�������̣߳�����ж����wait�ģ��Ȼ������ȼ��ߵ�
 * 		notifyAll()һ��ִ�е��˷������ͻỽ�����б�wait��
 * 	2.ʹ��˵��
 * 		��wait() notify()  notifyAll()��������ʹ����ͬ��������ͬ��������
 * 		��wait() notify()  notifyAll()�������������߱�����ͬ��������ͬ�������е�ͬ��������
 * 		��wait() notify()  notifyAll()��������������Object��
 * 
 * 
 * 	�����⣺sleep()��wait()����
 * 		��ͬ�㣺������ʹ���߳̽�������״̬
 * 		��ͬ�㣺�ٱ�wait()���߳���Ҫʹ��notify()���ѣ���sleep()���߳�ʱ�䵽����������״̬
 *            ��������λ�ã�Thread������sleep()
 *            			Object������wait()
 *            ��ʹ��λ�ã�sleep()����������Ҫ�ĳ�����ʹ��
 *            		  wait()����ʹ����ͬ��������ͬ��������
 *            ���Ƿ��ͷ�ͬ��������������
 *            	������������ʹ��ͬ��������ͬ�������У�
 *            		sleep()�����ͷ���
 *            		wait()���ͷ���
 */

public class CommunicationTest {

	public static void main(String[] args) {
		Num num = new Num();
		Thread t1 = new Thread(num);
		Thread t2 = new Thread(num);
		
		t1.start();
		t2.start();
	}

}

class Num implements Runnable {
	private int num = 1;
	private Object obj = new Object();
	@Override
	public void run() {
		while (true) {
			//ͬ������飬ͬ����������this
			synchronized (obj) {
				obj.notify();//����
				if (num <= 100) {
					System.out.println(Thread.currentThread().getName() + ":" + num);
					num++;
					try {
						obj.wait();//�ǵ�ǰ�߳̽��뵽����״̬
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					break;
				}
			}
		}
	}

}