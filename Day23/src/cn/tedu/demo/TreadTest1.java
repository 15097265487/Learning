package cn.tedu.demo;
/*
 *	 创建线程的第二种方法：实现Runnable
 *		1.创建一个实现Runnable接口的实现类
 *		2.实现类去实现Runnable中的抽象方法：run()
 *		3.创建实现类的对象
 *		4.将实现类的对象作为参数传递给Thread类构造器中，创建Thread类的对象
 *		5.通过Thread类的对象调用start()
 *
 *	比较创建线程的两种方式：
 *		开发中：优先选Runnable
 *		原因：1.类继承有局限性只可单继承，但可多实现
 *			2.实现的方式更适合处理多个线程有共享的数据情况
 *
 *		联系：class Tread implements Runnable
 *		相同：都需要从写Run()方法，将执行线程的逻辑声明在run()方法中
 *		区别：使用上一个是extends，另一个是implements
 */

public class TreadTest1 {
	public static void main(String[] args) {
		//3.创建实现类的对象
		MyTread t = new MyTread();
		//4.将对象作为参数传递给Thread类的构造器中,创建Thread类的对象
		Thread t1 = new Thread(t);
		t1.setName("线程一");
		//5.使用Thread类的对象调用start
		//①启动线程   ②调用run()方法
		t1.start();
		
	}
}
class MyTread implements Runnable{//1.实现接口Runnable
	//2.重写方法
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
