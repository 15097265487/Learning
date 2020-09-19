package cn.tedu.exer;

public class ManKind {
	private int sex;//性别
	private int salary;//工资
	
	//构造器
	public ManKind() {
	}
	public ManKind(int sex, int salary) {
		this.sex = sex;
		this.salary = salary;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	//性别
	public void manOrWoman() {
		if(sex==1) {
			System.out.println("man");
		}else if(sex==0){
			System.out.println("woman");
		}
	}
//	工资
	public void employeed() {
//		if(salary==0) {
//			System.out.println("no job");
//		}else {
//			System.out.println("job");
//		}
		//或
		String jobInfo = salary ==0?"no job":"job";
		System.out.println(jobInfo);
	}
	
}
