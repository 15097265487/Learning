package cn.tedu.demo1;

import java.util.Date;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	public MyDate() {
		super();
	}
	public MyDate(int year2, int month2, int day2) {
		super();
		this.year = year2;
		this.month = month2;
		this.day = day2;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String toDateString() {
		return "\t" + year + "Äê" + month + "ÔÂ" + day + "ÈÕ"+'\t';
	}
}

