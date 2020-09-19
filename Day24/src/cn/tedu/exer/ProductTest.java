package cn.tedu.exer;

public class ProductTest {

	public static void main(String[] args) {
		Clerk cle = new Clerk();
		//����ʵ�������
		Productor p = new Productor(cle);
		Customer1 c = new Customer1(cle); 
		//�����̶߳���
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		
		t1.setName("������");
		t2.setName("������");
		
		t1.start();
		t2.start();
		
	}

}
class Clerk{
	private int productorCount = 0;
	//���Ʒ��������Ʒ��
	public synchronized void addProuuct() {
		if(productorCount<20) {
			productorCount++;
			System.out.println(Thread.currentThread().getName()+"��ʼ������"+productorCount+"����Ʒ");
			notify();//����������
		}else {
			//����������
			try {
				System.out.println("��������������������Ʒ");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	//����Ʒ�����Ѳ�Ʒ��
	public synchronized void subProduct() {
		if(productorCount>0) {
			System.out.println(Thread.currentThread().getName()+"��ʼ���ѵ�"+productorCount+"����Ʒ");
			productorCount--;
			notify();//����������
		}else {
			try {
				System.out.println("�������������ܹ�����Ʒ");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Productor implements Runnable{//������
	private Clerk c;
	public Productor(Clerk c) {
		super();
		this.c = c;
	}
	@Override
	public void run() {
		System.out.println("��ʼ��������Ʒ..................");
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
class Customer1 implements Runnable{//������
	private Clerk c;
	public Customer1(Clerk c) {
	super();
	this.c = c;
}
	@Override
	public void run() {
		System.out.println("��ʼ���Ѳ�Ʒ");
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