package cn.tedu.exer;
/**
 * @author UID-ECD
 * 	线程Tread中常用方法
 * 		start():启动当前的线程，调用当前的线程run方法
 * 		run():通常需要重写Tread类中的run()方法，将创建线程要执行的任务放在该方法中
 * 		currentTread():静态方法，返回当前代码的线程
 * 		getName():获取当前线程的名字
 * 		setName():设置当前线程的名字
 * 		yield():让出执行权限,让其他线程得以优先执行,但其他线程能否优先执行是未知的
 * 		join():等待目标线程完成后再执行
 * 		stop():结束线程
 * 		sleep():该函数是Thread的静态函数,作用是使当前线程进入睡眠状态,因为其是静态方法,所以不会改变对象机锁,即使睡眠也持有对象锁,其他对象无法访问这个对象
 * 		isAlive():判断是否活着
 *
 */

public class TreadMethodTest {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.setName("线程一");
		t1.start();
		t1.currentThread();
		System.out.println(t1.getName());
		Thread.currentThread().setName("主线程");
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