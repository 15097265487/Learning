package cn.tedu.test;

public class AccountTest {

	public static void main(String[] args) {
//		Account a = new Account(1122, 20000, 0.045);
//		a.withdraw(30000);
//		System.out.println();
//		a.deposit(3000);
		CheckAccount c = new CheckAccount(1122, 20000, 0.045, 5000);
		c.withdraw(15000);
		System.out.println();
		c.withdraw(20000);
		System.out.println();
		c.withdraw(30000);
		
	}

}
