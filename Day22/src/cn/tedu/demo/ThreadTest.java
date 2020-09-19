package cn.tedu.demo;

/**
 * 
 *	�̣߳�
 *		���̿��Խ�һ��ϸ��Ϊ�̣߳���һ�������ڲ���һ��ִ��·��
 *	�������̵߳Ĵ���
 *	��ʽһ���̳���Tread��
 *		1.����һ�������Tread��
 *		2.��дrun()------>�����߳�ִ�еĲ�������
 *		3.����Thread����Ķ���
 *		4.�����ö���������start()
 *
 *	����һ������ֱ�ӵ���run()�����̣߳���Ҫ����start()
 *	������������Խ�һ���߳�������Σ����ٴε���start()----->(���Դ����µ��߳���Ķ��󣬵���start())
 *			  IllegalThreadStateException
 *
 *	
 */

public class ThreadTest {
	public static void main(String[] args) {
		//3.�����������
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		//4.ͨ����������������start()
		t1.start();//ʹ���߳̿�ʼִ�У�java��������ø��̵߳�run()����
		//t.run();
		t2.start();
		//���������main�߳�ִ��
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
