package cn.tedu.demo;

public class Person {

		String name;
		int age;
		int sex;//1:�������� 0��ʾŮ��
		public void study() {
			System.out.println("stding");
		
	    }
		public void showAge() {
			System.out.println("age"+age);
		}
		public int addAge(int i) {
			age += i;
			return age;
		}
		
    }

