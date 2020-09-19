package cn.tedu.exer;
/*
 * 	�����������ֱ���һ���˻���3000Ԫ��
 * 	ÿ�δ�1000��ÿ�δ�ӡ�˻����
 * 	
 * 	�̣߳����������߳�
 * 	�������ݣ��˻�����-----�����̰߳�ȫ����
 * 	������⣺ͬ�����ơ�
 */
public class BamkTest {
	public static void main(String[] args) {
		Account act = new Account(0);
		Customer c1 = new Customer(act);
		Customer c2 = new Customer(act);
		
		c1.setName("��");
		c2.setName("��");
		
		c1.start();
		c2.start();
	}
}
class Account {
	private int balance;
	
	public Account() {
		super();
	}
	public Account(int balance) {
		super();
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	//��Ǯ
	//public synchronized void addMoney(int money) {�����ã�ͬ��������----------------��this��ʾact
	public synchronized void addMoney(int money) {
		if(money>0) {
			balance += money;
			System.out.println(Thread.currentThread().getName()+"��Ǯ�ɹ������Ϊ"+balance);
		}
	}
}
class Customer extends Thread{
	private Account act;

	public Customer() {
		super();
	}
	public Customer(Account act) {
		super();
		this.act = act;
	}
	public Account getAct() {
		return act;
	}
	public void setAct(Account act) {
		this.act = act;
	}
	
	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			act.addMoney(1000);
		}
	}
}