package cn.tedu.exer;

public class Student extends Person{
	protected String School = " hc";
	
	public String getInfo() {
		return "name"+name+"age"+age+"School"+School;
	}

}
