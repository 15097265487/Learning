package cn.tedu.test;

public class Student {

		String name;
		int age;
		String major;
		String inters;
		public void say() {
			System.out.println(name+","+age+","+major+","+inters);
			return;
	}
		public static void main(String[] args) {
			Student s =new Student();
			s.say();//调用出来默认值
		}

}
