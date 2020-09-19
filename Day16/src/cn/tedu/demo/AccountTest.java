package cn.tedu.demo;

public class AccountTest {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account("abcd",2000);
        Account.setRate(0.04);
        double min = Account.getMinMoney();
        System.out.println(a1);
        System.out.println(a2);

        System.out.println(a1.getRate());
        System.out.println(a2.getRate());
        System.out.println(min);
    }
}
