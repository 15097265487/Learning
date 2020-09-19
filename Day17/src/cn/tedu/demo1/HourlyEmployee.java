package cn.tedu.demo1;

public class HourlyEmployee extends Employee{
	private double wage;
	private double hour;
	
	public HourlyEmployee(int i, String string, MyDate myDate, int j, int k) {
		super();
	}
	public HourlyEmployee(double wage, double hour) {
		super();
		this.wage = wage;
		this.hour = hour;
	}
	
	public HourlyEmployee(int i, String string, int j, int k, int l, int m, int n) {
		// TODO Auto-generated constructor stub
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getHour() {
		return hour;
	}
	public void setHour(double hour) {
		this.hour = hour;
	}
	@Override
	public double earnings() {
		return wage*hour;
	}
	@Override
	public String toString() {
		return super.toString() + '\t' + "时薪：" + wage + "      "+ "工作的小时：" + hour;
	}
	

}
