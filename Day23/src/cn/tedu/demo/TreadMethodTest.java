package cn.tedu.demo;
/**
 * @
 * 	线程Thread中常用方法
 * 		start():启动当前的线程，调用当前的线程run方法
 * 		run():通常需要重写Tread类中的run()方法，将创建线程要执行的任务放在该方法中
 * 		currentTread():静态方法，返回当前代码的线程
 * 		getName():获取当前线程的名字
 * 		setName():设置当前线程的名字
 * 		yield():让出执行权限,让其他线程得以优先执行,但其他线程能否优先执行是未知的        （释放当前的CPU执行权）
 * 		join():等待目标线程完成后再执行         （在线程a中调用线程b的join()，此时线程a进入阻塞状态，只到线程b执行完成以后，线程a才能结束阻塞状态）
 * 		stop():已过时
 * 		sleep():该函数是Thread的静态函数,作用是使当前线程进入睡眠状态,因为其是静态方法,所以不会改变对象机锁,
 * 				即使睡眠也持有对象锁,其他对象无法访问这个对象     （让当前的线程“睡眠”指定毫秒，在指定的时间内，当前的线程是阻塞状态）
 * 		isAlive():判断当前线程是否活着
 * 
 * 
 * 		设置线程的优先级：
 * 			MAX_PRIORITY: 线程可以具有的最高优先级。
 * 			MIN_PRIORITY: 线程可以具有的最低优先级。
			NORM_PRIORITY: 分配给线程的默认优先级。
		如何获取设置当前线程的优先级
			getPriority()
			setPriority(int p);
		说明：高优先级的线程要抢占低优先级线程cpu的执行权。但是只是从概率上，并不是高优先级的线程执行完毕后在执行低优先级

 *
 */

public class TreadMethodTest {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.setName("线程一");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t1.currentThread();
		System.out.println(t1.getName());
		Thread.currentThread().setName("主线程");
		//设置主线程的优先级
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("优先级"+t1.getPriority());
		System.out.println(""+Thread.currentThread().getPriority());
		for(int i=0;i<50;i++) {
			if(i%2==0) {
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
			if(i==10) {//主线程：10  ------->执行其他线程（在别的线程没执行完成之前）
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
//				sleep(100);//线程等待等待100毫秒
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			if(!flag) continue;
			System.out.println(Thread.currentThread().getName()+":"+i);
			if(i==23) {
				//yield();//释放当前的CPU执行权
				//stop();//停止线程
			}
		}

	}
}