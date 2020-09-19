package cn.tedu.demo;

public class StudentTest {

	public static void main(String[] args) {
		Student stu = new Student("小明", 18);
		stu.info();
		System.out.println(stu.toString());
		Student stu1 = new Student("小花", 19,"新华中学");
		stu1.info();
		Student stu2 = new Student("晓东", 20,"第一中学","计算机");
		stu2.info();
		System.out.println(stu2.toString());

	}

}
