package cn.tedu.demo;


public class ThreadExer {
	public static void main(String[] args) {
		A1 t1 = new A1();
		A2 t2 = new A2();
		t1.start();
		t2.start();
		
		
	}
}
class A1 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	}
}
class A2 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	}
}