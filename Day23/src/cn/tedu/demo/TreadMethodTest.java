package cn.tedu.demo;
/**
 * @
 * 	�߳�Thread�г��÷���
 * 		start():������ǰ���̣߳����õ�ǰ���߳�run����
 * 		run():ͨ����Ҫ��дTread���е�run()�������������߳�Ҫִ�е�������ڸ÷�����
 * 		currentTread():��̬���������ص�ǰ������߳�
 * 		getName():��ȡ��ǰ�̵߳�����
 * 		setName():���õ�ǰ�̵߳�����
 * 		yield():�ó�ִ��Ȩ��,�������̵߳�������ִ��,�������߳��ܷ�����ִ����δ֪��        ���ͷŵ�ǰ��CPUִ��Ȩ��
 * 		join():�ȴ�Ŀ���߳���ɺ���ִ��         �����߳�a�е����߳�b��join()����ʱ�߳�a��������״̬��ֻ���߳�bִ������Ժ��߳�a���ܽ�������״̬��
 * 		stop():�ѹ�ʱ
 * 		sleep():�ú�����Thread�ľ�̬����,������ʹ��ǰ�߳̽���˯��״̬,��Ϊ���Ǿ�̬����,���Բ���ı�������,
 * 				��ʹ˯��Ҳ���ж�����,���������޷������������     ���õ�ǰ���̡߳�˯�ߡ�ָ�����룬��ָ����ʱ���ڣ���ǰ���߳�������״̬��
 * 		isAlive():�жϵ�ǰ�߳��Ƿ����
 * 
 * 
 * 		�����̵߳����ȼ���
 * 			MAX_PRIORITY: �߳̿��Ծ��е�������ȼ���
 * 			MIN_PRIORITY: �߳̿��Ծ��е�������ȼ���
			NORM_PRIORITY: ������̵߳�Ĭ�����ȼ���
		��λ�ȡ���õ�ǰ�̵߳����ȼ�
			getPriority()
			setPriority(int p);
		˵���������ȼ����߳�Ҫ��ռ�����ȼ��߳�cpu��ִ��Ȩ������ֻ�ǴӸ����ϣ������Ǹ����ȼ����߳�ִ����Ϻ���ִ�е����ȼ�

 *
 */

public class TreadMethodTest {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.setName("�߳�һ");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t1.currentThread();
		System.out.println(t1.getName());
		Thread.currentThread().setName("���߳�");
		//�������̵߳����ȼ�
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("���ȼ�"+t1.getPriority());
		System.out.println(""+Thread.currentThread().getPriority());
		for(int i=0;i<50;i++) {
			if(i%2==0) {
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
			if(i==10) {//���̣߳�10  ------->ִ�������̣߳��ڱ���߳�ûִ�����֮ǰ��
				try {
					t1.join();
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		System.out.println(t1.isAlive());//false
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
//			try {
//				sleep(100);//�̵߳ȴ��ȴ�100����
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			if(!flag) continue;
			System.out.println(Thread.currentThread().getName()+":"+i);
			if(i==23) {
				//yield();//�ͷŵ�ǰ��CPUִ��Ȩ
				//stop();//ֹͣ�߳�
			}
		}

	}
}