package cn.tedu.demo1;

import java.util.Date;

public abstract class Employee {
	private String name;
	private int number;
	private MyDate brithday;
	
	public Employee() {
		super();
	}
	public Employee(int number, String name, MyDate brithday) {
		super();
		this.name = name;
		this.number = number;
		this.brithday = brithday;
	}
	public Employee(int number, String name, int year, int month, int day) {
		super();
		this.number = number;
		this.name = name;
		this.brithday = new MyDate(year, month, day);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public MyDate getBrithday() {
		return brithday;
	}
	public void setBrithday(MyDate brithday) {
		this.brithday = brithday;
	}
	
	public abstract double earnings();//³éÏó·½·¨
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + ", brithday=" + brithday + "]";
	}
}

