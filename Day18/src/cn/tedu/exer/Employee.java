package cn.tedu.exer;

public abstract class Employee {
	private String name;//����
	private int number;//����
	private MyDate brithday;//����
	//���췽��
	public Employee() {
		super();
	}
	public Employee(String name, int number, MyDate brithday) {
		super();
		this.name = name;
		this.number = number;
		this.brithday = brithday;
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
	//���󷽷�
	public abstract double earning();
	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + ", brithday=" + brithday .toDateString()+ "]";//�������������ֵַ
	}
}
