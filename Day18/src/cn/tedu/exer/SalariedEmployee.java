package cn.tedu.exer;

public class SalariedEmployee extends Employee{
	private double monthlySalary;//月工资

	public SalariedEmployee() {
		super();
	}
	public SalariedEmployee(String name, int number, MyDate brithday, double monthlySalary) {
		super(name, number, brithday);
		this.monthlySalary = monthlySalary;
		
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	@Override
	public double earning() {//重写抽象类
		return monthlySalary;
	}
	@Override
	public String toString() {
		return "SalariedEmployee [monthlySalary=" + monthlySalary + ", toString()=" + super.toString() + "]";
	}
	
}
