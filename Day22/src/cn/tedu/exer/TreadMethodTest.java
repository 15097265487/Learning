package cn.tedu.exer;
/**
 * @author UID-ECD
 * 	�߳�Tread�г��÷���
 * 		start():������ǰ���̣߳����õ�ǰ���߳�run����
 * 		run():ͨ����Ҫ��дTread���е�run()�������������߳�Ҫִ�е�������ڸ÷�����
 * 		currentTread():��̬���������ص�ǰ������߳�
 * 		getName():��ȡ��ǰ�̵߳�����
 * 		setName():���õ�ǰ�̵߳�����
 * 		yield():�ó�ִ��Ȩ��,�������̵߳�������ִ��,�������߳��ܷ�����ִ����δ֪��
 * 		join():�ȴ�Ŀ���߳���ɺ���ִ��
 * 		stop():�����߳�
 * 		sleep():�ú�����Thread�ľ�̬����,������ʹ��ǰ�߳̽���˯��״̬,��Ϊ���Ǿ�̬����,���Բ���ı�������,��ʹ˯��Ҳ���ж�����,���������޷������������
 * 		isAlive():�ж��Ƿ����
 *
 */

public class TreadMethodTest {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.setName("�߳�һ");
		t1.start();
		t1.currentThread();
		System.out.println(t1.getName());
		Thread.currentThread().setName("���߳�");
		System.out.println(Thread.currentThread().getName());
	}

}
class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i=2;i<100;i++){
			boolean flag=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag=false;
					break;
				}
			}
			if(!flag) continue;
			System.out.println(i);
		}

	}
}