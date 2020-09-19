package cn.tedu.exer;

public class InstanceTest {

	public static void main(String[] args) {
		InstanceTest t=new InstanceTest();
		t.method(null);
		

	}
	public void method(Person e) {
		e.getInfo();
//		if(e instanceof Person) {
//			System.out.println("a person");
//		}else if(e instanceof Student) {
//			System.out.println("a student");
//		}else if(e instanceof Graduate) {
//			System.out.println("a graduate");
//			System.out.println("a person");
//			System.out.println("a student");
//		}
		if(e instanceof Graduate) {
			System.out.println("a graduate");
		}
		if(e instanceof Student) {
			System.out.println("a student");
		}
		if(e instanceof Person) {
			System.out.println("a person");
		}
	}
	

}
