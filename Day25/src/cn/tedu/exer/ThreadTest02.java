package cn.tedu.exer;

public class ThreadTest02 {
	public static void main(String[] args) {
		My2 m = new My2();
		m.start();
	}
}
class My2 extends Thread{
	@Override
	public void run() {
		int sum=0;
		for(int i=0;i<50;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}