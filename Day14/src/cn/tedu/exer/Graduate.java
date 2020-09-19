package cn.tedu.exer;

public class Graduate extends Student{
	protected String major= "IT";
	
	public String getInfo() {
		return "name"+name+"\nage"+age+"\nSchool"+School+"\nmajor"+major;
	}
	

}
