package cn.tedu.demo;
/*
 *	 �����̵߳ĵڶ��ַ�����ʵ��Runnable
 *		1.����һ��ʵ��Runnable�ӿڵ�ʵ����
 *		2.ʵ����ȥʵ��Runnable�еĳ��󷽷���run()
 *		3.����ʵ����Ķ���
 *		4.��ʵ����Ķ�����Ϊ�������ݸ�Thread�๹�����У�����Thread��Ķ���
 *		5.ͨ��Thread��Ķ������start()
 *
 *	�Ƚϴ����̵߳����ַ�ʽ��
 *		�����У�����ѡRunnable
 *		ԭ��1.��̳��о�����ֻ�ɵ��̳У����ɶ�ʵ��
 *			2.ʵ�ֵķ�ʽ���ʺϴ������߳��й�����������
 *
 *		��ϵ��class Tread implements Runnable
 *		��ͬ������Ҫ��дRun()��������ִ���̵߳��߼�������run()������
 *		����ʹ����һ����extends����һ����implements
 */

public class TreadTest1 {
	public static void main(String[] args) {
		//3.����ʵ����Ķ���
		MyTread t = new MyTread();
		//4.��������Ϊ�������ݸ�Thread��Ĺ�������,����Thread��Ķ���
		Thread t1 = new Thread(t);
		t1.setName("�߳�һ");
		//5.ʹ��Thread��Ķ������start
		//�������߳�   �ڵ���run()����
		t1.start();
		
	}
}
class MyTread implements Runnable{//1.ʵ�ֽӿ�Runnable
	//2.��д����
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			if(i%2==0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	}
}
