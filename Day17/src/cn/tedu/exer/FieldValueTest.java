package cn.tedu.exer;
/*
 * 	�����Կ��Ը�ֵ��λ��
 * 	��Ĭ�ϳ�ʼ��
 * 	����ʾ��ʼ��   /  ���ڴ�����и�ֵ
 * 	�ܹ������г�ʼ��
 * 	�ݶ���.���ԣ�����.����
 * 	
 * 	�Ⱥ�˳�򣺢�--->��/��--->��--->��
 * 	
 */

public class FieldValueTest {

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.age);
	}
}
class Person{
	//int age = 12;��ʾ��ʼ��
	{
		age=100;
	}
	int age = 12;
}
