package cn.tedu.exer;

public class Kids extends ManKind{
	private int yearsOid;//����
	
	public Kids() {//������
		
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
		System.out.println("ѧ��ֻ��ѧϰ��Ӧ�ù���");
	}
	public void printAge() {
		System.out.println("I am "+yearsOid+" years");
	}

}
