package cn.tedu.exer;

public abstract class Employee {
	private String name;//姓名
	private int number;//工号
	private MyDate brithday;//生日
	//构造方法
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
	//抽象方法
	public abstract double earning();
	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + ", brithday=" + brithday .toDateString()+ "]";//不引用则输出地址值
	}
}
