package cn.tedu.exer;

public class ThreadTest01 {
	public static void main(String[] args) {
		
		My1 m = new My1();
		Thread t = new Thread(m);
		t.start();
		
	}
}
class My1 implements Runnable{

	@Override
	public void run() {
		int sum=0;
		for(int i=0;i<50;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}