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
	//����������
	public double getMonthlylnterest() {
		return annuallnterestRate*balance;
	}
	//ȡ��
	public void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("����!");
			System.out.println("�����˻����Ϊ��"+balance);
		}
	}
	//���
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("�����˻����Ϊ��"+balance);
		System.out.println("�����ʣ�"+this.getMonthlylnterest());
	}
	
	

}
