package cn.tedu.exer;
/*
 * 	有两个储户分别向一个账户存3000元。
 * 	每次存1000，每次打印账户余额
 * 	
 * 	线程：两个储户线程
 * 	共享数据：账户（余额）-----存在线程安全问题
 * 	解决问题：同步机制。
 */
public class BamkTest {
	public static void main(String[] args) {
		Account act = new Account(0);
		Customer c1 = new Customer(act);
		Customer c2 = new Customer(act);
		
		c1.setName("甲");
		c2.setName("乙");
		
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
	//存钱
	//public synchronized void addMoney(int money) {可以用（同步方法）----------------》this表示act
	public synchronized void addMoney(int money) {
		if(money>0) {
			balance += money;
			System.out.println(Thread.currentThread().getName()+"存钱成功！余额为"+balance);
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