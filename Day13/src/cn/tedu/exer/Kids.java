package cn.tedu.exer;

public class Kids extends ManKind{
	private int yearsOid;//属性
	
	public Kids() {//构造器
		
	}
	public Kids(int yearsOid) {
		this.yearsOid = yearsOid;
	}
	public int getYearsOid() {
		return yearsOid;
	}
	public void setYearsOid(int yearsOid) {
		this.yearsOid = yearsOid;
	}
	@Override
	public void employeed() {
		System.out.println("学生只能学习不应该工作");
	}
	public void printAge() {
		System.out.println("I am "+yearsOid+" years");
	}

}
