package cn.tedu.exer;

public class KidsTest {

	public static void main(String[] args) {
		Kids k = new Kids();//创建对象，实例化
		k.setSalary(0);
		k.setSalary(0);
		k.setYearsOid(18);
		k.printAge();
		
		k.employeed();//工资
		k.manOrWoman();//性别
		
		k.toString();
		System.out.println(k.toString());

	}

}
