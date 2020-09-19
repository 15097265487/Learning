package cn.tedu.exer;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/**
 *	 线程池的方法：
 * @author UID-ECD
 *
 */
public class CallableTest {
	public static void main(String[] args) {
		
		My m = new My();
		FutureTask f = new FutureTask(m);
		new Thread(f).start();
		try {
			Object sum=f.get();
			System.out.println(sum);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}

class My implements Callable{
	@Override
	public Object call() throws Exception {
		int sum=0;
		for(int i =0;i<50;i++) {
			sum+=i;
		}
		return sum;
	}
}
