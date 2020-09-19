package cn.tedu.demo;
/*
 *	 模拟火车站买票：
 * 		三个窗口：1-100
 * 		1.问题：买票过程中出现的重票、错票------>线程安全问题
 * 		2.原因：某个线程操作车票时，操作还未完成，其他线程就参与进来，也操作车票
 * 		3.如何解决：当一个线程在操作车票时，其他线程不能参与进来，直到线程操作完成，其他线程才可以进来，
 * 				这种情况即使线程出现了阻塞，也不能改变
 * 		4.java中，通过同步机制，来解决线程安全问题
 * 
 * 			方式一：同步代码块
 * 				synchronized(同步监视器){
 * 					//需要被同步的代码
 * 				}
 * 				1.说明：操作共享数据代码，即为被同步代码块（不能包含代码多了，也不能包含代码少了）
 * 				2.共享数据：多个线程共同操作的对象，如ticket
 * 				3.同步监视器：俗称：锁
 * 					任何一个类的对象，都可以充当锁
 * 					要求：多个线程必须共用同一把锁	
 * 			注意：
 * 				①在继承Thread类创建多线程的方式中，慎用this充当同步监视器，考虑使用当前类充当同步监视器 “类名.class”
 * 				②在实现Runnable接口创建多线程的方式中，我们可以考虑this充当同步监视器。
 * 			方式二：同步方法
 * 				如果操作共享数据的代码完整的声明在一个方法中，我们不妨将此方法声明为同步的。
 * 				①同步方法仍然涉及同步监视器，只是不需要显示的放出来
 * 				②非静态的方法，同步监视器为this，静态方法，同步监视器为当前类本身
 * 		5.同步的方式，解决了线程的安全问题--------->好处
 * 		  操作同步代码时，只能有一个线程参与，其他线程等待，相当于一个单线程，效率低------->局限性
 */

public class WindowTest1 {
	public static void main(String[] args) {
		MTh t = new MTh();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);

		t1.setName("窗口一");
		t2.setName("窗口二");
		t3.setName("窗口三");

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
			//synchronized (this)不能用在继承里面       this代表t1、t2、t3
			//synchronized (MTh.class)唯一的，类只会加载一次
			synchronized (obj) {
				if (ticket > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + ",买票:" + ticket);
					ticket--;
				} else {
					break;
				}
			}
		}
	}
}
