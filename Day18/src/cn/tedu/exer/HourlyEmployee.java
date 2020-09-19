package cn.tedu.exer;

public class HourlyEmployee extends Employee{
	private double wage;
	private double hour;
	
	public HourlyEmployee() {
		super();
	}
	public HourlyEmployee(double wage, double hour) {
		super();
		this.wage = wage;
		this.hour = hour;
	}
	public HourlyEmployee(String name, int number, MyDate brithday, double wage, double hour) {
		super(name, number, brithday);
		this.wage = wage;
		this.hour = hour;
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
	public double earning() {
		return wage*hour;
	}
	@Override
	public String toString() {
		return "HourlyEmployee [小时工资=" + wage + ", 时间=" + hour + ", toString()=" + super.toString() + "]";
	}
}
