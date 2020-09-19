package cn.tedu.test;



public class CheckAccount extends Account{
	//属性
	private double overdraft;//可透支
	//构造方法
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
	//透支
	public double overdraw() {
		return overdraft;
	}
	//取款
	public void withdraw(double amount) {
		
		if(amount<balance) {
			System.out.println("您的账户余额为："+amount);
			System.out.println("您的可透支余额："+this.overdraw());
			
		}else if(amount==balance) {
			balance-=amount;
			System.out.println("您的账户余额为："+balance);
			System.out.println("您的可透支余额：0.0");
		}else if(amount>balance) {
			System.out.println("超过可透支余额！");
		}
	}

}
