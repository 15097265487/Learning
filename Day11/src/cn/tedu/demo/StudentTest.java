package cn.tedu.demo;

public class StudentTest {

	public static void main(String[] args) {
		Student stu = new Student("С��", 18);
		stu.info();
		System.out.println(stu.toString());
		Student stu1 = new Student("С��", 19,"�»���ѧ");
		stu1.info();
		Student stu2 = new Student("����", 20,"��һ��ѧ","�����");
		stu2.info();
		System.out.println(stu2.toString());

	}

}
