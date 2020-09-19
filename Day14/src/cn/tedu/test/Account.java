package cn.tedu.test;

public class Account {
	private int id;
	protected double balance;
	private double annuallnterestRate;
	
	public Account(int id, double balance, double annuallnterestRate) {
		this.id = id;
		this.balance = balance;
		this.annuallnterestRate = annuallnterestRate;
	}
	//返回月利率
	public double getMonthlylnterest() {
		return annuallnterestRate*balance;
	}
	//取款
	public void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("余额不足!");
			System.out.println("您的账户余额为："+balance);
		}
	}
	//存款
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("您的账户余额为："+balance);
		System.out.println("月利率："+this.getMonthlylnterest());
	}
	
	

}
