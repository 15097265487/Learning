package cn.tedu.exer;

public class Thead01 {
	public static void main(String[] args) {
		Stu s = new Stu();//创建对象
		Stu s1 = new Stu();
		s.start();//启动线程
		Thread.currentThread().setName("Run线程");
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
				//stop();//结束线程
				try {
					Thread.sleep(10000);//让线程等待10000毫秒
					System.out.println("等待结束");
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
