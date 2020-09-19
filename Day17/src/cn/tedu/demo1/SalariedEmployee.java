package cn.tedu.demo1;

public class SalariedEmployee extends Employee {
	private double monthlySalary;//��н
	private int workingDay;//���³�������
	private int totalDays;//�����ܹ�����������������ĩ�ͼ���

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
		return super.toString() + "��н:" + monthlySalary + "      " + "���³�������" + workingDay + "      " + "�����ܹ���������"
				+ totalDays;
	}

	
}