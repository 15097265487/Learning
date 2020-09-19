package cn.tedu.exer;

public class ProductTest {

	public static void main(String[] args) {
		Clerk cle = new Clerk();
		//创建实现类对象
		Productor p = new Productor(cle);
		Customer1 c = new Customer1(cle); 
		//创建线程对象
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		
		t1.setName("生产者");
		t2.setName("消费者");
		
		t1.start();
		t2.start();
		
	}

}
class Clerk{
	private int productorCount = 0;
	//买产品（生产产品）
	public synchronized void addProuuct() {
		if(productorCount<20) {
			productorCount++;
			System.out.println(Thread.currentThread().getName()+"开始生产第"+productorCount+"个产品");
			notify();//唤醒消费者
		}else {
			//不能再生产
			try {
				System.out.println("进入阻塞，不能生产商品");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	//卖产品（消费产品）
	public synchronized void subProduct() {
		if(productorCount>0) {
			System.out.println(Thread.currentThread().getName()+"开始消费第"+productorCount+"个产品");
			productorCount--;
			notify();//唤醒生产者
		}else {
			try {
				System.out.println("进入阻塞，不能购买商品");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Productor implements Runnable{//生产者
	private Clerk c;
	public Productor(Clerk c) {
		super();
		this.c = c;
	}
	@Override
	public void run() {
		System.out.println("开始了生产产品..................");
		while(true) {
			c.addProuuct();
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Customer1 implements Runnable{//消费者
	private Clerk c;
	public Customer1(Clerk c) {
	super();
	this.c = c;
}
	@Override
	public void run() {
		System.out.println("开始消费产品");
		while(true) {
			c.subProduct();
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}//code.tarena.com.cn