package cn.tedu.exer;

public class Thead01 {
	public static void main(String[] args) {
		Stu s = new Stu();//��������
		Stu s1 = new Stu();
		s.start();//�����߳�
		Thread.currentThread().setName("Run�߳�");
		System.out.println(Thread.currentThread().getName());
		
		s1.start();
	}
}
class Stu extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			if(i==5) {
				//stop();//�����߳�
				try {
					Thread.sleep(10000);//���̵߳ȴ�10000����
					System.out.println("�ȴ�����");
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
