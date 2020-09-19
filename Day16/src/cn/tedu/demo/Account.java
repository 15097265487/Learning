package cn.tedu.demo;

public class Account {
    private int id;
    private String password;
    private double balance;
    private static double rate;
    private static double minMoney=10;
    private static int init = 10000;


    public Account() {
        id = init++;
    }
    public Account( String password, double balance) {
 //       this();
        id = init++;
        this.password = password;
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public double getBalance() {
        return balance;
    }
    public static double getRate() {
        return rate;
    }
    public static void setRate(double rate) {
        Account.rate = rate;
    }
    public int getId() {
        return id;
    }
    public static double getMinMoney() {
        return minMoney;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password=" + password +
                ", balance=" + balance +
                '}';
    }
}
