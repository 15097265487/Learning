package cn.tedu.demo1;

public class SalariedEmployee extends Employee {
	private double monthlySalary;//月薪
	private int workingDay;//本月出勤天数
	private int totalDays;//本月总工作日天数，除了周末和假期

	public SalariedEmployee(int number, String name, MyDate birthday, double monthlySalary, int workingDay,
			int totalDays) {
		super(number, name, birthday);
		this.monthlySalary = monthlySalary;
		this.workingDay = workingDay;
		this.totalDays = totalDays;
	}

	public SalariedEmployee(int number, String name, int year, int month, int day, double monthlySalary, int workingDay,
			int totalDays) {
		super(number, name, new MyDate(year, month, day));
		this.monthlySalary = monthlySalary;
		this.workingDay = workingDay;
		this.totalDays = totalDays;
	}

	public SalariedEmployee(int number, String name, MyDate birthday) {
		super(number, name, birthday);
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public int getWorkingDay() {
		return workingDay;
	}

	public void setWorkingDay(int workingDay) {
		this.workingDay = workingDay;
	}

	public int getTotalDays() {
		return totalDays;
	}

	public void setTotalDays(int totalDays) {
		this.totalDays = totalDays;
	}

	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return monthlySalary*workingDay/totalDays;
	}

	@Override
	public String toString() {
		return super.toString() + "月薪:" + monthlySalary + "      " + "本月出勤天数" + workingDay + "      " + "本月总工作日天数"
				+ totalDays;
	}

	
}