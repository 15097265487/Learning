package cn.tedu.demo;
/**
 * 	������
 * 		��ͬ�̷ֱ߳�ռ�öԷ���Ҫ��ͬ����Դ�����������ڵȴ��Է��������Լ���Ҫ��ͬ����Դ�����γ��̵߳�����
 * 		������������������쳣��
 * 	1.��⣺
 * 		��ͬ���̷ֱ߳�ռ�öԷ���Ҫ��ͬ����Դ�����������ڵȴ��Է������Լ���Ҫ��ͬ����Դ�����γ���������
 * 	2.˵����
 * 		2.1������������������쳣�����������ʾ��ֻ����·���ڴ�������״̬���޷�����ִ��
 * 		2.2ʹ��ͬ��ʱ�������������
 * 		2.3��������ͬ����Դ�Ķ���
 * 		2.4��������Ƕ��ͬ��
 * 		
 **/

public class DeadLockTest {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer();
		StringBuffer s2 = new StringBuffer();
		new Thread() {
			@Override
			public void run() {
				synchronized (s1) {
					s1.append("a");
					s2.append("1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (s2) {
						s1.append("b");
						s2.append("2");
						System.out.println(s1);
						System.out.println(s2);
					}
				}
			}
		}.start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (s2) {
					s1.append("c");
					s2.append("3");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (s1) {
						s1.append("d");
						s2.append("4");
						System.out.println(s1);
						System.out.println(s2);
					}
				}
			}
		}).start();
	}
}
