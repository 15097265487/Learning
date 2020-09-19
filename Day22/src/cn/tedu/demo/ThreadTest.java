package cn.tedu.demo;

/**
 * 
 *	线程：
 *		进程可以进一步细化为线程，是一个程序内部的一条执行路径
 *	二、多线程的创建
 *	方式一、继承于Tread类
 *		1.创建一个子类的Tread类
 *		2.重写run()------>将此线程执行的操作声明
 *		3.创建Thread子类的对象
 *		4.创建该对象来调用start()
 *
 *	问题一：不能直接调用run()启动线程，需要调用start()
 *	问题二：不可以将一个线程启动多次，即再次调用start()----->(可以创建新的线程类的对象，调用start())
 *			  IllegalThreadStateException
 *
 *	
 */

public class ThreadTest {
	public static void main(String[] args) {
		//3.创建子类对象
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		//4.通过创建对象来调用start()
		t1.start();//使用线程开始执行；java虚拟机调用该线程的run()方法
		//t.run();
		t2.start();
		//下面操作在main线程执行
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
