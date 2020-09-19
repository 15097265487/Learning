package cn.tedu.demo1;
/*
 * 	线程通信：
 * 		使用两个线程打印1-100，线程1、线程2交替打印
 * 		共享数据：num---->线程安全
 * 
 * 	1.涉及3种方法
 * 		wait()一旦执行到此方法，当前线程就会进入阻塞状态，
 * 		notify()一旦执行到此方法，就会唤醒被wait()阻塞的线程，如果有多个被wait的，先唤醒优先级高的
 * 		notifyAll()一旦执行到此方法，就会唤醒所有被wait的
 * 	2.使用说明
 * 		①wait() notify()  notifyAll()三个必须使用在同步代码块或同步方法中
 * 		②wait() notify()  notifyAll()三个方法调用者必须是同步代码块或同步方法中的同步监视器
 * 		③wait() notify()  notifyAll()三个方法定义在Object中
 * 
 * 
 * 	面试题：sleep()和wait()区别：
 * 		相同点：都可以使得线程进入阻塞状态
 * 		不同点：①被wait()的线程需要使用notify()唤醒，被sleep()的线程时间到即结束阻塞状态
 *            ②声明的位置：Thread中声明sleep()
 *            			Object中声明wait()
 *            ③使用位置：sleep()可以任意需要的场景下使用
 *            		  wait()必须使用在同步代码块或同步方法中
 *            ④是否释放同步监视器（锁）
 *            	（两个方法都使用同步代码块或同步方法中）
 *            		sleep()不会释放锁
 *            		wait()会释放锁
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
			//同步代码块，同步监视器：this
			synchronized (obj) {
				obj.notify();//唤醒
				if (num <= 100) {
					System.out.println(Thread.currentThread().getName() + ":" + num);
					num++;
					try {
						obj.wait();//是当前线程进入到阻塞状态
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