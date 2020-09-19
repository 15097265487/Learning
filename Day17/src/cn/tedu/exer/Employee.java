package cn.tedu.exer;
//抽象类，不能被实例
public abstract class Employee {
	private String name;
	private int id;
	private double salary;//工资
	
	
	public Employee() {
		super();
	}
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	//抽象方法
	public abstract void work();
}
class CommonEmployee extends Employee{
	
	public void work() {
		System.out.println("普通员工");
	}
}
class Manager extends Employee{
	private double bonus;
	
	public Manager() {
		super();
	}
	public Manager(String name, int id, double salary, double bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}
	public void work() {
		System.out.println("管理员");
	}
	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + "]";
	}
	

}

