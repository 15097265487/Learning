package cn.tedu.test;



public class CheckAccount extends Account{
	//����
	private double overdraft;//��͸֧
	//���췽��
	public CheckAccount(int id, double balance, double annuallnterestRate, double overdraft) {
		super(id, balance, annuallnterestRate);
		this.overdraft = overdraft;
	}
	public double getOverdraft() {
		return overdraft;
	}
	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	//͸֧
	public double overdraw() {
		return overdraft;
	}
	//ȡ��
	public void withdraw(double amount) {
		
		if(amount<balance) {
			System.out.println("�����˻����Ϊ��"+amount);
			System.out.println("���Ŀ�͸֧��"+this.overdraw());
			
		}else if(amount==balance) {
			balance-=amount;
			System.out.println("�����˻����Ϊ��"+balance);
			System.out.println("���Ŀ�͸֧��0.0");
		}else if(amount>balance) {
			System.out.println("������͸֧��");
		}
	}

}
